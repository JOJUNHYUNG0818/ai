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
"""
"""
arr=[0, 1, 1, 1, 0]
i=0
stk=[]
while i<len(arr):
    if stk == []:
        stk+=[arr[i]]
        i=i+1
    else :
        if stk[-1]==arr[i]:
            del stk[-1]
            i=i+1
        else :
            stk.append(arr[i])
            i=i+1
        
print(stk)
"""
"""
arr = [0, 1, 1, 2, 2, 3]
k=3
answer = []
for x in range(0,len(arr)):
    if answer==[]:
        answer.append(arr[x])
    for i in range(0,len(answer)):
        if answer[x]!=arr[i]:
            answer.append(arr[i])
        else:
            while len(answer)<k:
                answer.append(-1)

print(answer)
"""
arr = [1, 2, 3, 4, 5, 6]
