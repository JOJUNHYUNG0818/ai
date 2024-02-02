z<-matrix(1:30,nrow = 5,ncol = 6)
z<-matrix(101:200,nrow = 10,ncol=10)
z<-matrix(101:200,nrow = 10,ncol=10,byrow = T)
z
x<-1:5
y<-8:12
sum.xy=cbind(x,y)
sum.xy

sum.xy1 = rbind(x,y)
sum.xy1
n1<-1:5
n2<-101:105
n3<-201:205

sum.n1n2n3<-cbind(n1,n2,n3)
sum.n1n2n3


z
rownames(z)<-c('v1','v2','v3')
z
z[2,4]#5
z[3,2]#3
z[,2]

z[,c(2,3)]

score<-matrix(c(90,85,69,78,85,96,49,95,90,80,70,60),nrow = 4,ncol = 3)
score
rownames(score)<-c('John','Tom','Mark','Jane')
colnames(score)<-c('Eng','Math','Science')
score
score["Jane","Eng"]
score["Tom",]
mean(score[,"Math"])

#학생의 이름은
rownames(score)
rownames(score)[2] #"TOM"
colnames(score)[3]

z<-matrix(12:1,nrow = 3,ncol = 4,byrow = T)
rownames(z)<-c('v1','v2','v3')
colnames(z)<-c('a1','a2','a3','a4')
z
a<-c(1:7)
a<-a[seq(1,7,2)]
a
z<-rbind(z,a)
z[4,]
z[2:4,c('a1','a3')]
rownames(z)[3]

city <- c('서울','도쿄','워싱턴')
rank <- c(1,2,3)
etc<-c(TRUE,TRUE,FALSE)
city.info<-data.frame(city,rank,etc)
city.info

iris
head(iris)

dim(iris) #행 열의 갯수
str(iris) # 구조
unique(iris[,5]) #중복제거
table(iris[,"Species"]) #품종별로 갯수 세기

colSums(iris[ ,-5])
colMeans(iris[,-5])
rowSums(iris[,-5])

state.x77
st<-state.x77
st
st <- data.frame(state.x77)
colnames(st)
rownames(st)
length(colnames(st))
length(rownames(st))
st
str(state.x77)
rowSums(st)
rowMeans(st)
colMeans(st)
colSums(st)
st["Florida", ]
st[,"Income"]
st["Texas","Area"]
st["Ohio",c("Population","Income")]
subset(st, Population>=5000)
subset(st[,c("Population","Income","Area")], Income >=4500)
length(subset(st, Income>=4500))
subset(st, Area>=100000 & Frost>=120)
subset(st, Population<20000 & Murder<12)
mean(subset(st, Illiteracy>=2.0)[,"Income"])
mean(subset(st, Illiteracy<=2.0)[,"Income"])
subset(st, Life.Exp == max(st[,'Life.Exp']))
st['Pennsylvania','Income']
rownames(subset(st,Income>=st['Pennsylvania','Income']))
a<- matrix(1:20,4,5)
b<- matrix(21:40,4,5)

2*a
b-5
a*b

class(iris)
class(state.x77)

class(islands)
class(lh)
is.matrix(iris)
is.data.frame(iris)
st<-data.frame(state.x77)
class(st)
as.iM<-as.matrix(iris)
class(as.iM)
as.iM

iris[,5]
state.x77[,8] 
iris[,'Species']
state.x77["Area"]
name<-c("Tom",'Jane',"Nick")
age<-c(20,23,26)
gender<-c("M","F","M")
height<-c(180,160,175)
student<-c(TRUE,TRUE,FALSE)
human<-data.frame(name,age,gender,height,student)
human
add<-list("Mary",24,"F",155,TRUE)
human<-rbind(human,add)
colnames(human)
mean(human[c('age','height')])
human[c('age','height')]

mean(human[,'age'])
mean(human[,'height'])
colnames(human[,-4])
length(human[,'gender'])
table(human$gender)
setwd("D:/ai/study/r_study")
air<-read.csv('airquality.csv')
air
air3<-read.csv(file.choose())# 대화상자로 파일오픈
iris.setosa <- subset(iris,Species=='setosa')
iris.setosa
write.csv(iris.setosa,'irisfilename.csv')
