A = 0
G = 0
D = 0
n = 0
while n != 4:
    n = int(input())
    if n == 1:
        A = A + 1
    if n == 2:
        G = G + 1
    if n == 3:
        D = D +1

print("MUITO OBRIGADO")
print(f"Alcool: {A}")
print(f"Gasolina: {G}")
print(f"Diesel: {D}")