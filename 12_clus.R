mydata=iris[,1:4]

fit= kmeans(x=mydata,centers=3)
fit
fit$cluster

dim(iris)

fit$cluster # 군집 내용
fit$centers # 군집 중심점의 평균
fit$size    # 군집의 갯수

# 군집 시각화
library(cluster)
clusplot(mydata, fit$cluster, color = T,shade = T,labels=2,lines=0)

subset(mydata,fit$cluster==3)

# 표준화 하기
std=function(x){
  return((x-min(x))/(max(x)-min(x)))
}

mydata=apply(iris[,1:4],2,std)
mydata
ds=data.frame(name=c('A','B','C'), 키=c(180,170,165), 시력=c(1.2,0.9,0.7))
ds
ds.std=apply(ds[,-1],2,std)
ds.std

######
##분류
######

library(class)
dim(iris)

tr.idx=c(1:25,51:75,101:125)
ds.tr=iris[tr.idx,1:4]
ds.tr
ds.ts=iris[-tr.idx,1:4]
ds.ts
cl.tr=factor(iris[tr.idx,5])
cl.tr
cl.ts=factor(iris[-tr.idx,5])
cl.ts

pred=knn(ds.tr,ds.ts,cl.tr,k=3,prob=TRUE)
pred

acc=mean(pred==cl.ts)
acc
table(pred,cl.ts)

# 1. R에서 제공하는 Seatbelts 데이터셋에 대해 k-평균 군집화를 실시하고 결과를 그래프로 출력하시오.
# 
# • 군집의 수는 2로 한다.
# 
# • Seatbelts 데이터셋에서 마지막에 있는 law 열은 제외하고 군집화를 실행한다.
# 
# • Seatbelts는 각 변수(열)의 값들의 단위의 차이가 많이 나기 때문에 0~1 표준화를 실시한 후 군집화를 실행한다.

head(Seatbelts)
class(Seatbelts)
ds=Seatbelts[,-8]
head(ds)
ds.1=apply(ds,2,std)
head(ds.1)
fit=kmeans(x=ds.1,centers=2)
fit

library(cluster)
clusplot(ds.1,fit$cluster,color=T,shade = T,labels = 1,lines = 1)

# 2. mlbench 패키지에서 제공하는 Sonar 데이터셋에 대해 k-평균 군집화를 실시하고 결과를 그래프로 출력하시오. 

library(mlbench)
data("Sonar")
head(Sonar)
ds=Sonar[,-61]
ds
ds.1=apply(ds,2,std)
ds.1
fit=kmeans(x=ds.1,centers = 2)
library(cluster)
clusplot(ds.1,fit$cluster,color = T,shade = T,labels = 1,lines=1)

# 3. R에서 제공하는 swiss 데이터셋에 대해 k-평균 군집화를 실시하고 결과를 그래프로 출력하시오.
head(swiss)
ds.sw=apply(swiss,2,std)
ds.sw
fit=kmeans(x=ds.sw,centers = 3)
fit
clusplot(ds.sw,fit$cluster,color = T,shade = T,labels = 1,lines = 1)



# 4. R에서 제공하는 rock 데이터셋에 대해 k-평균 군집화를 실시하고 결과를 그래프로 출력하시오.
head(rock)
ds.ro=apply(rock,2,std)
fit=kmeans(x=ds.ro,centers = 3)
fit
clusplot(ds.ro,fit$cluster,color = T,shade = T,labels = 1,lines = 1)

# 5. mlbench 패키지에서 제공하는 Soybean 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.
library(mlbench)
data(Soybean)
head(Soybean)
ds.soy=Soybean[complete.cases(Soybean),]
head(ds.soy)

idx.H=seq(1,nrow(ds.soy),2)

# 학습문제 (훈련용 데이터)
ds.train.question=ds.soy[-idx.H,2:36]
head(ds.train.question)

# 학습문제 답안지
ds.train.answer=ds.soy[-idx.H,1]
ds.train.answer

