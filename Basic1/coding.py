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
code = "qjnwezgrpirldywt"	
q=3
r=1

answer = ''
for x in range(0,len(code)):
    if x%q==r:
        answer=answer+code[x]
print(answer)