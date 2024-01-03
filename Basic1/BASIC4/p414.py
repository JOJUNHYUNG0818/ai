#상속 
class A:
    def aM(self,x):
        print(x)
class AA(A):
    def aM(self, x):
        print("나는 자식메소드 오버라이딩",x*x)

a=A()
a.aM(10)

aa=AA()
aa.aM(10)