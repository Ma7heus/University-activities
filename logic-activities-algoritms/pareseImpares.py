n = int(input())
num = 0
listPar = []
listImpar = []
total = 0

for i in range(0,n):
    num = int(input())
    if num%2 != 0:
        listImpar.append(num)
    else:
        listPar.append(num)        

listImpar.sort()
listImpar.reverse()
listPar.sort()

total = listPar + listImpar
for i in total:
    print(f"{i}")

