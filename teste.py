# cara Coroa de uma forma mais simples
while True:
    M =0
    J =0
    LISTA = 0
    i = int(input())
    if i == 0:
        break
    LISTA = list(map(int, input().split()))

    for J in LISTA:
        if J ==0:
            M+=1
    J = i - M

    print(f"Mary won {M} times and John won {J} times")