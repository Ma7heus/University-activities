lista = []

while True:
    n = int(input())
    if n == 0:
        break
    else:
        for i in range(0,n):
            nome = input()
            cor, tamanho = map(str, input().split())
            lista.append([cor,tamanho,nome])
            print(lista)








        



