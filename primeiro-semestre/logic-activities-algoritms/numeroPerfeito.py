N = int(input())
listN = []
x = 0
if 1<=N<=20:
    for i in range(0,N):
        x = int(input())
        listN.append(x)

    for x in listN:
        #Codigo que descobre se o numero e perfeito ou nao.
        soma = 0
        list = []
        for i in range(1,x):
            if x % i == 0:
                list.append(i)
              
        soma = sum(list)
        if soma == x:
            print(f"{x} eh perfeito")
        else:
            print(f"{x} nao eh perfeito")








