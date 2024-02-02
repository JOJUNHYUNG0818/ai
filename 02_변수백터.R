2+3
2^3
10%%3
log(10)
log(10,base=10)
sqrt(4)
max(10,5,9)
abs(-500)
factorial(5)
pi
sin(pi/2)
name <- '홍길동'
name
name = '이순신'
name
25+99
2*(3+4)
16*25+186*5-67*22
pi = 3.14
pi
10*10*pi
12*12*pi
15*15*pi
log(8,base=2)
x <- c(1,2,3)
y <- c('a','b','c')
y
name = "홍길동"

x<-c(1,3,'a','b') # 문자로 변형
z<-c('a',TRUE) # 문자로 변형
a<-c(1,TRUE,FALSE)
a
num<-1:100
num2 <-c(100:300,400:500)
num3 <- seq(100,200,by=2)
num3
num4<-seq(100,1,by=-2)
num4

help(rep)
rep(1:4,2)
rep(1:4,each=2)
rep(1:5,c(2,3,4,5,6))
rep(TRUE,20)

# 백터 이름 지정하기
score <- c(90,85,70)
score
names(score)<-c('j','q','h')
names(score)
score

# 부분출력
score['j'] # 이름
score[2] # index
score[2:3]
score[c('j','h')]

x<-c(10:15)
y<-20:25
x+y
d<-1:10
sum(d)
mean(d)
length(d)
max(d)
min(d)
sort(d)
sort(d,decreasing = T)
d<-1:9
d[d>5]
d[d>5 & d<8]
d<- 100:200
d[10]
d[1:10]
d[d%%2==1]
d[d%%3==0]
d.20<-d[1:20]
d.20
d.20[d.20!=d.20[5]]
d.20[d.20!=d.20[5] & d.20!=d.20[7] & d.20!=d.20[9]]
absent<-c(10,8,14,15,9,10,15,12,9,7,8,7)
names(absent)<-c('JAN','FEB','MAR','APR','MAY','JUN','JUL',
                 'AUG','SEP','OCT','NOV','DEC')
absent["MAY"]
absent[c("MAY","SEP")]
sum(absent[1:6])
sum(absent[7:12])

#9번
d1<-1:50 
d2<-51:100
length(d1)
d1+d2
d2/d1
sum(d1)
sum(d2)
sum(d1,d2)
mean(d1)
mean(d2)
mean(d2)-mean(d1)
sort(d1,decreasing = TRUE)
d1_1 <- sort(d1[1:10],decreasing = TRUE)
d1_1
d2_1<-sort(d2[1:10],decreasing = TRUE)
d3<-c(d1_1,d2_1)
d3

#10
v1<-51:90 
v1[v1<60]
length(v1[v1<70])
sum(v1[65>v1])
v1[v1>60 & v1<73]
v1[v1%%7==3]
v2<-v1[v1%%7==0]
v2
v1[v1%%7==0]<-0
sum(v1[v1%%2==0])
v1[v1%%2==1 | v1>80]
v1[v1%%(3*5)==0]
v1[v1%%2==0]*2
v1[!v1%%7==0]

#11
people<-c('Bill','20','M',"TRUE",c('Mon','Wed'))
names(people)<-c('name','age','gender','student','day','day')
people

#12
a<-c('Korea','Japan','China','Korea','India','China','Korea')
a.new<-factor(a)
a.new
a.new[4]
levels(a.new)
as.integer(a.new)

ds<-c(90,85,70,84)
my.info <- list(name="Tom", age=60, status=TRUE,score =ds)
my.info[[1]]
my.info$score
my.info[[3]]
my.info$status
my.info$score[1]
a<-4
b<-5
c<-a+b
c

vc.1<-c(95,86,47,55,68)
vc.1
