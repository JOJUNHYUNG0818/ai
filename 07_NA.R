# 1. 결측값
z= c(1,2,3,NA,5,NA,8) # NA=결측값
sum(z)
is.na(z) # 결측값=True
sum(z,na.rm = T) # na.rm=T 결측값 빼고
m=mean(z,na.rm = T)
m
sd(z,na.rm = T)
z[is.na(z)]=0
z
z[is.na(z)]=m
z

# 결측값을 대체한 것을 새로운 벡터로 저장하기
z.new = as.vector(z)
z.new

DF= data.frame(x=c(1,2,3), y=c(0,10,NA))
DF
na.omit(DF) # 결측값이 있는 것을 제외하고 정상값만 반환하기
z= c(1,2,3,NA,5,NA,8)
na.omit.new=na.omit(z)
na.omit.new
na.new.ds<-as.vector(na.omit.new)
na.new.ds

x=iris[1:50,]
x[1,2]=NA; x[1,3]=NA; x[2,3]=NA; x[3,4]=NA;   
head(x)

ncol(x)
for(i in 1:ncol(x)){
  this.na <- is.na(x[,i])
  cat(i,'열 ',sum(this.na),'\n')
}

for(i in 1:nrow(x)){
  this.na <- is.na(x[i,])
  cat(i,'행 ',sum(this.na),'\n')
}


# (1) 각 열별로 결측값이 몇 개인지 출력하시오.
ds<-mtcars
ds[2,3]<-NA; ds[3,1]=NA; ds[2,4]=NA; ds[4,3]=NA
for(i in 1:ncol(ds)){
  this.ds <- is.na(ds[,i])
  cat(i,'열 ',sum(this.ds),'\n')
}
# (2) 결측값이 포함된 행들의 데이터를 출력하시오.
idx = c()
for (i in 1:nrow(ds)){
  if(sum(is.na(ds[i,]))>0){
    idx<-c(idx,i)
  }
}
idx
ds[idx,]
# (3) 결측값이 포함된 행은 몇 개인지 출력하시오.
sum(rowSums(is.na(ds))>0)
# (4) 결측값이 포함된 행들을 제외하고 새로운 데이터셋 ds.new를 만들어보시오.
ds.new=ds[complete.cases(ds),]
ds.new


##########
##특이값##
##########

st=data.frame(state.x77)
boxplot(st$Income)
boxplot.stats(st$Income)

boxplot(st$Population)
boxplot.stats(st$Population)$out

Income.out = boxplot(st$Income)$out
Income.out
st$Income[st$Income == Income.out]<-NA
st[,'Income']

popu.out<-boxplot.stats(st$Population)$out
st$Population[st$Population %in% popu.out]<-NA
st$Population


# 2. 다음과 같이 mtcars 데이터셋을 mt에 저장한 후 다음 문제를 해결하기 위한 R 코드를 작성하시오.
#
 mt <- data.frame(mtcars)
 
# (1) mt의 각 변수(열)들에 대해 특이값이 존재하는지 상자그림을 그려 확인하시오.
boxplot(mt)
# (2) 특이값이 존재하는 경우 이상치를 NA로 대체하여 저장하시오.
for(i in 1:ncol(mt)){
  outlier<- boxplot.stats(mt[,i])$out
  if(length(outlier)>0){
    mt[mt[,i]%in%outlier, i]<-NA
  }
}
mt

# mt.out=boxplot.stats(mt[,4])$out
# mt.out
# mt$hp[mt$hp==mt.out]<-NA
# mt
# (3) mt에서 NA가 존재하는 행들을 제거하여 mt2에 저장하시오.
mt2=mt[complete.cases(mt),]
mt2       



# 3. R에서 제공하는 airquality 데이터셋에 대해 다음의 문제를 해결하기 위한 R 코드를 작성하시오.
# 
# (1) airquality를 AQ에 저장하시오.
AQ=airquality
AQ
# (2) AQ에서 열별로 NA의 개수를 출력하시오.
for(i in 1:ncol(AQ)){
  this.AQ <- is.na(AQ[,i])
  cat(i,'열 ',sum(this.AQ),'\n')
}
# (3) AQ에서 행별로 NA의 개수를 출력하시오.
for(i in 1:nrow(AQ)){
  this.AQ <- is.na(AQ[i,])
  cat(i,'행 ',sum(this.AQ),'\n')
}
# (4) AQ에서 NA를 포함하지 않은 행들만 출력하시오.
AQ[complete.cases(AQ),]
# (5) AQ에서 NA를 NA가 속한 열의 평균값으로 치환하여 AQ2로 저장하고, AQ2의 내용을 출력하시오.
# AQ2=c()
# for(i in 1:ncol(AQ)){
#   if(sum(is.na(AQ[,i]))>0){
#     AQ2=c(AQ2,mean(AQ[,i],na.rm = T))
#   }
# }

col.mean = colMeans(AQ,na.rm = T)
col.mean

for(i in 1:ncol(AQ)){
  AQ2[is.na(AQ2[,i]),i]<-col.mean[i]
}
AQ2
mean(AQ[,1],na.rm = T)
mean(AQ[,2],na.rm = T)


########
##정렬##
########
dim(iris)
class(iris)
sa<-head(iris)
sort(sa$Sepal.Length)
order(sa$Sepal.Length)
sa$Sepal.Length



# 4. R에서 제공하는 state.x77 데이터셋에 대하여 다음 문제를 해결하기 위한 R 코드를 작성하시오.
#
# (1) state.x77 데이터셋을 Population(인구수)를 기준으로 오름차순 정렬하시오.
class(state.x77)
dt<-data.frame(state.x77)
sort(dt$Population)
dt[order(dt[,'Population']),]
# (2) state.x77 데이터셋을 Income(소득)을 기준으로 내림차순 정렬하시오.
sort(dt$Income, decreasing = T) 
dt[order(dt[,'Income']),]
# (3) Illiteracy(문맹률)가 낮은 상위 10개 주의 이름과 문맹률을 출력하시오.
temp=state.x77[order(dt[,'Illiteracy'] ),]
head(temp,n=15)
temp[1:10,'Illiteracy']


##########################
##분리 - 그룹별로 분석하기
##########################
str(iris)
sp<-split(iris, iris$Species) # 품종별로 잘라내서 출력
sp
summary(sp)
sp$setosa
sp$versicolor
sp$virginica

# 5. R에서 제공하는 mtcars 데이터셋에 대하여 다음 문제를 해결하기 위한 R 코드를 작성하시오
# 
# (1) mtcars 데이터셋을 gear(기어)의 개수에 따라 그룹을 나누어 mt.gear에 저장하시오.(단, split() 함수를 사용하시오.)
mt.gear<-split(mtcars,mtcars$gear)
mt.gear
# (2) mt.gear에서 gear(기어)의 개수가 4인 그룹의 데이터를 출력하시오.
mt.gear$'4'
# (3) mt.gear에서 gear(기어)의 개수가 3인 그룹과 5인 그룹의 데이터를 합쳐서 mt.gear.35에 저장하고 내용을 출력하시오.
mt.gear35<-subset(mtcars,gear==3 | gear==5)
mt.gear35
# (4) mtcars 데이터셋에서 wt(중량)가 1.5~3.0 사이인 행들을 추출하여 출력하시오
subset(mtcars, wt>=1.5 & wt<=3.0)
