# 변수사용하기
#1.
주식명 = "삼성전자"
주식싯가 = 50000
주식수 = 10

print("%s 주식 %d주 총평가금액은 %d원 입니다."%(주식명,주식수,주식싯가*주식수))

#2.
시가총액 = "298조"
현재가 = "50000원"
per = 15.79

print(시가총액,현재가,per,sep=" ")

#3.
h="Hello"
p="python"

print(h+"! "+p)

#4.
a="123"
print(type(a))

#5.
num_str = "1234"
print(int(num_str))

#6.
num_str1 ="12.567"
print(float(num_str1))

#7.
num_str2 = 2020
print(int(num_str2)+3)

#8.
monthPay=48960
inter=36
print("세탁기 총금액은 %d원입니다."%(monthPay*inter))

for i in range(10,20):
    print(i)

#word = input("영어문장을 입력하세요.: ")
#for x in word:
#   print(x)

letters = 'java programming'

#1.
print(letters[5]+letters[10]+letters[8])

#2.
a="43다 6521"
print(a[4:8])

#3.
a="홀짝홀짝홀짝홀짝"
for x in range(0,len(a)):
    if(x%2==1):
     print(a[x])

#4.
str10 = "PYTHON"
print(str10[5]+str10[4]+str10[3]+str10[2]+str10[1]+str10[0])

#5.
phone = "010-888-9999"
phone=phone.replace("-"," ")
print(phone)

#6.
phone = "010-888-9999"
phone=phone.replace("-","")
print(phone)

#7.
url = "http://gmail.com"
print(url[13:])

#8.
#lang = "java python"
#lang[0] = "K"
#print(lang)

#9.
lang = "java python"
lang = lang.replace("j","K")
print(lang)

#10.
str11 = "abcdefABCDEFabc"
str11 = str11.replace("c", "!")
print(str11)

#11.
#인자로 받지않았기 때문에

#12.
a="123"
b="456"
print(a+b)

#13.
str12 = "Hi!"
print(str12*5)

#14.
print("+"*150)

#15.
s1 = "python"
s2 = "c++"
s3 = "java"

print((s1+s2+s3)*5)

#16.
name1 = "홍길동"
age1 = 25
eyesight1 = 1.2
name2 = "이순신"
age2= 13
eyesight2 = 0.8

print("이름: %s 나이: %d 시력: %.1f "%(name1,age1,eyesight1))
print("이름: %s 나이: %d 시력: %.1f "%(name2,age2,eyesight2))

#17.
print("이름{} 나이: {} 시력:{} ".format(name1,age1,eyesight1))
#18.
print(f"이름: {name1} 나이: {age1} 시력: {eyesight1}")
#19

총금액 = "5,896,124,650"
총금액다시 = 총금액.replace(",","")
print((int)(총금액다시))

#20.
날짜 = '2024/01(E) 1사분기'
print(날짜[0:7])

#21.
data = "      공백제거하기   "
data1 = data.replace(" ","")
print(data1)

#22.
lowerWord = "python is very good"
lowerWord = lowerWord.upper()
print(lowerWord)

#23.
upperWord = 'JAVA LANGUAGE'
upperWord = upperWord.lower()
print(upperWord)

#24.
capitalizeWord = 'python quiz'
capitalizeWord =capitalizeWord.capitalize()
print(capitalizeWord)

#25.
fileName="abc.csv"
bool =fileName.endswith("csv")
print(bool)

#26.
fileName = "abc.xlsx"
bool =fileName.endswith("csv")
print(bool)