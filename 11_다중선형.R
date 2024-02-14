# 다중선형 회귀 분석
install.packages('car')
library(car)
head(Prestige)
class(Prestige)

newdata=Prestige[,c(1:4)]
plot(newdata, pch=16, col='blue',main='Matrix Scatterplot')

mod1=lm(income~education+prestige+women,data=newdata)
summary(mod1)

install.packages('MASS')
library('MASS')
newData2=Prestige[,1:4]
head(newData2)
mod2=lm(income~education+prestige+women+census,data=newdata2)
mod3=stepAIC(mod2)
mod3
summary(mod3)

education = 12.26;women=4.02;Prestige=69.1
y1=177.2*education+(-50.9)*women+141.4*Prestige+(-253.8)

y2=(-50.9)*women+141.4*Prestige+(-253.8)

y1
y2


# 4. state.x77 데이터셋에 대해 다음의 문제를 해결하는 R 코드를 작성하시오.
# 
# (1) 문맹률(Illiteracy)과 고등학교 졸업률(HS.Grad))로 1인당 소득(Income)을 예측하는 다중선형 회귀모델을 만드시오.
head(state.x77)
class(state.x77)
state.1=data.frame(state.x77)
state.1[,2]
mod1=lm(Income~Illiteracy+HS.Grad,state.1)
mod1
#회귀식 y= -52.64*Illiteracy+44.55*HS.Grad+2131.33
summary(mod1)

# (2) 다중선형 회귀모델을 이용하여 state.x77 데이터셋의 문맹률(Illiteracy)과 인구수(Population)로 1인당 소득(Income)을 예측하시오.
mod2=lm(Income~Illiteracy+Population,state.1)
mod2

# (3) (2)에서 예측한 1인당 소득과 실제 state.x77 데이터셋의 1인당 소득(Income)이 얼마나 차이가 나는지 보이시오. (예측값, 실제값, 예측값-실제값을 나타낸다.)
b=coef(mod2)[1]
W1=coef(mod2)[2]
W2=coef(mod2)[3]
pred=W1*state.1$Illiteracy+W2*state.1$Population+b
summary(mod2)
data.frame(pred,state.1[,2],pred-state.1[,2])

# 5. mlbench 패키지의 BostonHousing 데이터셋은 보스턴 지역의 지역 정보 및 평균 주택가격(medv) 정보가 저장되어 있다. 다른 변수들을 이용하여 medv를 예측하는 모델을 만드시오.(단 chas 변수는 모델을 만들 때 제외한다.)
# 
library(mlbench)
 
data(BostonHousing) # 데이터셋 불러오기
# 
# (1) 전체 변수를 이용하여 평균 주택가격(medv)을 예측하는 회귀모델을 만들고 회귀식을 나타내시오.
head(BostonHousing)
class(BostonHousing)
ds<-BostonHousing[,-4]
head(BostonHousing)
mod5=lm(medv~.,ds)
mod5
summary(mod5)
# (2) 평균 주택가격(medv)을 예측하는 데 도움이 되는 변수들만 사용하여 예측하는 회귀모델을 만들고 회귀식을 나타내시오.
library(MASS)
mod5.1=stepAIC(mod5)

# (3) (1), (2)에서 만든 예측모델의 설명력(Adjusted R-squared)을 비교해 보시오.
summary(mod5)
summary(mod5.1)


# 6. mtcars 데이터셋에서 다른 변수들을 이용하여 연비(mpg)를 예측하는 다중 회귀모델을 만드시오.
# 
# (1) 전체 변수를 이용하여 연비(mpg)를 예측하는 회귀모델을 만들고 회귀식을 나타내시오.
class(mtcars)
head(mtcars)
mod6=lm(mpg~.,mtcars)
mod6

# (2) 연비(mpg)를 예측하는 데 도움이 되는 변수들만 사용하여 예측하는 회귀모델을 만들고 회귀식을 나타내시오.
library(MASS) 
mod6.1=stepAIC(mod6)

# (3) (1), (2)에서 만든 예측모델의 설명력(Adjusted R-squared)을 비교하시오.
summary(mod6)
summary(mod6.1)

# 7. UCLA 대학원의 입학 데이터를 불러와서 mydata에 저장한 후 다음 물음에 답하시오. 
# 
mydata <- read.csv("https://stats.idre.ucla.edu/stat/data/binary.csv")
head(mydata)
 
# (1) gre, gpa, rank를 이용해 합격 여부(admit)를 예측하는 로지스틱 모델을 만드시오(0: 불합격, 1:합격).
mod7=lm(admit~.,mydata)
mod7.1=summary(mod7)

# (2) mydata에서 합격 여부(admit)를 제외한 데이터를 예측 대상 데이터로 하여 (1)에서 만든 모델에 입력하여 합격 여부를 예측하고 실제값과 예측값을 나타내시오.
mydata.1=mydata[,-1]
head(mydata.1)
mod7.2=lm(gre~.,mydata.1)
mod7.2
# (3) 만들어진 모델의 예측 정확도를 나타내시오.
summary(mod7.2)
mod7.1

