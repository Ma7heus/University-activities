import cv2
import numpy as np
import os
import csv

# Função principal
def __init__(valores_k, caminho_imagem):
    imagem_original = cv2.imread(caminho_imagem)
    aplicarKmedia(valores_k, caminho_imagem, imagem_original)

# Aplicar o algoritmo k-médias para cada valor de k
def aplicarKmedia(valores_k, caminho_imagem, imagem_original):
    dados = ['Valor de k', 'Resolução Original', 'Tamanho original(KB)', 'Quant cores iniciais', 'Resolução Gerada', 'Tamanho novo(KB)', 'Quant cores final']
    for k in valores_k:
        print(f'Aplicando k-médias para k = {k}...')
        # Realizar o agrupamento usando k-médias
        criteria = (cv2.TERM_CRITERIA_EPS + cv2.TERM_CRITERIA_MAX_ITER, 100, 0.2)
        _, labels, centroids = cv2.kmeans(imagem_original.reshape((-1, 3)).astype(np.float32), k, None, criteria, 10, cv2.KMEANS_RANDOM_CENTERS)
        # Reconstruir a imagem a partir dos centroides
        imagem_reconstruida = centroids[labels.flatten()].reshape(imagem_original.shape).astype(np.uint8)
        # Calcular as propriedades da imagem original
        resolucao_original, tamanho_original_kb, cores_unicas_original = calcularPropriedadesImagem(imagem_original, caminho_imagem)
        # Calcular as propriedades da imagem gerada
        resolucao_gerada, tamanho_gerado_kb, cores_unicas_geradas = calcularPropriedadesImagem(imagem_reconstruida, caminho_imagem)
        
        # Salvar as informações
        print(f'Para k = {k}:')
        print(f'Imagem original - Resolução: {resolucao_original} pixels, Tamanho: {tamanho_original_kb} KB, Cores únicas: {cores_unicas_original}')
        print(f'Imagem gerada - Resolução: {resolucao_gerada} pixels, Tamanho: {tamanho_gerado_kb} KB, Cores únicas: {cores_unicas_geradas}')
        cv2.imwrite(f'resultado_k{k}.jpg', imagem_reconstruida)

        dados.append([k, resolucao_original, tamanho_original_kb, cores_unicas_original, resolucao_gerada, tamanho_gerado_kb, cores_unicas_geradas])
    
    adicionarDadosCsv(nomeArquivo, dados)

# Função para calcular as propriedades da imagem
def calcularPropriedadesImagem(imagem, caminho_imagem):
    # Resolução da imagem em pixels
    resolucao = imagem.shape[0] * imagem.shape[1]
    # Tamanho ocupado em memória pela imagem em KB
    tamanho_memoria_kb = os.path.getsize(caminho_imagem) // 1024  # Tamanho em KB
    # Contagem de cores únicas na imagem
    cores_unicas = len(set(map(tuple, imagem.reshape(-1, 3))))
    return resolucao, tamanho_memoria_kb, cores_unicas

# Função para adicionar dados no arquivo csv
def adicionarDadosCsv(nome_arquivo, dados):
    with open(nome_arquivo, 'a', newline='') as arquivo_csv:
        writer = csv.writer(arquivo_csv)
        for dado in dados:
            writer.writerow(dado)




# Definir valores de k
valores_k = [2, 3, 5, 7, 9, 10, 15]

# Caminho da imagem
caminho_imagem = 'imagens/animaisPNG/lobo-guara.png'
nomeArquivo = 'lobo-guara.csv'  

# Executar o algoritmo
__init__(valores_k, caminho_imagem)