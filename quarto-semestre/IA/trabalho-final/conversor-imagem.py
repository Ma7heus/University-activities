import cv2
import pandas as pd
import numpy as np
import os

def isKValido(k):
    print("Verificando se o valor de k é válido...")
    if k <= 0:
        raise ValueError("O número de clusters deve ser um número inteiro positivo maior que zero.")

def lerImagens(imagens):
    print("Lendo imagens...")
    imagens_lidas = []
    for imagem in imagens:
        imagens_lidas.append(cv2.imread(imagem))
    return imagens_lidas

def aplicandoKMediasParaKValores(k_valores, imagens_lidas):
    print("Aplicando o algoritmo k-médias...")
    imagens_geradas = []

    for k in k_valores:
        isKValido(k);
        centroides = []

        for imagem in imagens_lidas:
            # Aplica o algoritmo k-médias
            criteria = (cv2.TERM_CRITERIA_EPS + cv2.TERM_CRITERIA_MAX_ITER, 10, 1.0)
            centroides, labels = cv2.kmeans(imagem.reshape(-1, 3), k, criteria, None, cv2.KMEANS_RANDOM_CENTERS, cv2.KMEANS_PP_CENTERS)

            # Constrói a nova imagem a partir dos centroides
            imagem_gerada = np.full((imagem.shape[0], imagem.shape[1], 3), np.uint8)
            for i in range(len(labels)):
                imagem_gerada[i] = centroides[labels[i]]

            # Adiciona a imagem gerada à lista
            imagens_geradas.append(imagem_gerada)

    return imagens_geradas


def main(k_list):
    print("Iniciando a conversão das imagens...")

    imagens = ["imagens/animaisPNG/coruja.png"]
    arquivo_saida = "dados.csv"
    k_valores = k_list

    
    # Lista de imagens lidas
    imagens_lidas = lerImagens(imagens);
    # Lista de imagens geradas
    imagens_geradas = aplicandoKMediasParaKValores(k_valores, imagens_lidas)

    dados_analise = []
    # Coleta os dados das imagens originais
    for imagem in imagens_lidas:
        dados_analise.append([
            imagem.shape[0],
            imagem.shape[1],
            imagem.size / 1024,
            len(np.unique(imagem.reshape(-1))),
        ])

    # Coleta os dados das imagens geradas
    for imagem in imagens_geradas:
        dados_analise.append([
            imagem.shape[0],
            imagem.shape[1],
            imagem.size / 1024,
            len(np.unique(imagem.reshape(-1))),
        ])


    # Salva os dados_analise em um arquivo CSV
    with open(arquivo_saida, "w") as arquivo:
        writer = csv.writer(arquivo)
        writer.writerow(["Resolução", "Tamanho", "Cores únicas"])
        for linha in dados_analise:
            writer.writerow(linha)


# # Salva os dados_analise em um arquivo CSV
# dados = pd.DataFrame(dados_analise)
# dados.to_csv(arquivo_saida,  header=True)



__init__ = main(10)