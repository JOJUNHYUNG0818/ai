favorite <- c('WINTER', 'SUMMER', 'SPRING', 'SUMMER', 'SUMMER','FALL', 'FALL', 'SUMMER', 'SPRING', 'SPRING')
table(favorite)# 도수분포표
table(favorite)/length(favorite)

ds<-table(favorite)
barplot(ds)
pie(ds)

#단일 변수의 연속형 자료형
weight=c(60,62,64,65,68,69)
weight.heavy<-c(weight,120)
weight.heavy

#산술평균
mean(weight)
mean(weight.heavy)

#중위수 중앙값
median(weight)
median(weight.heavy)

#사분위수
mydata=c(60,62,64,65,68,69,120)
quantile(mydata)
quantile(mydata,(0:10)/10) #10퍼간격
summary(mydata)

var(mydata) #분산
sd(mydata) #표준편차
range(mydata) #값의 범위
diff(range(mydata)) #최댓값 , 최솟값 차이
hist(mydata)
hist(mydata, main="점수",xlab = '점수', ylab = '갯수', border = 'blue',col = 'green',
     breaks=4)

boxplot(mydata)
boxplot.stats(mydata)

unique(iris$Species)
iris
class(iris)
boxplot(Petal.Length~Species, data=iris, main='붓꽃의 품종별 꽃잎길이',
        xlab='붓꽃 품종',
        ylab='붓꽃 길이(cm)')


par(mfrow=c(2,2)) # 그래프 총 2*2 행렬로 4개 출력가능
par(mfrow=c(1,1)) # 다시 되돌리기

#1-1
class(esoph)
head(esoph)
tabaco<-esoph[,'tobgp']
tabaco
#1-2
unique(tabaco)
#1-3
aday<-table(tabaco)
#1-4
barplot(aday)


#2-1
result=c('P','P','F','P','F','P','F','P','P','F')
#2-2
score=table(result)
#2-3
barplot(score)
#2-4
pie(score)

#3-1
season=c('여름','겨울','봄','가을','여름','가을','겨울','여름'
         ,'여름','가을')
#3-2
season.1=table(season)
#3-3
barplot(season.1)
#3-4
pie(season.1)

#4-1
score=c(90,85,73,80,85,65,78,50,68,96)
names(score)<-c('KOR','ENG','ATH','HIST','SOC','MUSIC','BIO',
                'EARTH','PHY','ART')
#4-2
score
#4-3
mean(score)
median(score)
#4-4
sd(score)
#4-5
names(score[score==max(score)])
#4-6
boxplot(score)
boxplot.stats(score)
#4-7
barplot(score,main='학생성적',col='purple')
# (1) 중량(wt)의 평균값, 중앙값, 절사평균값(절사범위: 15%), 표준편차를 각각 구하시오.
class(mtcars)
wt=mtcars[,'wt']
wt
mean(wt)
median(wt)
mean(wt,trim=0.15)
sd(wt)
# (2) 중량(wt)에 대해 summary( ) 함수의 적용 결과를 출력하시오.
summary(wt)
# (3) 실린더수(cyl)에 대해 도수분포표를 출력하시오.
cyl=mtcars[,'cyl']
table(cyl)
# (4) 앞에서 구한 도수분포표를 막대그래프로 출력하시오.
barplot(cyl) 
# (5) 중량(wt)의 히스토그램을 출력하시오.
hist(cyl)
# (6) 중량(wt)에 대해 상자그림을 출력하시오.(단, 상자그림으로부터 관찰할 수 있는 정보를 함께 출력하시오.)
boxplot(wt) 
# (7) 배기량(disp)에 대한 상자그림을 출력하시오.(단, 상자그림으로부터 관찰할 수 있는 정보를 함께 출력하시오.)
disp=mtcars[,'disp']
boxplot(disp)
# (8) 기어수(gear)를 그룹 정보로 하여 연비(mpg) 자료에 대해 상자그림을 작성하고, 각 그룹의 상자그림을 비교하여 관찰할 수 있는 것이 무엇인지 나타내시오.
slq=mtcars[,c('gear','mpg')]
slq
table(slq)
boxplot(slq)

# 6. R에서 제공하는 trees 데이터셋에 대해 다음 문제를 해결하기 위한 R 코드를 작성하시오.

# (1) trees 데이터셋의 앞쪽 일부 데이터만 출력하시오.
head(trees) 
# (2) 나무 지름(Girth)의 평균값, 중앙값, 절사평균값(절사범위: 15%), 표준편차를 각각 구하시오.
girth=trees[,'Girth'] 
mean(girth)
median(girth)
mean(girth,trim=0.15)
sd(girth)
# (3) 나무 지름(Girth)에 대해 히스토그램을 작성하시오.
gt=table(girth)
hist(gt)
# (4) 나무 지름(Girth)에 대해 상자그림을 작성하시오.
boxplot(gt) 
# (5) 나무 높이(Height)의 평균값, 중앙값, 절사평균값(절사범위: 15%), 표준편차를 각각 구하시오.
Height=trees[,'Height'] 
mean(Height)
median(Height)
mean(Height,trim=0.15)
sd(Height)
# (6) 나무 높이(Height)에 대해 히스토그램을 작성하시오.
hist(Height) 
# (7) 나무 높이(Height)에 대해 상자그림을 작성하시오.
boxplot(Height)

# 7. R에서 제공하는 Orange 데이터셋에 대해 다음 문제를 해결하기 위한 R 코드를 작성하시오.
# 
# (1) Orange 데이터셋의 앞쪽 일부 데이터만 출력하시오.
head(Orange)
# (2) 나무 연령(age)의 평균값, 중앙값, 절사평균값(절사범위: 15%), 표준편차를 각각 구하시오.
age=Orange[,'age'] 
mean(age)
median(age)
mean(age,trim=0.15)
sd(age)
# (3) 나무 연령(age)에 대해 히스토그램을 작성하시오.
hist(age)
# (4) 나무 연령(age)에 대해 상자그림을 작성하되 그룹(Tree)을 구분하여 작성하시오.
boxplot(age,xlab='Tree')
# (5) 나무 둘레(circumference)의 평균값, 중앙값, 절사평균값(절사범위: 15%), 표준편차를 각각 구하시오.(단, 그룹(Tree) 번호 2는 제외하시오.)
circumference=Orange[,'circumference'] 
mean(circumference)
median(circumference)
mean(circumference,trim=0.15)
sd(circumference)
# (6) 나무 둘레(circumference)에 대해 히스토그램을 작성하시오.(단, 그룹(Tree) 번호 2는 제외하시오.)
hist(circumference) 
# (7) 나무 둘레(circumference)에 대해 상자그림을 작성하되 그룹(Tree)을 구분하여 작성하시오.
boxplot(circumference,xlab='Tree')
