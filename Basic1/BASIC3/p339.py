import time

seconds = time.time()
print(seconds) # 타임 스탬프1970년 부터 경과된시간

tm = time.gmtime()
print(tm) # 그리니치 표준시 우리나라 GMT+9(9시간 후)

tm1 = time.gmtime(seconds)
print(tm1)

#localtime 함수 = (윈도우에서 세팅된 나라)
tm2 = time.localtime(seconds)
print(tm2)

string = time.ctime(seconds)
print(string)

tm3 = time.localtime(seconds)
string1 = time.strftime("%Y-%m-%d %I:%M:%S %p",tm3) 
print(string1)

print("시작")
#time.sleep(1) 딜레이
print("끝")