while True:
    x = int(input())
    if x == 0:
        break
    else:
        list= []
        for i in range(1,x+1):
            list.append(i)
        print(*list)

