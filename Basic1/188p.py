#list
flowers = ["목련","벚꽃","장미","백일홍"]
print(flowers)

flowers[1] = "무궁화"
print(flowers)

flowers[3] = "개나리"
print(flowers)

flowers.append("백일홍")
print(flowers)

flowers.insert(2,"백화")
print(flowers)

#특정요소 위치찾기
number = [5,20,13,7,8,22,7,17]
print(number)
idx = number.index(20)
print(idx)
idx = number.index(7,5)
print(idx)
#리스트 제거
number.remove(5)
print(number)
x = number.pop(2)
print(x)
print(number)