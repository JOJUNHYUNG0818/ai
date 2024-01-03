def printSum(sList):
    #result = 0 # 지역변수
    global result # 전역변수
    result = 0
    for s in sList:
        result+=s
    return result

sList = [1,3,5,6,2]
print(printSum(sList))

