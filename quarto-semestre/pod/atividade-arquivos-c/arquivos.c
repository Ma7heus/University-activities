#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

// autor: MATHEUS PIETRO BIASI

char *nomeArquivo = "arquivo.txt";
char *nomeArquivo2 = "arquivo2.txt";

FILE *abrirArquivo(char *modoAbertura);

int main()
{

    // salva VETOR no arquivo **QUESTÃO 1 e 2**
    int n = 500;
    int *vetor = criaVetor(n);
    escreveVetor(vetor, n);

    // salva em um vetor com valores abixo da media no arquivo **QUESTÃO 3**
    removeMaioresQueMedia();

    // salva STRING no arquivo **QUESTÃO 4**
    char *texto = "Eu sei trabalhar em arquivos em C";
    salvaTexto(texto);

    // substitui parte da string por outra string **QUESTÃO 5**
    substituirString("em C", "em todas as linguagens de programação");

    // adiciona palavra em posição expecifica da stringh **QUESTÃO 6**
    adicionarPalavra("todas", "quase");

    return 0;
}

// metodo que escreve o vetor no arquivo **QUESTÃO 1**
int escreveVetor(int *array, int tamanho)
{
    FILE *arquivo = fopen('arquivo.txt', 'w');
    if (arquivo == NULL)
    {
        printf("Erro ao abrir o arquivo.\n");
        exit(1);
    }
    for (int i = 0; i < tamanho; i++)
    {
        fprintf(arquivo, "%d ", array[i]);
    }
    fclose(arquivo);
    printf("Arquivo gravado com sucesso\n");
    return 1;
}

// metodo que cria o vetor com numeros aleatorios e tamanho definido pelo usuario **QUESTÃO 2**
int criaVetor(int tamanho)
{
    int *vetor = (int *)malloc(tamanho * sizeof(int));
    srand(time(NULL));
    for (int i = 0; i < tamanho; i++)
    {
        int randomNumber = rand() % 10; // gera um numero aleatorio entre 0 e 9
        vetor[i] = randomNumber;
        randomNumber = 0;
    }
    printf("Vetor criado com sucesso\n");
    return vetor;
}

// metodo que salva em um vetor com valores abixo da media no arquivo **QUESTÃO 3**
void removeMaioresQueMedia()
{
    FILE *arquivo = fopen(nomeArquivo, "r");
    if (arquivo == NULL)
    {
        printf("Erro ao abrir o arquivo.\n");
        exit(1);
    }

    int tamanho = 0;
    int soma = 0;
    int numero;
    int *vetor = (int *)malloc(sizeof(int));

    while (fscanf(arquivo, "%d", &numero) != EOF)
    {
        tamanho++;
        soma += numero;
        vetor = (int *)realloc(vetor, tamanho * sizeof(int));
        vetor[tamanho - 1] = numero;
    }
    fclose(arquivo);

    float media = (float)soma / tamanho;

    FILE *arquivo = fopen(nomeArquivo, "r");
    if (arquivo == NULL)
    {
        printf("Erro ao abrir o arquivo.\n");
        exit(1);
    }

    for (int i = 0; i < tamanho; i++)
    {
        if (vetor[i] <= media)
        {
            fprintf(arquivo, "%d ", vetor[i]);
        }
    }

    fclose(arquivo);
    printf("Arquivo atualizado com sucesso\n");
}

// metodo que salva uma string no arquivo **QUESTÃO 4**
int salvaTexto(char *texto)
{
    FILE *arquivo = abrirArquivo("w");
    fprintf(arquivo, "%s", texto);
    fclose(arquivo);
    printf("String gravada com sucesso\n");
    return 1;
}

// meTodo que deleta parte da string e substitui por outra string **QUESTÃO 5**
void substituirString(char *stringDeletar, char *stringSubstituir)
{
    FILE *arquivo = abrirArquivo("r");
    char texto[100];
    fgets(texto, sizeof(texto), arquivo);
    char *resultado = strstr(texto, stringDeletar); // procura a string a ser deletada e retorna a posicao
    fclose(arquivo);

    if (resultado != NULL)
    {
        int posicao = resultado - texto;
        int tamanhoStringDeletar = strlen(stringDeletar);       // tamanho da string a ser substituida
        int tamanhoStringSubstituir = strlen(stringSubstituir); // tamanho da string substituta
        char novoTexto[100];
        strncpy(novoTexto, texto, posicao); // copia o texto ate a posicao da string a ser deletada
        novoTexto[posicao] = '\0';
        strcat(novoTexto, stringSubstituir);                       // concatena a string substituta
        strcat(novoTexto, texto + posicao + tamanhoStringDeletar); // concatena o restante da string
        salvaTexto(novoTexto);
    }
    else
    {
        printf("A palavra nao foi encontrada.\n");
    }
}

// metodo que adiciona uma palavra em uma posicao especifica da string **QUESTÃO 6**
void adicionarPalavra(char *palavra, char *novaPalavra)
{
    FILE *arquivo = abrirArquivo("r");
    char texto[100];
    fgets(texto, sizeof(texto), arquivo);
    fclose(arquivo);

    char *resultado = strstr(texto, palavra); // procura a palavra e retorna a posicao

    if (resultado != NULL)
    {
        int posicao = resultado - texto + strlen(palavra) + 1; // posicao da palavra + tamanho da palavra + 1 (para pular o espaço)
        char novoTexto[100];
        strncpy(novoTexto, texto, posicao); // copia o texto ate a posicao da palavra
        novoTexto[posicao] = '\0';
        strcat(novoTexto, novaPalavra);     // concatena a nova palavra
        strcat(novoTexto, " ");             // adiciona um espaço
        strcat(novoTexto, texto + posicao); // concatena o restante da string
        salvaTexto(novoTexto);
    }
    else
    {
        printf("A palavra nao foi encontrada.\n");
    }
}

// metodo que abre o arquivo
FILE *abrirArquivo(char *modoAbertura)
{
    FILE *arquivo = fopen(nomeArquivo2, modoAbertura);
    if (arquivo == NULL)
    {
        printf("Erro ao abrir o arquivo.\n");
        exit(1);
    }
    return arquivo;
}