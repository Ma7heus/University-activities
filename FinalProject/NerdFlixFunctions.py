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
    print("Fim")
    exit()

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

def validaUsuario(inputNome,inputSenha,login,senha):
    if inputNome == login and inputSenha == senha:
        return True
    else:
        return False
    #falta terminar a validacao para quando errar a senha



#fazer validacao de login
def login():
    os.system("cls")
    dados = buscarDados()
    userValue = list(dados["usuarios"].values())
    usuario = ""
    
    loginUsuario = input("Digite seu login: ")
    senhaUsuario = input("Digite sua senha: ")

    for i in (0,len(userValue)-1):
        usuario = userValue[i].get("userName")
        senha = userValue[i].get("password")
        if loginUsuario == usuario:
            break 
    userValidation = validaUsuario(loginUsuario,senhaUsuario,usuario,senha)
    if userValidation == True:
        return True
    else:
        return False


    #if senhaUsuario == senha:
    #    print(f"Login efetuado com sucesso, usuario: {loginUsuario}.")
    #    return True
    #else:
        #print("Seu login falhou, tente novamente!")
        #print("Selecione: (1) login, (2) sair")
        #respostaLogin = int(input("Sua resposta: "))
        #if respostaLogin == 1:
        #login()
        #else:
        #    sair()


#funcao que tras a tela com o que o usuario tem acesso segundo o perfil
def acessoFuncionario():
    os.system("cls||clear")    
    print("TELA DO FUNCIONARIO!\n")
    print("Cadastrar de Cliente   (1)")
    print("Consulta de produto    (2)")
    print("Atualizar produto      (3)")
    print("Relatorios de produtos (4)")
    print("Registrar venda        (5)\n")
    opcaoSelecionada = int(input("Digite a opcao que deseja: "))
    return opcaoSelecionada



def cadastrarCliente():
    print( AREA DE CADASTRO DO CLIENTE:)
    print("Cadastrar novo Cliente  (1)")
    print("Consulta cliente        (2)")
    print("Editar dados do cliente (3)")
    resposta = int(input("Digite a opcao que deseja: "))
    return resposta

def cadastrarFuncionario():
    print( CADASTRO DE USUARIOS:)
    print("Cadastrar novo usuario   (1)")
    print("Editar usuario existente (2)")
    resposta = int(input("Digite a opcao que deseja: "))
    return resposta


def cadastrarProdutos():
    print("CADASTRO DE PRODUTOS:")
    codigo = int(input("Digite o codigo do produto: "))
    nome = str(input("Digite o nome do produto: "))
    preco = float(input("Digite o preco do produto: R$ "))
    tipo = int(input("Digite o TIPO do produto:\n(1) para série, (2) filme, (3) documentário: "))
    disponivel = int(input("Digite se esta diponivel para venda:\n(1) sim, (2) nao: "))
    


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


