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
