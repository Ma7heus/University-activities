x = int(input())
y = int(input())
list =[]


for i in range (y+1, x):
    if (i % 2 != 0):
        list.append(i)
print(sum(list))