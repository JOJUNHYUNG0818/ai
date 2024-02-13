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
