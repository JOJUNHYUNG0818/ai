class(mtcars)
wt=(mtcars[,'wt'])
mpg=(mtcars[,'mpg'])
wt
mpg
plot(wt,mpg,main = '중량-연비 그래프',
     xlab='중량',ylab='연비',col='red',pch=1)

vars=c('mpg','disp','drat','wt')
target=mtcars[,vars]
pairs(target)


head(iris)
iris.2<-iris[,3:4]
iris.2

point=as.numeric(iris$Species) #문자를 숫자형태로 바꿈 pch를 위한것
point
color=c('red','green','blue')
plot(iris.2,main='붓꽃의 꽃잎길이와 너비 관계',pch=c(point),
     col=color)


x=c(2,3,5,6)
y=c(4,3,3,10)

tbl=data.frame(x,y)
tbl
cor(x,y)#상관계수 계산
beers = c(5,2,9,8,3,7,3,5,3,5)
bal <- c(0.1,0.03,0.19,0.12,0.04,0.0095,0.07, 	# 자료 입력
         0.06,0.02,0.05)
tbl=data.frame(beers,bal)
plot(bal~beers,data=tbl,col='red')
res=lm(bal~beers,data=tbl)
res
abline(res)
cor(beers,bal)
tbl<-iris[,1:4]
tbl
plot(tbl)

t1=iris$Petal.Length
t2=iris$Petal.Width
tbl3=data.frame(t1,t2)
plot(t1,t2)
tbl3
res<-lm(t1~t2,data = tbl3)
res
abline(res)
cor(t1,t2)

month=1:12
late=c(5,8,7,9,4,6,12,13,8,6,6,4)
plot(month,late,main='월별 지각생',type='o',lty=3,lwd=2,col='#0f24a1')

install.packages('mlbench')
library(mlbench)
data("BostonHousing")
head(BostonHousing)
dim(BostonHousing)
class(BostonHousing)
str(BostonHousing)

myds<-BostonHousing[,c("crim",'rm','dis','tax','medv')]
#필요한 열만
grp=c()
for(i in 1:nrow(myds)){
  if(myds$medv[i]>=25.0){
    grp[i]<-"H"
  } else if (myds$medv[i]<=17.0){
    grp[i]<-"L"
  }else{
    grp[i]<-"M"
  }
}
grp<-factor(grp)
grp<-factor(grp,levels=c("H","M","L"))

myds<-data.frame(myds,grp)
myds
levels(grp)

str(myds)
table(myds$grp)
dim(myds)
summary(myds[,1:4])

#4. 차트로 그리기 연속형 자료니깐 히스토그램,boxplot
par(mfrow =c(2,3))
for(i in 1:5){
  hist(myds[,i],main=colnames(myds)[i],col='yellow',
       xlab = "변량들",
       ylab = "빈도수")
}
