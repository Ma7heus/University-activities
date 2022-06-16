numero =int(input("Digite um numero inteiro qualquer: "))
resultado = 0
divisor = 0
contador = 0
for i in range (1,11):
    divisor = divisor + i
    resultado = numero%divisor
    if resultado == 0:
        contador+=1
if contador >2:
    print(f"Numero {numero} NAO PRIMO.")
else:
   print(f"Numero {numero} é PRIMO.")    
    
print(contador)







