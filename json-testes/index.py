import json
import os
os.system("cls||clear")

def buscarDados():
    with open("db.json","r", encoding="utf-8") as db:
        dados = json.load(db)            
        return dados

def enviarDados(dadosAlterados,arquivoDB):
    with open("db.json","w") as db:
        json.dump(dadosAlterados,arquivoDB)

    #com  open ( "dados.json" , encoding = "utf-8" ) como  dados_json :
        #dados  =  json . carregar ( dados_json )

dados = buscarDados()
x = dados.keys()

for i in x:
    i["0003"] = "teste"




#listDados = list(dados["usuarios"].items())
#listkeys = list(dados["usuarios"].keys())
#print(listDados)
#print(listkeys)
#listDados.append({"0003",{"userName": "Fulano","senha":"1111"}})