#연습문제 6-1
year_sale = {"2016":237,"2017":98,"2018":158,"2019":233,"2020":120}

for key in year_sale:
    if key=="2017":
        print("%s년 자동차 판매량 : %d대"%(key,year_sale[key]))

print
#6-2
sum=0
for key in year_sale:
    if key=="2018"or key=="2019":
        print("%s년 자동차 판매량: %d"%(key,year_sale[key]))
        sum=sum+year_sale[key]
print("2년간 자동차 판매량: %d대"%sum)

#6-3

sm=0
for x in year_sale:
    sm = sm+year_sale[x]

avg = sm/len(year_sale)

print("5년간 총 판매량 : %d"%sm)
print("5년간 연 평평균 판매량: %d"%avg)

#6-4

big_year =2016
biggest = year_sale["2016"]
for key in year_sale:
    if year_sale[key]>biggest:
        big_year = key
        biggest=year_sale[key]
print("판매량이 가장 많은 해 : %s년"%big_year)
print("판매량: %d대"%biggest)

#심화문제 6-1
temp = {"월":15.5,"화":17.0,"수":16.2,"목":12.9,"금":11.0,"토":10.5,"일":13.3}
print("----------------------------------------------")
for key in temp:
    print(key,end="   ")
print()
print("----------------------------------------------")
for key in temp:
    print(temp[key],end=" ")
print()

#6-2
lowTemp = temp["월"]
lowday = {}
for key in temp:
    if temp[key]<lowTemp:
        lowTemp = temp[key]
        lowday = key
print("요일: %s, 최저기온%d"%(lowday,lowTemp))

#6-3
sum = 0
for key in temp:
    sum = sum+temp[key]
avg = sum/len(temp)
print("일주일간 기온 평균: %.1f"%(avg))




