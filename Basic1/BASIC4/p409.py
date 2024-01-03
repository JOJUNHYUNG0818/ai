# 속성: 자바에서 필드, 변수

# 속성
class Student2:
    pet = [] # 클래스 속성 , 값을 계속 유지함
    def push_pet(self,x):
        self.pet.append(x)
john2 = Student2() # 객체화
john2.push_pet("고양이")
print(john2.pet)


sally2 = Student2()
sally2.push_pet("강아지")
print(sally2.pet)

# 인스턴스
class Student :
    def __init__(self):
        self.pet = [] # 인스턴스 속성 ,값이 계속 바뀜
    def push_pet(self,x):
        self.pet.append(x)

john = Student() # 객체화
john.push_pet("고양이")
print(john.pet)


sally = Student()
sally.push_pet("강아지")
print(sally.pet)