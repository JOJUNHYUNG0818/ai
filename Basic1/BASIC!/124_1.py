run = True
num =[]
while(run):

    print("기능 선택")
    print("1. 더하기")
    print("2. 빼기")
    print("3. 곱하기")
    print("4. 나누기")
    print()

    sum=0
    sum1=1

    s=input("계산기 기능을 선택하세요(1/2/3/4)")
    calnum = int(input("계산할 숫자 갯수는? "))
    for x in range(0,calnum):
        c =int(input("%d숫자를 입력해주세요."%(x+1)))
        num.append(c)

    if s=="1":
        for x in range(0,len(num)):
            sum=sum+num[x]
            print(f"{num[x]}",end=" ")
            if x==len(num)-1:
                print("=",end=" ")
            else: 
                print("+",end=" ")
        print(sum)
    elif s=="2":
        for x in range(0,len(num)):
            sum=sum-num[x]
            print(f"{num[x]}",end=" ")
            if x==len(num)-1:
                print("=",end=" ")
            else: 
                print("-",end=" ")
        print(sum)
    elif s=="3":
        for x in range(0,len(num)):
            sum1=sum1*num[x]
            print(f"{num[x]}",end=" ")
            if x==len(num)-1:
                print("=",end=" ")
            else: 
                print("*",end=" ")
        print(sum1)
            
    elif s=="4":
        for x in range(0,len(num)):
            sum1=sum1/num[x]
            print(f"{num[x]}",end=" ")
            if x==len(num)-1:
                print("=",end=" ")
            else: 
                print("/",end=" ")
        print(sum1)
    else:
        print("입력하신 숫자가 잘못되었습니다.")


    que=input("계속 하시겠습니까? (y/n)")
    if que == "y" :
        run=True
    else :
        run =False

print("수고하셨습니다.")
    
 


    
        
    
