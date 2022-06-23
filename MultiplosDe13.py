x = int(input())
y = int(input())


soma = 0
sucessor = 0

for i in range(x, y+1):
    sucessor = sucessor = i
    if sucessor % 13 != 0:
        soma = soma + sucessor
        

print(soma)
