#98
"""
x=int(input("정수를 입력하세요"))
if x>0:
    print('양수')
print(f"{x}")


month = int (input("월: "))
if 1<=month<=3:
    print("1사분기")
elif 4<=month<=6:
    print("2사분기")
elif 7<=month<=9:
    print("3사분기")
elif 10<=month<=12:
    print("4사분기")
"""

"""
age = 67
ticket = 2000

if age >65 :
    ticket = 0

print(f"나이 : {age}며, 티켓값 {ticket}원 입니다.")

birth = int(input("태어난 연도?: "))
age = 2024-birth
ticket = 2000
if age > 65 :
    ticket = 0

print(f"나이 : {age}며, 티켓값 {ticket}원 입니다.")
"""

age = 41

if age>60:
    ticket = 0
elif 40<=age<=60:
    ticket=1000
elif 30<=age<=39:
    ticket=1500
elif 20<=age<=29:
    ticket=2000
elif 10<age<20:
    ticket=2500
elif age<=10:
    ticket=0
"""
print(f"나이: {age}세에 티켓값은 {ticket}원입니다.")

birth = int(input("생년을 입력: "))
age = 2023-birth

if birth >2023 :
    ticket=0
    print("올해는 2023년입니다. 다시입력해주세요")
else :
    if age>60:
        ticket = 0
    elif 40<=age<=60:
        ticket=1000
    elif 30<=age<=39:
        ticket=1500
    elif 20<=age<=29:
        ticket=2000
    elif 10<age<20:
        ticket=2500
    elif age<=10:
        ticket=0
print(f"나이: {age}세에 티켓값은 {ticket}원입니다.")
"""
"""
yn = "y"
sum= 0
while(yn=="y"):
    
    que = input("원하는 한글 단어를 쓰시오: ")
    ans = input(f"{que}의 영어 단어를 쓰시오: ")

    result1 = "딩동댕 참 잘했어요"
    result2= "땡! 틀렸습니다."

    if que=="사자" and ans =="lion":
     print(result1)
     sum =sum+1
    elif que=="오렌지" and ans== "orrage":
     print(result1)
     sum =sum+1
    else :
        print(result2)
    yn=input("다시하시겠습니까(y,n)")

print(f"점수는 {sum}점입니다.")
"""

my_string = input("단어입력")
arr1 = []
for i in range(len(my_string)):
    arr1.append(my_string[i:])
    arr1.sort()
print(arr1[1])



