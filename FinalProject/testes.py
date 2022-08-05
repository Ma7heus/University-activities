from NerdFlixFunctions import *
import json
import os
os.system("cls||clear")

#with open("users.json", "r", encoding="utf-8") as dados_json:
 #       dados = json.load(dados_json)
  #      dados_json.close()
  #      print(dados)
         
        #productsValues = list(dados["produtos"].values())
        #clientesValues = list(dados["clientes"].values())
        #usuariosValues = dict(dados["usuarios"].items())


#print(usuariosValues)
#usuariosValues.update({"0003":{"userName": "matheus 2", "senha":"12345"}})
#print(usuariosValues)

#with open("dados.json", "w", encoding="utf-8") as dados_json:
        #json.dump(usuariosValues,dados_json, indent=4)



#dados.update({"0004":{"userName": "matheus 3", "senha":"00000"}})
#print(dados)
#with open("users.json", "w", encoding="utf-8") as users_json:
 #       json.dump(dados,users_json, indent=4)


dadosClientes = buscarDados("clients")
print(dadosClientes)

dadosClientes.update({"0002":{"id": "0001", "nome": "matheus 3", "carrinho":{}}})
print(dadosClientes)

SalvarDados("clients",dadosClientes)


