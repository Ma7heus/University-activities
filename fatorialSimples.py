N = int(input())
list = []
fat = 1
for i in range (1,N+1):
    list.append(i)
for j in list:
    fat = fat*j
print(fat)




