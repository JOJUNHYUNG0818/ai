swiss
#4-1
class(swiss)
#2
max(swiss["Agriculture"])
subset(swiss,Agriculture==max(swiss["Agriculture"]))
#3
s<-sort(swiss$Agriculture,decreasing = TRUE)
#4
subset(swiss,Catholic>=80)["Agriculture"]
#5
subset(swiss,Examination<20 & Agriculture<50)[c("Examination","Agriculture")]

#5-1
str(state.x77)
st<-data.frame(state.x77)
rich_state<-subset(st, Income>=5000)[c('Income','Population','Area')]
write.csv(rich_state,'d:/ai/study/r_study/rich_state.csv')
#2
ds<-read.csv('d:/ai/study/r_study/rich_state.csv')
ds
#6-1
m<-c(10,40,60,20)
f<-c(21,60,70,30)
score<-cbind(m,f)
#2
colnames(score)<-c("male","female")
score
#3
score[2,]
#4
score[,"female"]
#5
score[3,2]

#7-1
mtcars 
str(mtcars)
#2
dim(mtcars)
#3
colnames(mtcars)
#4
help(mtcars)
#5
subset(mtcars,mpg==max(mpg))
#6
subset(mtcars,gear==4)
subset(mtcars,mpg==min(mpg))
s<-subset(mtcars,gear==4)
s<-subset(s,mpg==min(mpg))
s
#7
mtcars["Honda Civic",c('mpg','gear')]
#8
s<-mtcars['Pontiac Firebird','mpg']
subset(mtcars,mpg>s)
#9
mean(mtcars$mpg)
#10
length(mtcars$gear)
unique(mtcars$gear)

