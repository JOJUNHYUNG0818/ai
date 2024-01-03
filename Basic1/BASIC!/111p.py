"""
start =int(input("시작수는?: "))
end = int(input("끝수는?: "))
num = int(input("정수를 입력하세요.: "))

result1 = f"{num}은 {start}와 {end}사이에 있다."
result2 = f"{num}은 {start}와 {end}사이에 없다."

if start<=num<=end:
    print(result1)
else:
    print(result2)
"""
"""
# 난수(규칙이 없는 수) 구하기
import random
num = random.randrange(1,51)
answer = True
sum = 0
while(answer):
    mynum = int(input("답은?"))
    if mynum==num :
        print("정답입니다.")
        answer=False
    elif mynum<num:
        print(f"{mynum}보다 큽니다")
        sum=sum+1
    elif mynum>num:
        print(f"{mynum}보다 작습니다.")
        sum=sum+1
print(f"{sum}만에 맞추셨습니다.")
"""
#3-2
month= input("월을 숫자로 입력하세요: ")

if month =="3" or month == "4" or month == "5":
    print(f"{month}는 봄입니다.")
elif month =="6" or month == "7" or month == "8":
    print(f"{month}는 여름입니다.")
elif month =="9" or month == "10" or month == "11":
    print(f"{month}는 가을입니다.")
elif month =="12" or month == "1" or month == "2":
    print(f"{month}는 겨울입니다.")

#3-3
a=input("주민번호 뒷자리중 첫번째 숫자 입력: ")
if a=="1":
    print("남자입니다.")
elif a=="2":
    print("여자입니다.")

#3-4
char = input("영문 대문자 또는 소문자 하나를 입력하세요:")
char2 = char.upper()

if char2 == "A" or "E" or "I"or "O"or"U":
    print(f"{char}는 모음")
else:
    print(f"{char}는 자음")

#3-5
height = int(input("키는?: "))
weight = int(input("몸무게는?: "))

s =(height-100)*0.9

print("="*50)
print("키:",height)
print("몸무게:",weight)

if weight>s:
    print("다이어트")
else:
    print("표준 또는 마름")

#3-6
print("아르바이트 급여 계산 프로그램")
print("*시급")
print("-주간 근무: 9500원")
print("-야간근무 : 주간 시급 *1.5")
print()

hourPay=9500

a = int(input("주간근무=1 / 야간근무=2 를 입력해주세요"))
workTime =int(input("근무 시간을 입력해주세요.: "))

if a==1:
    day_night = "주간"
    pay = hourPay*workTime
else:
    day_night= "야간"
    pay=hourPay*workTime*1.5

print("%s에 근무시간 %d는 금액은 총 %d원입니다"%(day_night,workTime,pay))





