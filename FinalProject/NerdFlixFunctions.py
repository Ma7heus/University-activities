import os
import json
import getpass
from pickle import TRUE

def iniciar():
    os.system("cls")
    print(" -------SEJA BEM VINDO AO NERDFLIX--------\n\n")
    print("DIGITE A ACAO QUE DESEJA SEGUIR:")
    print("\n")
    print("Desejo me cadastrar: (1)")
    print("Desejo fazer login:  (2)")
    print("Desejo sair:         (3)")
    resposta = recebeInt("Sua resposta: ")

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
        json.dump(dados,dados_json,indent=4, ensure_ascii=False) 
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

def recebeStr(msg):
    while True:
        n = str(input(msg))
        if type(n) == str:
            return n
        else:
            print("ERRO! Valor precisa ser do tipo texto.\n")       


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
    print("Cadastro de produto    (2)")
    print("Consulta de produto    (3)")
    print("Atualizar produto      (4)")
    print("Relatorios de produtos (5)")
    print("Registrar venda        (6)")
    print("Sair                   (7)\n")
    resposta = recebeInt("Digite a opcao que deseja: ")

    if resposta ==1:        
        cadastrarCliente()      
    elif resposta  ==2:
        cadastrarProdutos()
    elif resposta  ==3:
        consultaProdutosPorCodigo() 
    elif resposta ==4:
        atualizarProdutos()
    elif resposta  ==5:
        relatorioPodutos()
    elif resposta ==6:
        registrarCompras()
    elif resposta  ==7:
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
    resposta = recebeInt("Digite a opcao que deseja: ")

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

    codigo = verificaCodigo()
    nome = str(input("Digite o nome do produto: "))
    preco = float(input("Digite o preco do produto: R$ ")) 
    tipo = recebeInt("Digite o TIPO do produto:\n(1) para série, (2) filme, (3) documentário: ")
    disponivel = recebeInt("Digite se esta diponivel para venda:\n(1) sim, (2) nao: ")
    if disponivel == 1:
        canBuy = True
    elif disponivel == 2:
        canBuy = False
    else:
        canBuy = False
    
    dados = buscarDados("products")
    listProductsKeys = list(dados.keys())

    dados.update({codigo : {"nome" : nome, "tipo" : tipo, "preco" : preco, "canBuy" : canBuy}})

    SalvarDados("products",dados)

    print("\n")
    print("Novo produto adicionado com sucesso!")
    resposta = recebeInt("Sair (1), Novo cadastro (2): ")
    if resposta == 1:
        acessoFuncionario()
    else:
        cadastrarProdutos()


#Funcao para receber e verificar se codigo ja existe
def verificaCodigo():
    dados = buscarDados("products")
    listProductsCodes = list(dados.keys())
    
    codigo = recebeInt("Digite o codigo do Produto: ")
    codigo = str(codigo)
    for i in listProductsCodes:
        if codigo == i:
            print("Codigo ja existe, digite outro!")
            codigo = int(codigo)
            return verificaCodigo()            
        else:
            codigo = int(codigo)
            return codigo


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
    dados.update({ID:{"id": ID, "nome": nome, "sobrenome": sobrenome, "carrinho":{}}})
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
    resposta2 = recebeInt("Selecione a opcao desejada: ")
    if resposta2 == 1:
        login()
    elif resposta2 == 2:
        iniciar()
    else:
        print("Opcao nao existe, tente novamente.")
        iniciar()


#Funcao que busca informacoes de produtos pelo Codigo
def consultaProdutosPorCodigo(): #FINALIZADA
    os.system("cls || clear")
    find = False
    cont = 0
    cont2 = 0
    codigo = recebeInt("Digite o codigo que deseja editar: ")
    codigo = str(codigo)
    dados = buscarDados("products")
    listProductsCodes = list(dados.keys())
    listProductsValues = list(dados.values())

    for i in listProductsCodes:
        cont += 1
        if i == codigo:
            find = True
            break

    if find:
        for i in listProductsValues:
            cont2 += 1
            if cont2 == cont:
                nome = i.get("nome")
                tipo = i.get("tipo")

                if tipo == 1:
                    tipon = ("Seriado")
                elif tipo ==2:
                    tipon = ("Filme")
                elif tipo == 3:
                    tipon = ("Documentario")
                else:
                    tipon = ("desconhecido")

                preco = i.get("preco")
                canBuy = i.get("canBuy")
                print("\n")
                print("Nome:  ",nome)
                print("Tipo:  ",tipon)
                print("preco: ",preco)
                print("Dispon:",canBuy)
                print("Nova Consulta (1), sair (2).")
                resposta = recebeInt("Resposta: ")
                if resposta == 1:
                    consultaProdutosPorCodigo()
                else:
                    acessoFuncionario()
                
    else:
        print("\n")
        print("Produto nao cadastrado! Tente novamente (1), sair (2).")
        resposta = recebeInt("Resposta: ")
        if resposta == 1:
            consultaProdutosPorCodigo()
        else:
            acessoFuncionario()

#Funcao para atualizar/editar informacoes de produtos ja existentes
def atualizarProdutos():
    os.system("cls || clear")
    find = False
    cont = 0
    cont2 = 0
    codigo = recebeInt("Digite o codigo que deseja editar: ")
    codigo = str(codigo)
    dados = buscarDados("products")
    listProductsCodes = list(dados.keys())
    listProductsValues = list(dados.values())

    for i in listProductsCodes:
        cont += 1
        if i == codigo:
            find = True
            break

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
    else:
        print("\n")
        print("Produto nao cadastrado! Tente novamente (1), sair (2).")
        resposta = recebeInt("Resposta: ")
        if resposta == 1:
            consultaProdutosPorCodigo()
        else:
            acessoFuncionario()

    print("Alteraçoes salvas com sucesso!")
    resposta = recebeInt("sair(1), Nova alteração (2): ")
    if resposta == 1:
        acessoFuncionario()
    else:
        atualizarProdutos()        

def registrarCompras():
    #informar login do cliente
    #informar o codigo de cada produto, devera mostrar o nome para
    #usuario saber se esta correto
    #se o produto nao estiver diponivel deve dar um erro e impedir a compra.
    #criar forma de encerra c compra e armazenar ela no carrinho
    nomeCliente = verificaCliente()


    


def verificaCliente(): #terminar
    os.system("cls || clear")
    nomeCliente = recebeStr("Nome do Cliente: ")
    encontrou = False

    dados = buscarDados("clients")
    listClientes = list(dados.values())
    for i in listClientes:
        nome = i.get("nome")
        if nome == nomeCliente:
            encontrou = True

    if encontrou ==False:
        print("Cliente nao encontrado!")
        print("Sair (1), tentar novamente (2):")
        resposta = recebeInt("Sua Resposta: ")
        if resposta == 1:
            acessoFuncionario()
        elif resposta == 2:
            return verificaCliente()
        else:
            acessoFuncionario()
    elif encontrou:
        return nomeCliente


def relatorioPodutos():
    print()
def relatorioCompras():
    print()