# 시험문제
ds.test.question=ds.soy[idx.H,2:36]
# 시험문제 답안지
ds.test.answer=ds.soy[idx.H,1]
ds.test.answer
# k-최근접 이웃에서 k를 3, 5, 7로 다르게 하여 예측 정확도를 비교한다.
library(class)
pred=knn(ds.test.question,ds.test.question,ds.train.answer,k=3)
pred
mean(pred==ds.test.answer)


#------
#k-fold 교차검증 knn 예측을 높이기 위해서
#------
install.packages('cvTools')
library(cvTools)
k=10
folds=cvFolds(nrow(iris), K=k)

acc= c()
for(i in 1:k){
  ts.idx=folds$which==i
  ds.tr=iris[-ts.idx,1:4]
  ds.ts=iris[ts.idx,1:4]
  cl.tr=factor(iris[-ts.idx,5])
  cl.ts=factor(iris[ts.idx,5])
  
  pred=knn(ds.tr,ds.ts,cl.tr,k=5)
  acc[i]=mean(pred==cl.ts)
}

acc
mean(acc)

# 7. mlbench 패키지에서 제공하는 BreastCancer 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.

library(mlbench)

data("BreastCancer") # 데이터셋 불러오기
head(BreastCancer)
dim(BreastCancer)
head(BreastCancer.1)
BreastCancer.1=BreastCancer[complete.cases(BreastCancer),]
head(BreastCancer.1)
k=5
folds=cvFolds(nrow(BreastCancer.1),K=k)
acc=c()
for(i in 1:k){
  ts.idx=folds$which==i
  ds.tr=BreastCancer.1[-ts.idx,1:10]
  ds.ts=BreastCancer.1[ts.idx,1:10]
  cl.tr=factor(BreastCancer.1[-ts.idx,11])
  cl.ts=factor(BreastCancer.1[ts.idx,11])
  
  pred=knn(ds.tr,ds.ts,cl.tr,k=10)
  acc[i]=mean(pred==cl.ts)
}
acc
mean(acc)

# 8. mlbench 패키지에서 제공하는 PimaIndiansDiabetes 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.


library(mlbench)

data("PimaIndiansDiabetes") # 데이터셋 불러오기
head(PimaIndiansDiabetes)
k=5
folds=cvFolds(nrow(PimaIndiansDiabetes),K=k)
acc=c()
for(i in 1:k){
  ts.idx=folds$which==i
  ds.tr=PimaIndiansDiabetes[-ts.idx,1:8]
  ds.ts=PimaIndiansDiabetes[ts.idx,1:8]
  cl.tr=factor(PimaIndiansDiabetes[-ts.idx,9])
  cl.ts=factor(PimaIndiansDiabetes[ts.idx,9])
  
  pred=knn(ds.tr,ds.ts,cl.tr,k=10)
  acc[i]=mean(pred==cl.ts)
}

acc
mean(acc)

# 9. mlbench 패키지에서 제공하는 Vehicle 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.

library(mlbench)
data("Vehicle") # 데이터셋 불러오기
head(Vehicle)
dim(Vehicle)
k=3
folds=cvFolds(nrow(Vehicle),K=k)
acc=c()
for(i in 1:k){
  ts.idx=folds$which==i
  ds.tr=Vehicle[-ts.idx,1:18]
  ds.ts=Vehicle[ts.idx,1:18]
  cl.tr=factor(Vehicle[-ts.idx,19])
  cl.ts=factor(Vehicle[ts.idx,19])
  
  pred=knn(ds.tr,ds.ts,cl.tr,k=3)
  acc[i]=mean(pred==cl.ts)
}
acc
mean(acc)
# 10. mlbench 패키지에서 제공하는 Vowel 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.

library(mlbench)
data("Vowel") # 데이터셋 불러오기
head(Vowel)
dim(Vowel)
k=5
folds=cvFolds(nrow(Vowel),K=k)
acc=c()
for(i in 1:k){
  ts.idx=folds$which==i
  ds.tr=Vowel[-ts.idx,1:10]
  ds.ts=Vowel[ts.idx,1:10]
  cl.tr=factor(Vowel[-ts.idx,11])
  cl.ts=factor(Vowel[ts.idx,11])
  
  pred=knn(ds.tr,ds.ts,cl.tr,k=5)
  acc[i]=mean(pred==cl.ts)
}

acc
mean(acc)
