# 함수 
# 용도는? 역할을 담당하는 것
# 사용법은? 만들기->호출해서 사용

def hello():
    print("Hi!")

hello()

def hi(name):
    print(f"안녕 {name}야!")

hi("인수")

def intro(name,length):
    print(f"나는 {name}야 키가 {length}이야")

intro("민수",180)

def avg(*score):
    return sum(score)/len(score)
print(avg(75,55,50))

def func (food) :
    for x in food:
        print(x,end=" ")
fruits = ["사과","오렌지","바나나"]
func(fruits)
print()

def tD(tDP):
    for x in tDP:
        print(x,end=" ")


tupleData = ("삼성","LG","세스코")
tD(tupleData)
print()

def returnSum(n1,n2,n3):
    s=n1+n2+n3
    return s

ss = returnSum(10,20,30)