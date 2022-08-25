while True:
    list = []
    John = 0 
    Mary = 0
    n = int(input())
    if n == 0:
        break

    #recebendp valores da lista
    x = input()
    list = x.split()
    #transforma lista string em inteiro 
    valoresList = [int(val) for val in list] 

    # PARTE QUE VERIFICA QUANTAS VEZES CADA UM GANHOU
    for i in valoresList:
        John = sum(valoresList)
        Mary = len(valoresList)-John
        

    print(f"Mary won {Mary} times and John won {John} times")
    
