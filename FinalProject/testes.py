from NerdFlixFunctions import *
import json


with open("dados.json", encoding="utf-8") as dados_json:
        dados = json.load(dados_json)
        userValue = list(dados["products"].values())

print(userValue)





print("✌ 😆")