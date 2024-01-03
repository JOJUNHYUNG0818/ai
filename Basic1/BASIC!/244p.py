inventory = {"메로나":[300,20],
             "비비빅":[400,0],
             "죠스바":[250,100]}
#메로나 가격
print(inventory["메로나"][0],"원",sep="")

#죠스바에 재고
print(inventory["죠스바"][1],"개",sep="")
inventory["월드콘"]=[1500,50]
print(inventory)
#메로나 300원 20개 가격 6000
print(f"{"메로나"} {inventory["메로나"][1]}개 가격: {inventory["메로나"][0]*inventory["메로나"][1]}원")
print(f"{"비비빅"} {inventory["비비빅"][1]}개 가격: {inventory["비비빅"][0]*inventory["비비빅"][1]}원")
print(f"{"죠스바"} {inventory["죠스바"][1]}개 가격: {inventory["죠스바"][0]*inventory["죠스바"][1]}원")

scores = {"김채린":85,"박수정":98,"함소희":94,"안예린":90,"연수진":93}

sum=0

#6-2
for key in scores:
    sum= sum +scores[key]

    print("%s:%d"%(key,scores[key]))

avg = sum/len(scores)

print("합계 %d, 평균 %.2f"%(sum,avg))

#6-3
admin_info = {"id":"admin","password":"12345"}

input_id= input("아이디를 입력하세요: ")
input_pass= input("비밀번호를 입력하세요: ")

if input_id==admin_info["id"]and input_pass==admin_info["password"]:
    print("로그인되었습니다.")
else:
    print("다시입력하세요.")

#6-4
words = {"꽃":"flower","나비":"butterfly","학교":"school","자동차":"car","비행기":"airplane"}

print("<영어 단어 맞추기 게임>")

for kor in words:
    input_word = input("'%s'에 해당되는 영어 단어를 입력해주세요: "%kor)

    if input_word==words[kor]:
        print("정답입니다.")
    else:
        print("틀렸습니다.")




