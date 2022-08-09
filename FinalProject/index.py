from NerdFlixFunctions import *
import json
import getpass
import os

os.system("cls || clear")



#nerdflix = iniciar()

dados = buscarDados("products")
values = list(dados.values())
#print(dados.keys())

#for i in values:
    #print("Nome: ", i.get("nome"))


c = consultaProdutos()
print(c)