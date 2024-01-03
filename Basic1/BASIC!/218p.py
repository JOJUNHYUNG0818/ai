#5-5
questions =["s_hool","compu_er","deco_ation","windo_","hi_tory"]
answer = ["c","t","r","w","s"]

for i in range(len(questions)):
    q= "%s: 밑줄에 들어갈 알파벳은?"%questions[i]
    guess= input(q)

    if guess==answer[i]:
        print("정답")
    else:
        print("땡")

#5-6
scores = []

while True :
    x=int(input("성적을 입력하세요(종료시 -1 입력): "))

    if x==-1:
        break
    else :
        scores.append(x)
sum=0
for score in scores:
    sum= sum+score

avg = sum/len(scores)
print("합계: %d, 평균: %.2f"%(sum,avg))