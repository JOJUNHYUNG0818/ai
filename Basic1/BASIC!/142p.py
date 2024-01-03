# for문, while 문
for x in range(1,11,2):
    print(x)

for x in range(5,101,5):
    print(x)

#문제
"""
start = int(input("시작번호입력: "))
end = int(input("끝번호: "))
for x in range(start,end,2):
    print(x)
"""

for x in range(1,32):
    print(f"2014/1/{x}")

count = 0
for x in "This is python":
    if x == "T"or"t":
        count=+1
print(count)

for x in range(1,10):
    for y in range (1,10):
        print(f"{x}*{y}={x*y}")




