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

arr =[1, 1, 1, 1, 0]
idx = 3
answer=0
for x in range(0,len(arr)):
    if x>idx :
        for i in arr:
            if arr[x]==1:
                answer =x
                break
            else:
                answer= -1
print(answer)
        


