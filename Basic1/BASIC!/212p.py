# 2차원 리스트
numbers = [[10,20,30],[40,50,60],[60,[70,80]]]
print(numbers[2][1][1]) # 10


for i in range (0,len(numbers)):
    for j in range(0,len(numbers[i])):
        print(numbers[i][j],end=" ")
    print()

strings = [["원두커피","라떼","콜라"],["우동","국수","피자",]]

str="".join(strings[0]+strings[1])
str1 = str.replace("원두커피","아메리카노")
print(str1)