iris.new=iris
iris.new$Species=as.integer(iris.new$Species)
head(iris.new)
mod.iris=glm(Species~.,data=iris.new)
summary(mod.iris)


unknown= data.frame(rbind(c(5.1,3.5,1.4,0.2)))
unknown
names(unknown)=names(iris)[1:4]
unknown

pred=predict(mod.iris,unknown)
pred
round(pred,0)

# 실제 품종명 알아보기
pred=round(pred,0)
pred
levels(iris$Species)
levels(iris$Species)[pred]




# 8. mlbench 패키지의 PimaIndiansDiabetes 데이터셋은 17개의 변수로 당뇨 여부(diabetes)를 예측하기 위한 정보를 담고 있다. 17개의 변수들을 이용하여 당뇨 여부(diabetes)를 예측하는 로지스틱 회귀모델을 만드시오.

library(mlbench)
 
data(PimaIndiansDiabetes) # 데이터셋 불러오기
head(PimaIndiansDiabetes)

# (1) set.seed(100)을 실행한 후 전체 데이터(관측값)에서 임의로 60%를 추출하여 train에 저장하고 나머지 40%는 test에 저장하시오.
set.seed(100)
idx=sample(x=nrow(PimaIndiansDiabetes), size=round(nrow(PimaIndiansDiabetes)*0.6),replace = F)
train=PimaIndiansDiabetes[idx,]
test=PimaIndiansDiabetes[-idx,]
head(train)
head(test)
# (2) train의 데이터로 당뇨여부(diabetes)를 예측하는 로지스틱 회귀모델을 만들고 회귀식을 나타내시오.(당뇨여부(diabetes) 변수는 팩터 타입이므로 정수로 바꾸어야 모델을 만들 수 있다.)
train$diabetes=as.integer(train$diabetes)
train$diabetes
mod8=glm(diabetes~.,data=train)
mod8
mod8.1=summary(mod8)
mod8.1
# (3) 회귀모델에 대해 test의 데이터를 입력하여 당뇨여부(diabetes)를 예측하시오.
test$diabetes=as.integer(test$diabetes)
tmod8=glm(diabetes~.,data=test)
tmod8.1=summary(tmod8)
tmod8.1
pred=predict(tmod8,test[,nrow(test)])
pred
# (4) 예측한 값과 실제 당뇨여부를 비교하여 모델의 정확도(accuracy)가 어느 정도인지 확인하시오.
mean(as.integer(test[,"diabetes"])==round(pred))

library(mlbench)
data("PimaIndiansDiabetes")
#(1)
set.seed(100)
idx.train <- sample(x = nrow(PimaIndiansDiabetes), 
                    size = round(nrow(PimaIndiansDiabetes) * 0.6),  replace = FALSE)
train <- PimaIndiansDiabetes[idx.train,]
test <- PimaIndiansDiabetes[-idx.train,]

dim(train)
dim(test)
#(2)
head(PimaIndiansDiabetes)
mod <- glm(diabetes ~., 
           data = data.frame(PimaIndiansDiabetes[, -ncol(PimaIndiansDiabetes)],
                             diabetes = as.integer(PimaIndiansDiabetes[, ncol(PimaIndiansDiabetes)])))
mod
#(3)
pred.test <- predict(mod, test[, -nrow(test)])

#(4)
mean(as.integer(test[,"diabetes"]) == round(pred.test))


# 9. mlbench 패키지의 Glass 데이터셋은 9개의 변수로 잔디의 종류(Type)를 예측하기 위한 정보를 담고 있다. 9개의 변수들을 이용하여 잔디의 종류(Type)를 예측하는 로지스틱 회귀모델을 만드시오.
# 
library(mlbench)
 
data(Glass) # 데이터셋 불러오기
head(Glass )
# (1) set.seed(100)을 실행한 후 전체 데이터(관측값)에서 임의로 60%를 추출하여 train에 저장하고 나머지 40%는 test에 저장하시오.
set.seed(100)
idx=sample(1:nrow(Glass),nrow(Glass)*0.6)
train=Glass[idx,]
test=Glass[-idx,]
dim(train)
dim(test)
# (2) train의 데이터로 잔디의 종류(Type)를 예측하는 로지스틱 회귀모델을 만들고 회귀식을 나타내시오.(잔디의 종류(Type) 변수는 팩터 타입이므로 정수로 바꾸어야 모델을 만들 수 있다.)
train$Type=as.integer(train$Type)
train.1=glm(train$Type~., data=train)
train.1
summary(train.1)
# (3) 회귀모델에 대해 test의 데이터를 입력하여 잔디의 종류(Type)를 예측하시오.
pred=predict(train.1,test)
pred=round(pred,0)
head(pred)
head(test)
# (4) 예측한 값과 실제 잔디의 종류를 비교하여 모델의 정확도(accuracy)가 어느 정도인지 확인하시오.
 acc<-mean(pred==test$Type)
acc
