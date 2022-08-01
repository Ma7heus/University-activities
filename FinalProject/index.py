from NerdFlixFunctions import *
from Cliente import *
from Produto import *
import json


resposta = iniciar()
if resposta == 1:
    print("CADASTRO DE NOVO USUARIO")
    tipoUsuario = verificaTipouUsuario()
elif resposta ==2:
        print("LOGIN DE USUARIO")
        login = login()
        if login == True:
            acessoFuncionario()

else:
    print("Opcao invalida, selecione (1) ou (2).")







