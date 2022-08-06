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

def sair(): #FINALIZADA
    print("Fim")
    exit()

#funcao que consulta os dados no arquivo dados.json
def buscarDados(tipo): #FINALIZADA
    arquivo = ""
    if tipo == "users":
        arquivo = "users.json"
    elif tipo == "products":
        arquivo = "products.json"
    elif tipo == "clients":
        arquivo = "clients.json"
    else:
        print("nome de arquivo nao existe")

    with open(arquivo,"r", encoding="utf-8") as dados_json:
        dados = json.load(dados_json)
        dados_json.close()
    return dados


def SalvarDados(tipo,dados): #FINALIZADA
    arquivo = ""
    if tipo == "users":
        arquivo = "users.json"
    elif tipo == "products":
        arquivo = "products.json"
    elif tipo == "clients":
        arquivo = "clients.json"
    else:
        print("nome de arquivo nao existe")

    with open(arquivo, "w", encoding="utf-8") as dados_json:
        json.dump(dados,dados_json,indent=4)    
    return "Informacoes salvas!"


#fazer validacao de login
def login(): # NAO FINALIZADA
    os.system("cls")
    dados = buscarDados("users")
    listUsers = list(dados.values())
    usuario = ""
    
    loginUsuario = input("Digite seu login: ")
    senhaUsuario = input("Digite sua senha: ")

    for i in (0,len(listUsers)-1):
        usuario = listUsers[i].get("userName")
        senha = listUsers[i].get("password")
        print(usuario,senha)
        if loginUsuario == usuario:
            break

    if senhaUsuario == senha:
        return True
    else:
        return False

    # fazer tratamento para quando a senha da errado


#funcao que tras a tela com o que o usuario tem acesso segundo o perfil
def acessoFuncionario(): #FINALIZADA
    os.system("cls||clear")    
    print("TELA DO FUNCIONARIO!\n")
    print("Cadastrar de Cliente   (1)")
    print("Consulta de produto    (2)")
    print("Atualizar produto      (3)")
    print("Relatorios de produtos (4)")
    print("Registrar venda        (5)\n")
    resposta = int(input("Digite a opcao que deseja: "))
    return resposta

def cadastrarCliente(): #FINALIZADA
    print("AREA DE CADASTRO DO CLIENTE:")
    print("Cadastrar novo Cliente  (1)")
    print("Consulta cliente        (2)")
    print("Editar dados do cliente (3)")
    resposta = int(input("Digite a opcao que deseja: "))
    return resposta


def cadastrarProdutos():
    os.system("cls||clear")
    print("CADASTRO DE PRODUTOS:")
    codigo = int(input("Digite o codigo do produto: "))
    nome = str(input("Digite o nome do produto: "))
    preco = float(input("Digite o preco do produto: R$ "))
    tipo = int(input("Digite o TIPO do produto:\n(1) para série, (2) filme, (3) documentário: "))
    disponivel = int(input("Digite se esta diponivel para venda:\n(1) sim, (2) nao: "))
    

def cadastroNovoCliente(): #FINALIZADA
    os.system("cls||clear")

def validacaoUsuarioNovo(userName,listUserName):
    for i in listUserName:
        if i["userName"] == userName:
            return True
        else:
            return False


def cadastrarUsuario():
    os.system("cls||clear")
    print("CADASTRO DE USUARIO")
    nome = str(input("Digite o nome do seu Login: "))
    senha = str(input("Digite a sua senha de login: "))
    listID = []

    dados = buscarDados("users")
    listUsers = list(dados.values())
    listUserKeys = list(dados.keys())

    userAlreadyExist =  validacaoUsuarioNovo(nome,listUsers)
    if userAlreadyExist == True:
        print("Esse login ja existe, faca login ou selecione um login diferente.")
        print("Digite (1) Login, (2) Cadastrar usuario")
        resposta = int(input("Sua resposta: "))
        if resposta == 1:
            loginUsuario()
        elif resposta == 2:
            return cadastrarUsuario()
        else:
            print("Opcao selecionada nao existente")
            sair()
    else:
        #transforma a key em numero inteiro e cria novo ID
        for i in listUserKeys:
            listID.append(int(i))
        for i in listID:
            ID = i
        ID = ID + 1
        ID = str(ID)
        
        dados.update({ID:{"userName": nome, "password": senha}})
        SalvarDados("users",dados)
        
    return True
  



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


