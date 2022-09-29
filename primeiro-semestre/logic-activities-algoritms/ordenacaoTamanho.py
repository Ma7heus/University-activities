c = int(input())

for i in range(0,c):
    n = input().split()
    lista = sorted(n, key=len, reverse=True)
    print(*lista)