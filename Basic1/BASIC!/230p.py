#튜플 - 수정이 안된다. 용도 - 변동 불가한 것 사용할때
t=(1,2)
t1 = 1,2
print(t[0])
print(t1[0])
print(type(t1))

t2= (1, ) #원소가 하나인 튜플
print(type(t2))
t3=() #원소가 없는 튜플
print(type(t3))

animals = ("토끼","거북이","사자","여우")
print(animals)

#토끼를 돼지로 바꾸기

ani_list = list(animals)
print(type(ani_list))
ani_list[0]="돼지"
animals = tuple(ani_list)
print(animals)

#튜플 만들기
n = tuple(range(10,21))
print(n)

sm = sum(n)
print(sm)

t1 = ('valentine',2,14,'gift')
print(t1[1:2])

t2 = ('love',)
print(t2[0])
print(t1+t2)
print(len(t1))