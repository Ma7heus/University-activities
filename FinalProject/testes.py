from NerdFlixFunctions import *
import json
import os
os.system("cls||clear")

with open("dados.json", encoding="utf-8") as dados_json:
        dados = json.load(dados_json)
        userValue = list(dados["products"].values())


#conta quantos objetos existem no dicionario
print(len(userValue))
#faz leitura de um dicionario dentro de uma lista
print(userValue[1])
#imprime um dos estados da classes demtro do dici
produto = userValue[1]
print(produto["name"])
#faz leitura de um estado do objeto
print(produto["price"])

produto["name"] = "MUDOU O NOME"
print(produto["name"])
print(userValue[1])
