list1 = [40,41,40,39,32,32]  
list2 = ["E","E","D","D","E","D"]
contat = 0

for i in range(0,5):
    t = i
    l = i
    x = len(list1)
    for j in list1:
        if j+1 == list1[t]:
            print(list1[t])            
            print(j+1)
            list1.pop(t)
            print(list1)



print(contat)

            

    
 