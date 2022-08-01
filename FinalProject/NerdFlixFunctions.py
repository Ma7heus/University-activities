import os
import json

def iniciar():
    os.system("cls")
    print(" -------SEJA BEM VINDO AO NERDFLIX--------\n\n")
    print("DIGITE AS OPCOES A SEGUIR CONFORME A ACAO QUE DESEJA SEGUIR:")
    print("Desejo me cadastrar: (1)")
    print("Desejo fazer login:  (2)")
    resposta = int(input("Sua resposta: "))
    return resposta

def sair():
    os.system("cld || clear")
    iniciar()

def verificaTipouUsuario():
    os.system("cls")
    print("DIGITE A SEGUIR O SEU TIPO DE USUARIO:")
    print("Sou Cliente:      (1)")
    print("Sou Funcionario:  (2)")
    tipoUsuario = int(input("Sua resposta: "))
    return tipoUsuario

#funcao que consulta os dados no arquivo dados.json
def buscarDados():
    with open("dados.json", encoding="utf-8") as dados_json:
        dados = json.load(dados_json)
    return dados

#fazer validacao de login
def login():
    os.system("cls")
    loginUsuario = input("Digite seu login: ")
    senhaUsuario = input("Digite sua senha: ")

    dados = buscarDados()
    userValue = list(dados["usuarios"].values())
   
    for i in (0,len(userValue)-1):
        usuario = userValue[i].get("userName")
        senha = userValue[i].get("password")
        if loginUsuario == usuario and senhaUsuario ==senha:
            print(f"Login efetuado com sucesso, usuario: {loginUsuario}.")
            return True
        else:
            #print("usuario e senha incorretos, tente novamente!")
            #resposta = int(input("Digite: (1) tentar novamente, (2) sair: "))
            #if resposta == 1:
            #   login()
            #else:
            #    sair()
            continue

        








#funcao que tras a tela com o que o usuario tem acesso segundo o perfil
def acessoFuncionario():
    print("tela do funcionario!")








def cadastrarCliente():
    print()

def cadastrarFuncionario():
    print()



def cadastrarProdutos():
    print()
def consultarProdutos():
    print()
def atualizarProdutos():
    print()
def relatorioPodutos():
    print()
def registrarCompras():
    print()
def relatorioCompras():
    print()


