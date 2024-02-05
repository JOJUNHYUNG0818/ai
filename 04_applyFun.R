for(j in 2:9){
  for(i in 1:9){
    cat( j,'*',i,'=',j*i,'\n')
  }
}

iris
class(iris)
norow<-nrow(iris)
mylabel<-c() # 빈 백터 만들기
for(i in 1:norow){
  if(iris$Petal.Length[i]<=1.6){
    mylabel[i]<-'L'
  }else if(iris$Petal.Length[i]>=5.1){
    mylabel[i]<-'H'
  }else{
    mylabel[i]<-'M'
  }
}
newds <- data.frame(iris$Petal.Length,mylabel)
head(newds)

#1-1
sum<-0
count<-0
for(i in 1:100){
  if(i%%3==0){
    sum=sum+i
    count=count+1
  }
}
sum
count
#2
for(i in 101:200){
  if(i%%12==0){
    print(i) 
  }
}
#3
a<-24
index<-1
while (index<=a) {
  if(a%%index==0){
    print(index)
    index=index + 1
  }else{
    index=index + 1
  }
}
#4
a<-10
index.1<-1
index.2<-1
while(a>=index.1){
  index.2=index.2*index.1
  index.1=index.1+1
}
print(index.2)
#2-1
for(i in 1:6){
  for(j in 1:i){
    cat("*")
  }
  cat("\n")
}

#3-1
a<-9
b<-1
sum<-0
while (i<=9) {
  sum=sum+i*i
  i=i+1
}
print(sum)

#4-1
score<-80
ifelse(score>60,'Pass','Fail')

#apply 함수
apply(iris[,1:4],1,mean)
length(apply(iris[,1:4],1,mean))
apply(iris[,1:4],2,mean)

#7-1
iris
apply(iris[,-5],1,sum)
apply(iris[,-5],2,max)

#8-1
mtcars
apply(mtcars, 2, sum)
apply(mtcars, 2, max)
apply(mtcars, 2, sd)

#함수 
maxfun<-function(x,y){
  num.max<-x
  if(y>x){
    num.max<-y
  }
  return(num.max)
}
maxfun(5,7)

myfunc<-function(x,y){
  sum<-x+y
  mul<-x*y
  div<-x/y
  mod<-x%%y
  return(list(rsum=sum, rmul=mul, rdiv=div, rmod=mod))
}

result<-myfunc(1,2)
result$rsum

source('d:/ai/study/r_study/myfunc.r')
myfu(100,10)

score<-c(76,84,69,50,95,60,82,71,88,84,69)
which(score==69)
which.min(score)
idx<-which(score<=60)
score[idx]<-61
score

idx2<-which(score>80)
score.high<-score[idx2]
score.high

idx3<- which(iris$Petal.Length>5.0)
idx3
iris.big<-iris[idx3,]
iris.big

idx4<-which(iris[,1:4] > 5.0, arr.ind = T)
idx4

head(iris)

#9. 최대 공약수
lgm<-function(x,y){
  for( i in 1:max(x,y)){
    if(x%%i==0 & y%%i==0){
      result<-i;
    }
  }
  return(result)
}
lgm(32,8)

#10.
maxmin<-function(x){
  max<-max(x)
  min<-min(x)
  return(list(rmax=max,rmin=min))
}

v1<-c(7,1,2,8,9)
result<-maxmin(v1)
result$rmax
result$rmin

#11
weight<-c(69,50,55,71,89,64,59,70,71,80)
which.max(weight)
which.min(weight)
which(weight>61 & weight<69)
idx<-which(weight<=60)
weight.2<-weight[idx]
weight.2

#12
mtcars
which.max(mtcars[,'mpg'])
mtcars[20,]

idx2=which(mtcars$wt>=2 & mtcars$wt<=3)
mtcars[idx2,]

idx3=which(mtcars$gear == 3)
mean(mtcars[idx3,'mpg'])

idx4=which(mtcars$wt>=5)
max(mtcars[idx4,'mpg'])
