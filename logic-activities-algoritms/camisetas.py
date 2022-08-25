lista = []
lista2 = []
while True:
    n = int(input())
    if n == 0:
        break
    else:
        for i in range(0,n):
            nome = input()
            cor, tamanho = map(str, input().split())
            lista.append([cor,tamanho,nome])
    lista.sort(key=lambda row:row[2])        
    lista.sort(key=lambda row:row[1], reverse=True)   
    lista.sort(key=lambda row:row[0])

for i in lista:
    print(*i)








        



