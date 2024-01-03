#C4-1
"""
count=0

for i in range(201,800):
    if i%5!=0:
        print("%d"%i,end="")
        count=count+1

    if count%10==0:
        print()
"""
#C4-2
"""
for cm in range(1,101):
    mm=cm*10.0
    m=cm*0.01
    inch = cm* 0.3937
    print(f"mm={mm}, m={m}, inch={inch}",end="")
"""


#C4-3
"""
for x in range(1,11):
    print("*"*x)
    print()
"""
#C4-4
for x in range(11,0,-1):
    print("*"*x)
    print()

#C4-5

number="477569040"
total = 0

for x in number:
    x=int(x)
    if x%2==1:
        total =total +1
print(total)

#C4-6
for kg in range(100,201,2):
    pound = kg*2.204623
    ounce = 35.273962 
    print(f"{kg}    , {pound},    {ounce}")
