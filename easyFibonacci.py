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
    

print(" ".join(list))