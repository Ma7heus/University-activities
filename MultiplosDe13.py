x = int(input())
y = int(input())

numberList = []

if x<y:
    for i in range(x, y+1):
        if i % 13 != 0:
            numberList.append(i)
else:
    for i in range(y, x+1):
        if i % 13 != 0:
            numberList.append(i)


print(sum(numberList))
    


