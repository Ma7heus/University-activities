n = int(input())
listSize = []
listSide = []
num = 0
botas = []
for i in range(N):
    M, L = input().strip().split(' ')
    M = int(M)
    if(L == 'D'):
        if(botas[M] < 0):
            num += 1
        botas[M] += 1
    else:
        if(botas[M] > 0):
            pares += 1
        botas[M] -= 1
    
print(botas)
