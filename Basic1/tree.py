for x in range(1,6):
    for y in range(1,6-x):
        print(" ",end="")
    for z in range(1,2*x):
        print("*",end="")
    print()
