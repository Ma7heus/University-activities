from cgi import print_directory
from math import prod


n = int(input())
listaListas = []
listaOrganizada = []

for i in range(0,n):
    listaProd = input().split()
    listaListas.append(listaProd)

for lista in listaListas:
    for item in lista:
        if item not in listaOrganizada:
            listaOrganizada.append(item)
            listaOrganizada.sort()
            print(listaOrganizada)


