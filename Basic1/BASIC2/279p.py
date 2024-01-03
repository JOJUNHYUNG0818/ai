x=100
def func():
    print(x)

func()

x=100
def func2():
    global x
    x=200
    print(x)
print(x)
func2()
print(x)