f1=open("score.txt","r",encoding="utf-8")
lines = f1.readlines()
print(lines)
for line in lines:
    data = line.split()
    i=0
    sum=0

    while i<len(data):
        if i == 0:
            print(data[i],end=":")
        else :
            sum= sum+int(data[i])
        i=i+1
    avg=sum/(len(data)-1)
    print("%.2f점"%(sum/5))

f1.close