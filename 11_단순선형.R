# 단순선형 회귀 분석

#주행속도와 재동거리사이의 회귀식
head(cars)
class(cars)
str(cars)
plot(dist~speed, data=cars)

# 산점도에서 선형관계각 분명하다.
# 주행속도가 증가할수록 재동거리도 증가한다.
# lm(종속변수~독립변수,데이터셋)
# 종속변수는 예측하는것(독립변수에 따라 변하는값)

mod1=lm(dist~speed,cars)
mod1
b=coef(mod1)[1] # y=Wx+b 에서 b값(intercept)
W=coef(mod1)[2] # 3.932409값이 W이다
speed=cars[,1]
pred=W*speed+b
pred

data.frame(pred,cars[,2],pred-cars[,2])

# 1. Loblolly 데이터셋에서 age를 이용해 height를 예측하는 단순선형 회귀모델을 만드시오. 그리고 age가 10, 15, 20일 때 height를 예측하여 보시오.
head(Loblolly)
# y=height x=age
mod2=lm(height~age,Loblolly)
b=coef(mod2)[1]
W=coef(mod2)[2]
# 2. airquality 데이터셋에서 Wind로 Temp를 예측하는 단순선형 회귀모델을 만드시오. 그리고 Wind가 10, 15, 20일 때, Temp를 예측하여 보시오.
airquality 
head(airquality)
mod3 = lm(Temp~Wind,airquality)
mod3
b1=coef(mod3)[1]
W1=coef(mod3)[2]
wind=c(10,15,20)
result1=W1*wind+b1
result1
# 3. pressure 데이터셋에서 온도(temperature)로 기압(pressure)을 예측하는 단순선형 회귀모델을 만드시오. 그리고 온도가 65, 95, 155일 때 기압을 예측하여 보시오.
head(pressure)
mod4=lm(pressure~temperature,pressure )
b2=coef(mod4)[1]
W2=coef(mod4)[2]
tem=c(65,95,155)
result2=W2*tem+b2
result2
