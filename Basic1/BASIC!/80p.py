phone1 = "010"
phone2 = "2222"
print(phone1,phone2,sep="")
"""
kor = input("국어 성적을 입력하세요.")
eng = input("영어 성적을 입력하세요.")
math = input("수학성적을 입력하세요.")
sum=(int)(kor)+(int)(eng)+(int)(math)
avg = sum/3
print("합계: %d, 평균: %.2f"%(sum,avg))
"""

price = 3000
num = 3
pay = 10000

change = pay -price*num
print("거스름돈 -->%d원"%change)

"""
name = input("당신의 이름은? :" )
birth = int(input("당신이 태어난 해는? :"))
age = 2021 -birth+1
print("%s님의 나이는 %d세 입니다"%(name,age))
"""

from datetime import datetime

print(datetime.today().year)
"""
year = input("년도: ")
month = input("월: ")
day = input("일: ")
"""

weekday = datetime.today().weekday()
print(weekday,sep=".")

width = 10
height = 20
length = (width+height)*2
area  = width*height
print(f"사각형 둘레 {length}")
print(f"사각형 넓이 {area}")

if area>=100:
    print("큰 사각형이네요")
else:
    print("작은 사각형이네요")

if area>=100 and area<=300:
    print("큰사각형")
elif area>=50 and area<100:
    print("중각사각형")
elif area>=0 and area<50:
    print("작은사각형")

price = 20000
discount = 10
delivery = 3000
pay = price -(price * (discount/100))+delivery
print(f"책값은 {price}원이고, 할인율 {discount}%이며 배달료 {delivery}원이며, 총금액{pay}원 결제")

if delivery>=2000:
    print("비싸다.")
else:
    print("저렴하다.")

#1.
a=10
b=20
print(a+b)

#2.
print("%d + %d = %d"%(a,b,a+b))

#3.
print(f"{str(a)}+{str(b)}={str(a+b)}")

#4.
a= "바나나"
b= "오렌지"
print("%s 와 %s 는 내가 제일 좋아하는 과일이다."%(a,b))

#5.
print("%s와 %s는 내가 제일 좋아하는 과일이다."%(a,b),sep="")

#6.
print("%s와 %s는 내가 제일 좋아하는 과일이다."%(a,b),sep="")

#7.
a=5
b=3
print(a/b)

#8.
print("%.2f"%(a/b))

#9.
a="hong"
b="naver.com"
print(a+"@"+b)

#10.
a="홍길동"
b="서울 서대문구"
c="010-1234-5678"
print(f"-이름 :{a}")
print(f"-주소 :{b}")
print(f"-전화번호:{c}")

#11.
a=10
b=20
c=5
print(f"-사다리꼴의 면적 : {(a+b)*c}")

#12.
a="가는 말이 고와야 오는 말이 곱다."
print(a[10:14])

#13.
a="37366366845"
print(a[-2:])

#14.
kg = 100
pound = kg*2.204623
ounce = kg*35.273962
print("----------------------------------")
print("킬로그램     파운드         온스")
print("----------------------------------")
print(f"{kg}   {pound}   {ounce}")

#15.
a="010-1234-5678"
print(f"-입력된 휴대폰 번호 : {a}")
print(f"-하이폰이 삭제된 휴대번호:{a.replace("-","")} ")
print(f"{(a.split("-"))}")


a=[[2, 3], [0, 7], [5, 9], [6, 10]]	
print(a[0][0])
