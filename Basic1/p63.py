# 문자열 연산자
x = "토끼"*10
print(x)
print("-")
x="말 한마디로 천냥 빚을 갚는다."
print(len(x))

x="-"*10
y="거북이"
print(len(x+y))

animal = "고양이"
age = 25 
score = 124.5
x = "나는 %s를 좋아하는 %d살입니다. 포인트점수는 %.2f입니다."%(animal,age,score)
print(x)


y="c"
x="%c"%y
print(x)

y="ac"
x="%s"%y
print(x)

y=15
x="%o"%y # 8진수
print(x) 

y=18
x="%x"%y #16진수
print(x)

#name = input("이름을 입력하세요: ") # 받는갑은 무조건 문자열(str)
#print("%s 입니다."%name)
#print(name+"입니다.")


#r = (float)(input("반지름값을 입력하시오. :"))
#print(r*r*3.14)

# 74p
name= "홍지영"
a = 10
b = 20
print(name, a, b,a-b,100,sep="/")
print("문자열에는 문자 앞 뒤에 쌍따옴표(\")를 붙힌다")