"""
myStr = "baconlettucetomato"
#for x in range (len(myStr)):
# if 
a=myStr.split("b")
print(a)
"""

"""
arr = [5, 1, 4]
a = []
print(arr)
for x in arr:
    for i in range(0,x):
        a.append(x)
print(a)       
"""

a = [1, 2, 3, 4, 5, 6, 7]
answer=[]
for x in range(0,len(a)):
    if x%2==0:
        answer+=[a[x]]*2
    else :
        answer +=[a[x]]*3
print(answer)

answer = [a]
print(answer)






