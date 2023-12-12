# 변수연습
name = "홍길동"
_Name1kk = "다른변수"
name = "이순신"
print(name)
print(type(name)) # type함수는 자료형을 보여준다.
number = 10
print(type(number))
PI=3.14
OK=True
print(type(PI))
print(type(OK))
number = "백점"
print(number)
print(type(number))

# 사칙연산

str1="abc"
str2="def"
print(str1+str2) #문자열을 더해라
# print(str1-str2)
# print(str1*str2)
print(str1*3) #문자열을 3번 반복해라

str3 = str1+str2
print(str3)

number1 = 1; number2=2; number3=3
number4 = number1+number2+number3
number5 = number2*number3
number6 = number2**number3 #거듭제곱
number7 = number3/number2
number8 = number3%number2
print(number,number,number3,sep=" -- ")
print(number4,number5,number6,sep=" == ")
print(number7,number8,sep=" --> ")

ok1 = False # 0
ok2 = True # 1

ok3= ok1+ok2 #or연산 0 + 1
ok4 = ok1-ok2 #xor연산0 - 1
ok5 = ok1*ok2 #and 연산
#ok6 = ok1/ok2
print(ok1,ok2,ok3,ok4,ok5,sep=" >> ")
print(3/5)
a=1/3
print(a)
print("%.2f"%a)
b=1//3 # 나누기 하는데 소수점은 버려라
print(b)

s= "안녕하세요. 반갑습니다"
print(s[0]) 
print(s[7])
print(s[3:5]) # 3 <= index < 5 
print(s[:6])
print(s[4:])

juminNum = "061225-4098745"
#성별 추출하기 4
print(juminNum[7])
#생일 추출하기 2006년 12월 25일
print("20",juminNum[0:2],"년 ",juminNum[2:4],"월 ",juminNum[4:6],"일",sep="")
print(len(juminNum)) #len() 길이구하기

print("-"*100)

a=100
b="abc"
#c=a+b
c=(str)(a)+b
print(type(c))
print(c)