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


