from NerdFlixFunctions import *
import json
import os
os.system("cls||clear")

with open("dados.json", encoding="utf-8") as dbDados:
    dados = json.load(dbDados)

    a = list(dados["usuarios"].values())
    userValue = list(dados["products"].values())

x = json.dumps(a)
print(x)
