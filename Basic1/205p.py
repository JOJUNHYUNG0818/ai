#문자열 찾기
string = "python is fun!"
print(string)
x = string.find("fun")
print(x)

#문자열 치환하기
data = "홍길동/이순신/최경주"
data =data.replace("/"," ")
print(data)

#문자열 쪼개기
hello = "have a nice day"
print(type(hello))
list1 = hello.split(" ")
print(list1)
print(type(list1))

print(list1[0][0])#h

list1 = hello.split(" ",2)
print(list1)

names = ["황애린", "홍지수", "안지영"]

x="-".join(names)
print(x)
phoneNumber = ["010","1234","5678"]
phoneNumber = "-".join(phoneNumber)
print(phoneNumber)

phone_list = ["010-3654-2637","010-3984-5377","010-3554-0973"]
print(phone_list)
x = "".join(phone_list)
print(x)

phone_list1 = []
for number in phone_list :
    x=number.replace("-","")

    phone_list1.append(x)
print(phone_list1)


