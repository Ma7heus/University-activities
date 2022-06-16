x = int(input("Digite o valor de x: "))
y = int(input("Digite o valor de y: "))
soma = 0
sucessor = 0

for i in range(x,y):
    if i%13 != 0:
        soma = soma + i

print(soma)            
