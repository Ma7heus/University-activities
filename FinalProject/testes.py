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


#dadosClientes = buscarDados("clients")
#print(dadosClientes)

#lista = list(dadosClientes.items())
#print(lista)



#dados = buscarDados("users")
#listUsers1 = list(dados.values())
#listUsers2 = list(dados.keys())
#listUsers3 = list(dados.items())
#print(len(listUsers1),len(listUsers2),len(listUsers3))

#nerdflix = iniciar()


if find:
        for i in listProductsValues:
            cont2 += 1
            if cont2 == cont:
                nome = i.get("nome")
                tipo = i.get("tipo")
                preco = i.get("preco")
                canBuy = i.get("canBuy")

                print("\n")
                print("Nome:  ",nome)
                print("Tipo:  ",tipo)
                print("preco: ",preco)
                print("Dispon:",canBuy)
                print("\n")
                
                #PARTE NOVA
                print("O que deseja editar?")
                print("Nome           (1)")
                print("Tipo           (2)")
                print("Preco          (3)")
                print("Disp. p/ venda (4)\n")
                print("Nova Consulta (5), sair (6).")
                resposta = recebeInt("Resposta: ")
                
                if resposta == 1:
                    novoNome = str(input("Informe o nome: "))                    
                    dados.update({codigo : {"nome" : novoNome, "tipo" : tipo, "preco" : preco, "canBuy" : canBuy}})
                    SalvarDados("products",dados)

                elif resposta == 2:
                    novoTipo = recebeInt("Informe o Tipo: ")                   
                    dados.update({codigo : {"nome" : nome, "tipo" : novoTipo, "preco" : preco, "canBuy" : canBuy}})
                    SalvarDados("products",dados)

                elif resposta == 3:
                    novoPreco = float(input("Novo Preço: "))                  
                    dados.update({codigo : {"nome" : nome, "tipo" : tipo, "preco" : novoPreco, "canBuy" : canBuy}})
                    SalvarDados("products",dados)

                elif resposta ==4:
                    canBuyNew = recebeInt("Tipo: ")
                    dados.update({codigo : {"nome" : nome, "tipo" : tipo, "preco" : preco, "canBuy" : canBuyNew}})
                    SalvarDados("products",dados)

                elif resposta == 5:
                    consultaProdutosPorCodigo()
                else:
                    acessoFuncionario()


    "2": {
        "id": "2",
        "nome": "matheus 3",
        "sobrenome": "Biasi 3",
        "carrinho": {}

dados.update({ID:{"id": ID, "nome": nome, "sobrenome": sobrenome, "carrinho":{}}})
    SalvarDados("clients",dados)

        "123456": {
        "nome": "Como Treinar seu Dragão",
        "tipo": 2,
        "preco": 238.99,
        "canBuy": true
        }