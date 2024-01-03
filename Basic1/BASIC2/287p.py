#7-1
# 지역변수이기 때문이다

#7-2 200 100
def func():
    x=200
    print(x)

x=100
func()
print(x)
print()

#7-3 200 200
def func():
    global x
    x=200
    print(x)

x=100
func()
print(x)

#7-4
def chageMile(x):
    return x*0.621371

print(chageMile(30))

#7-5
def plus(a,b):
    return a+b

def minus(a,b):
    return a-b

def multi(a,b):
    return a*b

def devide(a,b):
    return a/b

#7-6

def strCheck(str,char):
    count=0
    for x in str:
        if x==char:
            count+=+1
    return count

a="a"
print(strCheck("I am a student",a))

#7-7
tup1=(10,20,30,40,50)
def tupPlus(args):
    sum=0
    for x in range(0,len(args)):
        sum+=args[x]
    return sum

print(tupPlus(tup1))


#7-8
def reverse(str):
    return str[::-1]

str1 = "Thank you."
print(reverse(str1))

#7-9
def pass1(str):
    return str.replace(" ","-")

print(pass1("I am a student"))

"""
#7-10
def inch(a):
    return a*0.393701
def pound(a):
    return a*2.204623

print("-선택 옵션")
print("1.길이 환산(센티미터-->인치)")
print("2.무게환산(킬로그램-->파운드)")
num = input("원하는 환산 단위를 선택하세요.(1/2)")
if num=="1":
    s=float(input("센티미터 단위의 길이를 입력하세요: "))
    print(f"{s} 센티미터 --> {inch(s)}인치")
elif num=="2":
    s=float(input("킬로그램 단위의 무게를 입력하세요: "))
    print(f"{s} 킬로그램 --> {pound(s)}파운드")
"""


#S7-1
def primeNum(x):
    list=[]
    for i in range(2, x+1):
        for j in range(2,i+1):
             if (j == i):
                list.append(i)
             elif (i % j == 0):
                break
    return list
print(primeNum(50))

#S7-2
eng_dict = {"house":"집", "piano":"피아노","christmas":"크리스마스","friend":"친구","bread":"빵"}
#def dict(str):
#   if str==eng_dict["house"]
def dict(str,word):
    if str==word:
        result="참잘했어요!"
    else: 
        result = "틀렸어요!"
    return result
       

for i in eng_dict:
    s= input(f"{eng_dict[i]}에 맞는 단어는? ")
    answer = dict(s,i)
    print(answer)
    
#S7-3
def square(n):
    list=[]
    for i in range(1,n+1):
        list.append(i*i)
    return list
print(square(10))




             


             

