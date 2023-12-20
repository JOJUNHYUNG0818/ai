#접두사확인
"""
my_string="banana"
is_prefix="na"
answer=0
tmp = [my_string[:i] for i in range(0,len(my_string))]
print(tmp)
for i in tmp:
    if is_prefix == i:
       answer = 1

print(answer)    
"""


#문자열 뒤집기
"""
my_string ="Progra21Sremm3"
s=6
e=12
print(my_string[:s]+my_string[s:e+1][::-1]+my_string[e+1:])
"""

#세로 읽기
"""
my_string="ihrhbakrfpndopljhygc"
m=4
c=2
print(my_string[c-1::m])
"""

#qr code
"""
code = "qjnwezgrpirldywt"	
q=3
r=1

answer = ''
for x in range(0,len(code)):
    if x%q==r:
        answer=answer+code[x]
print(answer)
"""

"""
for x in range(65,91):
    print(chr(x),end="")
"""
"""
my_string = "Programmers"

answer = [0 for i in range(52)]
for string in my_string:
    if string.isupper(): k = 65
    else: k = 71
    answer[ord(string)-k] += 1
print(answer)
"""
"""
n=10
k=3

answer = []
for x in range(1,n+1):
    answer.insert(x,x)
print(answer)
"""


"""
my_string="apporoograpemmemprs"
indices = [1, 16, 6, 15, 0, 10, 11, 3]
answer = list(my_string)
print(answer)
for i in indices:
    answer[i] =""
print("".join(answer))


end_num=3
start=10
answer = []
result=[answer for answer in range(start,end_num-1,-1)]
print(result[0]+1)
result1=str(result)
result3=list(result1)
print(result3)
"""
"""
i=0
sum-0
while True :
    i+=1
    if i==101:break
"""     
#배열뒤집기
my_string = "123456"
queries = [[2, 3], [0, 7], [5, 9], [6, 10]]
for start, end in queries:
    print(start),print(end)

print(my_string[::-1])

#배열 만들기
"""
answer =[]
intStrs=["0123456789","9876543210","9999999999999"]
k=50000
s=5
l=5
for x in range(s,s+l):
    answer = answer+intStrs[0][x]
print(answer)
"""
#부분 문자열 이어 붙여 문자열 만들기
my_strings=["progressive", "hamburger", "hammer", "ahocorasick"]
parts=[[0, 4], [1, 2], [3, 5], [7, 7]]
answer=""


for x in range(0,len(my_strings)):
    answer = answer + my_strings[x][parts[x][0]:parts[x][1]+1]
print(answer)
num_list = [12, 4, 15, 46, 38, -2, 15]
for x in range(0,len(num_list)):
    if num_list[x]<0 :
            answer=x
print(answer)


arr = [1, 2, 3, 4, 5]
intervals = [[1, 3], [0, 4]]
answer =arr[intervals[0][0]:intervals[0][1]+1]+arr[intervals[1][0]:intervals[1][1]+1]

print(answer)

