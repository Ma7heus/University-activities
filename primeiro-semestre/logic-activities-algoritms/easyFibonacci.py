n =  int(input())
list = []
num = 0
a = 1
b = 0
c = 0

for i in range(0,n):
    list.append(str(num))    
    c = b
    b = a
    a = num
    num = a + b   

def retornaPosicao(p):
    for i in range(0,p):
        x = i
    
    print(x)
    


print(" ".join(list))
retornaPosicao(5)

#com erro, corrigir