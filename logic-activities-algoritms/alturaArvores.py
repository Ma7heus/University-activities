n1 = 1.50
n2 = 1.10
stop  = False
cont =0
ano = 0

while stop == False:
    n1 = n1 + 0.02
    n2 = n2 + 0.03
    ano = ano + 1
    cont = cont + 1
    if n1 < n2:
        stop = True
        break

print(stop)
print(f"{ano} anos")
print(f"{n1:.2f}")
print(f"{n2:.2f}")
print("matheus")