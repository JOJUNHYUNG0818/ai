#연습문제 5장. 리스트
my_list = ["p","y","t","h","o","n","i","s","f","u","n","!"]

#5-1
print(my_list[5:11])
#5-2
#print(my_list[-5,-2])
#5-3
print(my_list[8:])
#5-4
print(my_list[:4])

#5-5
string = "I am a genius!"
list = []
for x in string:
    list.append(x)
print(list)


#5-6
string = "I am a genius!"
list = []
run= True
while run:
    for x in range(0,len(string)):
        list.append(string[x])
    run=False
print(list)

#5-7
numbers=[7,9,15,18,30,-3,7,12,-16,-12]
sum=0
for x in range(0,len(numbers)):
    sum = sum +numbers[x]
print(sum)

#5-8
x=0
sum=0
while x<len(numbers):
    sum=sum+numbers[x]
    x=x+1
print(sum)

#5-9
a=0
b=2
c=a%b
print(c)




#심화문제 5-1
file_names = ["file1.py","file2.txt","file3.pptx","file4.doc"]
s=[]
for x in range(0,len(file_names)):
    r = file_names[x].split(".")
    s.append(r)
    print(f"파일명:{s[x][0]},확장자:{s[x][1]}")

#심화문제 5-2
emails = [["kim","naver.com"],["hwang","hanmail.net"]]
email_new = []
for email in emails:
    print(email)
    email_new.append(email[0]+"@"+email[1])

print(email_new)



