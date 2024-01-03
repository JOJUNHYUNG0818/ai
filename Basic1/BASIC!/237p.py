# 딕셔너리 {key:value}
score = {"kor":90, "eng":89,"math":95}
print(score["kor"])

#추가하기
score["music"]=100
print(score)

#삭제하기
x = score.pop('music')
print(x)
print(score)

#반복문을 이용해서 딕셔너리 처리
for x in score: #score의 key값만 x값에 대입
    print(f"{x}-{score[x]}")


sk=""
for k in score:
    sk=sk +k+" "
print(sk)

