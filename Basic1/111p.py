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