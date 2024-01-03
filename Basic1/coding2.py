"""
answer = []
strArr = ["AAA","BBB","CCC","DDD"]
print(strArr[0].lower())
for x in range(0,len(strArr)):
    if x%2==0:
        answer.append(strArr[x].upper())
    elif x%2==1:
        answer.append(strArr[x].lower())

print(answer)
"""

"""
myString = "abstract algebra"

answer = ''

for x in myString:
    if x == "a":
        answer.append(x.upper())
    else :
        answer.append(x.lower())
print("".join(answer))
 
my_string = "programmers"
alp = "p"
s = alp.upper()
answer = my_string.replace(alp,s)
print(answer)

print(my_string.find("gr"))
"""
"""
strArr = ["and","notad","abcd"]
answer = []
for x in range(0,len(strArr)):
    if strArr[x].find("ad")!=-1:
        continue
    else:
        answer.append(strArr[x])
print(answer)
"""
"""
answer= []
my_string = " i    love  you"

print(my_string.split())
"""
"""
myString = "oxooxoxxox"

tmp = myString.split("x")
print([len(i) for i in tmp])
"""
"""
myString= "dxccxbbbxaaaa"

a =myString.split("x")
b = sorted(a)
print(b)
"""


"""
myString = "ABBAA"
pat = "AABB"
a=[]
for x in range(len(myString)):
    if myString[x]=="A":
        b = myString[x].replace("A","B")
        a.append(b)
    elif myString[x]=="B":
        b= myString[x].replace("B","A")
        a.append(b)
answer = "".join(a)
if answer.find(pat)==-1:
    r = 0
else:
    r=0
print(r)
"""
"""
rny_string="masterpiece"
s = rny_string.replace("m","rn")
print(s)
"""
myStr ="baconlettucetomato"	
s=myStr.split("a")
s="".join(s)
s=s.split("b")
s="".join(s)
print(s)
s=s.split("c")
print(s)