from NerdFlixFunctions import *
import json

resposta = iniciar()
if resposta == 1:
    print("CADASTRO DE NOVO USUARIO")
    tipoUsuario = verificaTipouUsuario()
elif resposta ==2:
        print("LOGIN DE USUARIO")
        tipoUsuario = verificaTipouUsuario()
else:
    print("Opcao invalida, selecione (1) ou (2).")



