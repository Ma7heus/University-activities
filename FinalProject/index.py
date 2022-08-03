from NerdFlixFunctions import *
from Produto import *
import json

rotina = 0
resposta = iniciar()

if resposta == 1:
    print("CADASTRO DE NOVO USUARIO")
    tipoUsuario = verificaTipouUsuario()
elif resposta ==2:
    print("LOGIN DE USUARIO")
    login = login()

if login == True:
    rotina = acessoFuncionario()
    if rotina ==1:
        cadastrarCliente()
    elif rotina ==2:
        cadastrarProdutos()
    elif rotina ==3:
        atualizarProdutos()
    elif rotina ==4:
        relatorioPodutos()
    elif rotina ==5:
        registrarCompras()
    else:
        print("Opcao nao existente!")      
elif login == False:
    sair()








