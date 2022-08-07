import os
import json
import getpass

def iniciar():
    os.system("cls")
    print(" -------SEJA BEM VINDO AO NERDFLIX--------\n\n")
    print("DIGITE A ACAO QUE DESEJA SEGUIR:")
    print("Desejo me cadastrar: (1)")
    print("Desejo fazer login:  (2)")
    print("Desejo sair:         (3)")
    resposta = int(input("Sua resposta: "))

    if resposta == 1:
        cadastrarUsuario()
    elif resposta == 2:
        login()
    elif resposta == 3:
        sair()
    else:
        print("Seu corno, digite apenas 1 ou 2.")
        iniciar()

def sair(): #FINALIZADA
    os.system("cls || clear")
    print("Voce saiu do Nerdflix")
    print("\n\n")
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

def recebeInt(msg):
    ok = False
    valor = 0
    while True:
        n = str(input(msg))
        if n.isnumeric():
            valor = int(n)
            ok = True
        else:
            print("ERRO! Valor precisa ser do tipo inteiro.")
        if ok:
            break
    return valor

#fazer validacao de login
def login(): # NAO FINALIZADA
    os.system("cls")
    dados = buscarDados("users")
    listUsers = list(dados.values())
    usuario = ""
    
    loginUsuario = input("Digite seu login: ")
    senhaUsuario = getpass.getpass("Digite sua senha: ")

    for i in (0,len(listUsers)-1):
        usuario = listUsers[i].get("userName")
        senha = listUsers[i].get("password")
        
        if loginUsuario == usuario:
            break
        #else:
            #return login()

    if loginUsuario == usuario and senhaUsuario == senha:
        acessoFuncionario()
    else:
        login()


#funcao que tras a tela com o que o usuario tem acesso segundo o perfil
def acessoFuncionario(): #NAO FINALIZADA
    os.system("cls||clear")    
    print("TELA DO FUNCIONARIO!\n")
    print("Cadastro de Cliente    (1)")
    print("Consulta de produto    (2)")
    print("Atualizar produto      (3)")
    print("Relatorios de produtos (4)")
    print("Registrar venda        (5)")
    print("Sair                   (6)\n")
    resposta = int(input("Digite a opcao que deseja: "))

    if resposta ==1:        
        cadastrarCliente()
    elif resposta  ==2:
        cadastrarProdutos()
    elif resposta ==3:
        atualizarProdutos()
    elif resposta  ==4:
        relatorioPodutos()
    elif resposta ==5:
        registrarCompras()
    elif resposta  ==6:
        sair()
    else:
        print("Opcao nao existente, tente novamente!")
        acessoFuncionario()


def cadastrarCliente(): #FINALIZADA
    os.system("cls || clear")
    print("AREA DE CADASTRO DO CLIENTE:")
    print("\n")
    print("Cadastrar novo Cliente  (1)")
    print("Consulta cliente        (2)")
    print("Editar dados do cliente (3)")
    print("Voltar                  (4)")
    resposta = int(input("Digite a opcao que deseja: "))

    if resposta == 1:
        cadastroNovoCliente()
    elif resposta == 2:
        print("Opcao ainda nao disponivel, tente novamente!")
        cadastrarCliente()
    elif resposta == 3:
        print("Opcao ainda nao disponivel, tente novamente!")
        cadastrarCliente()
    elif resposta == 4:
        acessoFuncionario()
    else:
        print("Opacao selecionada nao existe! Tente novamente.")
        cadastrarCliente()
    

def cadastrarProdutos():
    os.system("cls||clear")
    print("CADASTRO DE PRODUTOS:")
    codigo = recebeInt("Digite o codigo do produto: ")
    nome = str(input("Digite o nome do produto: "))
    preco = float(input("Digite o preco do produto: R$ "))
    tipo = int(input("Digite o TIPO do produto:\n(1) para série, (2) filme, (3) documentário: "))
    disponivel = int(input("Digite se esta diponivel para venda:\n(1) sim, (2) nao: "))
    

def cadastroNovoCliente(): #FINALIZADA
    os.system("cls||clear")
    print("CADASTRO DE CLIENTES")
    nome = str(input("Digite o nome do cliente: "))
    sobrenome = str(input("Digite o sobrenome do cliente: "))
    listID = []

    dados = buscarDados("clients")
    listClient = list(dados.values())
    listClientKeys = list(dados.keys())

    #transforma a key em numero inteiro e cria novo ID
    for i in listClientKeys:
        listID.append(int(i))
    for i in listID:
        ID = i
    ID = ID + 1
    ID = str(ID)        
    dados.update({ID:{"id": ID, "userName": nome, "password": sobrenome, "carrinho":{}}})
    SalvarDados("clients",dados)
      
    return True

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
    senha = getpass.getpass("Digite a sua senha de login: ")
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
            return login()            
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

    print("\n")    
    print("Fazer login: (1)")
    print("Sair:        (2)")
    resposta2 = input("Selecione a opcao desejada: ")
    if resposta2 == 1:
        login()
    elif resposta2 == 2:
        iniciar()
    else:
        print("Opcao nao existe, tente novamente.")
        iniciar()



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


