###########
##셈플링 - sample(데이터셋 , size=갯수, replace=F)
###########

x=1:100
set.seed(100)# 임의의 값을 출출할때
sample(x,size=10,replace = F)
idx = sample(1:nrow(iris),size=20,replace = F)
idx

#8. mtcars 데이터셋에서 10개의 행을 임의로 추출하여 mt10에 저장하고, 나머지 행들은 mt.other에 저장하시오. 그리고 mt10과 mt.other의 내용을 출력하시오.
mt.10=sample(1:nrow(mtcars),size=10,replace = F)
mtcars[mt.10,]
mt.other=mtcars[-mt.10,]
mt.other
#9. iris 데이터셋에서 각 품종별로 10개의 행을 임의로 추출하여 iris.10에 저장하고, iris.10의 내용을 출력하시오. (품종정보와 품종별 행의 개수를 알고 있다고 가정)
idx<-sample(1:nrow(iris),size=10,replace = F)
idx
iris[idx,]


###############
##조합 - combination
###############

combn(1:5,3)


#11. iris 데이터셋에서 3개의 Species(품종)를 2개씩 짝지어 출력하시오.
sp<-unique(iris$Species)
combn(sp,2)

#12. banana, apple, melon,, peach, mango를 3개씩 짝지어 출력하시오.
fruits<-c('banana','apple','melon','peach','mango')
combn(fruits,3)


#####################
##집계 - aggregate(데이터셋, by=그룹명, FUN=함수명)
#####################

aggregate(iris[,1:4],by=list(품종=iris$Species),FUN=mean)
aggregate(iris[,1:4],by=list(품종=iris$Species),FUN=sum)


aggregate(mtcars,by=list(cyl=mtcars$cyl),FUN=mean)

library(mlbench)
data("Ionosphere")
myds<-Ionosphere
myds
aggregate(myds[,3:10],by=list(myds$Class,v1=myds$V1), FUN=sd)

##############
#####병합##### - merge(데이터셋1, 데이터셋2, all=T (왼쪽 외부조인) 
##############  all.x=T (오른쪽 외부조인))

x <- data.frame(name=c('a','b','c'), math=c(90,80,40))
y <- data.frame(name=c('a','b','d'), korean=c(75,60,90))
z=merge(x,y,by=c('name'))
z

z1= merge(x,y,by=c('name'), all=T)
z1

z2= merge(x,y,by=c('name'), all.x=T)
z2

z3= merge(x,y,by=c('name'), all.y=T)
z3

# 
# 14. 다음 문제를 해결하기 위한 R 코드를 작성하시오.
# 
# (1) 제공된 파일 중 subway.csv와 subway_latlong.csv 파일을 읽은 후 병합하여 subway.tot에 저장하시오(병합 기준 열은 STATION_CD와 station).
subway <- read.csv( 'D:/ai/study/r_study_csv/subway.csv', header = TRUE, fileEncoding = "CP949", encoding = "UTF-8")
subway
subway.laclong<-read.csv( 'D:/ai/study/r_study_csv/subway_latlong.csv', header = TRUE, fileEncoding = "CP949")
subway.tot<-merge(subway,subway.laclong, by.x = c('station'),by.y = c('STATION_CD'))
head(subway.tot)
# (2) subway.tot에서 역 이름과 날짜를 기준으로 on_tot(탑승 인원)과 off_tot(하차 인원)을 집계(합계)하여 출력하시오.
agg=aggregate(subway.tot[,c('on_tot','off_tot')],by=list(역이름=subway.tot$stat_name,날짜=subway.tot$income_date),FUN=sum) 
head(agg)
# (3) subway.tot에서 2011년도에 대해서만 역 이름을 기준으로 on_tot(탑승 인원)과 off_tot(하차 인원)을 집계(합계)하여 출력하시오.
year.2011<-subway.tot$income_date>=20110101& subway.tot$income_date<=20111231
year.2011
agg.2011=aggregate(subway.tot[year.2011,c('on_tot','off_tot','income_date')],by=list(역이름=subway.tot$stat_name[year.2011]),FUN=sum) 
agg.2011
# (4) subway.tot에서 2011년도에 대해서 LINE_NUM(호선)별 on_tot(탑승 인원)과 off_
aggregate(subway.tot[year.2011,c('on_tot','off_tot')],
          by=list(호선별=subway.tot$LINE_NUM[year.2011]),
          FUN=sum)
# tot(하차 인원)을 집계(합계)하여 출력하시오.


# 
# 15. 다음의 문제를 해결하기 위한 R코드를 작성하시오.
# 
# 
# 
# (1) 다음과 같이 데이터프레임 authors와 books를 생성하고 authors와 books의 내용을 출력하시오.
authors <- data.frame(
  surname = c("Twein", "Venables", "Tierney", "Ripley", "McNeil"),
  nationality = c("US", "Australia", "US", "UK", "Australia"),
  retired = c("yes", rep("no", 4)))
books <- data.frame(
  name = c("Johns", "Venables", "Tierney", "Ripley", "Ripley", "McNeil"),
  title = c("Exploratory Data Analysis",
            "Modern Applied Statistics ...",
            "LISP-STAT",
            "Spatial Statistics", "Stochastic Simulation",
            "Interactive Data Analysis"),
  other.author = c(NA, "Ripley", NA, NA, NA, NA))
authors
books



# (2) surname과 name을 공통 열로 하여 authors와 books를 병합하여 출력하시오(두 데이터프레임에서 공통 열의 값이 일치하는 것들만 병합).
a1=merge(authors, books, by.x=c('surname'),by.y=('name'),all=T)
a1
# (3) surname과 name을 공통 열로 하여 authors와 books를 병합하여 출력하되 authors의 행들이 모두 표시되도록 하시오.
a2=merge(authors, books, by.x=c('surname'),by.y=('name'),all.x=T)
a2
# (4) surname과 name을 공통 열로 하여 authors와 books를 병합하여 출력하되 books의 행들은 모두 표시되도록 하시오.
a3=merge(authors, books, by.x=c('surname'),by.y=('name'),all.y=T)
a3 
# (5) surname과 other.author를 공통 열로 하여 authors와 books를 병합하여 출력하시오.
a1=merge(authors, books, by.x=c('surname'),by.y=('name'),all=T)
a1
