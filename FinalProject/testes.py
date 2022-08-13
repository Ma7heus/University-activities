from NerdFlixFunctions import *
import json
import os
os.system("cls||clear")


with open("dados.json", encoding="utf-8") as dados_json:
        dados = json.load(dados_json)
        userValue = list(dados["products"].values())


#print(usuariosValues)
#usuariosValues.update({"0003":{"userName": "matheus 2", "senha":"12345"}})
#print(usuariosValues)

#with open("dados.json", "w", encoding="utf-8") as dados_json:
        #json.dump(usuariosValues,dados_json, indent=4)



#dados.update({"0004":{"userName": "matheus 3", "senha":"00000"}})
#print(dados)
#with open("users.json", "w", encoding="utf-8") as users_json:
 #       json.dump(dados,users_json, indent=4)


#dadosClientes = buscarDados("clients")
#print(dadosClientes)

#lista = list(dadosClientes.items())
#print(lista)



#dados = buscarDados("users")
#listUsers1 = list(dados.values())
#listUsers2 = list(dados.keys())
#listUsers3 = list(dados.items())
#print(len(listUsers1),len(listUsers2),len(listUsers3))

nerdflix = iniciar()





