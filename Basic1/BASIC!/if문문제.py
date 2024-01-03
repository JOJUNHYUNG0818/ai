#1. bool
#2.

print(8==5)
#3.
print(3<5)
#4.
print((3==5)and(4!=3))
#5.순서이상
print(3>=4)
#6.
if 4<3:
    print("Hello")
#7.
if 4<3:
    print("Hello World")
else:
    print("Hi,there")
#8.
if True :
    print("1")
    print("2")
else:
    print("3")
print("4")

#9.
if True :
    if False:
        print("1")
        print("2")
    else:
        print("3")
else:
    print("4")
print("5")

#10.
a = input("입력하기: ")
print(a*2)

#11.
a = input("숫자를 입력하세요: ")
print(a+10)

#12.
a = input("숫자입력: ")
if a%2==0:
    print("짝수")
else:
    print("홀수")

#13.
a = int(input("숫자입력"))
if a<255:
    result=a+20
else :
    result=255
print(result)

#14.
a = int(input("숫자입력"))
if 0<=a-20<=255:
    print(a-20)
elif a-20<0:
    print("0")
else:
    print("255")

#15.
a="02:00"
if a[3]=="0"and[4]=="0":
    print("정각입니다")

#16.
a="a"
print(a.upper())

#17.
a = int(input("숫자입력: "))
if 80<a<=100:
    print("A")
elif 60<a<=80:
    print("B")
elif 40<a<=60:
    print("C")
elif 20<a<=40:
    print("D")
elif 0<=a<=20:
    print("E")

#18.
i=10
j=9
k=20

if i>j and i>k:
    print(i)
elif j>i and j>k:
    print(j)
elif k>i and k>j:
    print(k)

#19.
a=input("휴대폰번호 앞자리: ")

if a=="011":
    print("당신은 SKT사용자입니다.")
elif a=="016":
    print("당신은 KT사용자입니다.")
elif a=="019":
    print("당신은 LGU사용자입니다.")
elif a=="010":
    print("알수없음")

#20.
i = input("우편번호 입력: ")

if 0<=int(i[2])<=2:
    print("강북구")
elif 2<int(i[2])<=5:
    print("도봉구")
elif 5<int(i[2])<=9:
    print("노원구")

#21.
i = input("주민번호 - 포함 입력: ")

if i[7]=="1" or "3":
    print("남자")
else:
    print("여자")

#22.
i = input("주민번호 - 포함 입력: ")

if 0<int(i[8:10])<=8:
    print("서울")
elif 9<int(i[8:10])<=12:
    print("부산")
else:
    print("서울이 아닙니다.")
    

    




    




    
