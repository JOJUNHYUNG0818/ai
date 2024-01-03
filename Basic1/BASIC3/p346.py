# detetime 모듈
import datetime
import datetime as dt
dt.timedelta

#오늘 날짜 구하기
today = dt.date.today()
print(today)

week = dt.timedelta(weeks=1)
next_week = today +week
print(next_week)

before_week = today-week
print(before_week)

now = dt.datetime.now()
print(now)
print(now.year)
print(now.month)
print(now.day)
print(now.hour)
print(now.minute)
print(now.second)
