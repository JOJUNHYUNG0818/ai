f = open ("new_file.txt","w",encoding="utf-8")
names = ["홍길동","이수진","안지영","김연수"]

for name in names:
    f.write(name+"\n")
print("파일쓰기 완료!")
f.close

f = open ("new_file.txt","a",encoding="utf-8")
names=["손영민","황현준"]

for name in names:
    f.write(name+"\n")

f.close

f = open ("new_file.txt","r",encoding="utf-8")
lines = f.readlines()
for line in lines:
    temp = line.replace("\n","")
    print(temp)
f.close

f1=open("score.txt","r",encoding="utf-8")
lines = f1.readlines()
print(lines)
