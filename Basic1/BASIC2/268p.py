#7-1
def add(a,b):
    c=a+b
    print("%d + %d = %d"%(a,b,c))
add(12,15)

#7-2
def sum_int(start,end):
    total = 0
    for i in range(start,end+1):
        total = total+i
    print("%d~%d 정수 합계: %d"%(start,end,total))

sum_int(20,50)

#7-3
def member_join(*args):
    result = ""
    for arg in args:
        result = result +arg+" "
    print("가입 회원: ",result)

member_join("김정연","안서영")

#7-4
def multiply(num,x):
    i=0
    while i<len(num):
        num[i]=num[i]*x
        i=i+1

numbers=[10,20,30,40,50]

multiply(numbers,10)
print(numbers)


#7-5
def tri_area(w,h):
    result = w*h*0.5
    return result

#7-6
def sum_basu(n):
    sum=0
    for i in range(1,101):
        if i%n==0:
            sum=sum+i
    return sum
besh= 2
total =sum_basu(besh)
print("1~100사이 %d의 배수의 합계: %d"%(besh,total))

#7-7
def count_space(a):
    count = 0
    for x in a:
        if x == " ":
            count=count+1
    return count
sentence="PyThon is easy and powerful."

num_space = count_space(sentence)
print("-공백의 개수: ",num_space)

#7-8
def get_item(userid):
    game_items ={"kim":"총","lee":"대포","choi":"전투기","hwang":"병사"}
    for key in game_items:
        if userid==key:
            item = game_items[key]
    return item
user1 = "kim"
user2 = "hwang"

print("%s의 게임 아이템: %s"%(user1,get_item(user1)))
print("%s의 게임 아이템: %s"%(user2,get_item(user2)))

