#병합
person1 = ["kim",24,"kim@naver.com"]
person2 = ["lee",35, "lee@hanmail.com"]

person = person1+person2
print(person)

scores = list(range(80,101,4))
print(scores)
sm = sum(scores)
print(sm)

#에러
a = [1,2,8.9,"a","b"]
# 에러구간 sum(a)
print(a)

data = ["사과","배","딸기"]
data.reverse()
print(data)

fruits = ["apple","banana","orange"]
x = fruits.copy()
print(x)
xx=fruits

fruits.insert(1,"pineapple")
print(x)
print(xx)

#정렬하기
data = [12,8,15,32,-3,-20,15,34,6]
data1 = ['a','A','C','!','한글','가나']

data.sort()
print(data)

data1.sort()
print(data1)