# 생성자
class Member:
    def __init__(self) : #생성자 __init__
        self.name = None
        self.age = None
        self.gender = None
    def show_info(self,name,age,gender):
        print("이름: ", self.name)
        print("나이: ", self.age)
        print("성별: ", self.gender)

# 객체생성
m1 = Member("홍길동", 25)
m1.show_info()
        