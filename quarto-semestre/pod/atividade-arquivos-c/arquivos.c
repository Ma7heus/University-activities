#include <stdio.h>
#include <stdlib.h>
#include <time.h>

char *nomeArquivo = "arquivo.txt";
char *nomeArquivo2 = "arquivo2.txt";

int main() {

    // salva VETOR no arquivo
    // int n = 500;
    // int *vetor = criaVetor(n);
    // escreveVetor(vetor, n);


    // salva STRING no arquivo
    char *texto = "Eu sei trabalhar em arquivos em C";
    salvaTexto(texto);

    substituirTexto("em C", "em todas as linguagens de programação");
    
    return 0;
}

// metodo que escreve o vetor no arquivo
int escreveVetor(int *array, int tamanho){
    FILE *arquivo = fopen(nomeArquivo, "w");
    if(arquivo == NULL) {
        printf("Erro na abertura do arquivo");
        exit(1);
    }
    for(int i = 0; i < tamanho ; i++) {
        fprintf(arquivo, "%d ", array[i]);
    }
    fclose(arquivo);
    printf("Arquivo gravado com sucesso\n");
    return 1;
}

// metodo que cria o vetor com numeros aleatorios e tamanho definido pelo usuario
int criaVetor(int tamanho) {
    int *vetor = (int *) malloc(tamanho * sizeof(int));
    srand(time(NULL));
    for(int i = 0; i < tamanho; i++) {
        int randomNumber = rand() % 10; // gera um numero aleatorio entre 0 e 9
        vetor[i] = randomNumber;
        randomNumber = 0;
    }
    printf("Vetor criado com sucesso\n");
    return vetor;
}

// metodo que salva uma string no arquivo
int salvaTexto(char *texto) {
    FILE *arquivo = fopen(nomeArquivo2, "w");
    if(arquivo == NULL) {
        printf("Erro na abertura do arquivo");
        exit(1);
    }
    fprintf(arquivo, "%s", texto);
    fclose(arquivo);
    printf("String gravada com sucesso\n");
    return 1;
}

//meTodo que deleta parte da string e substitui por outra string
int substituirTexto(char *textoDeletar, char *textoSubstituir) {
    FILE *arquivo = fopen(nomeArquivo2, "r");
    if (arquivo == NULL)
    {
        printf("Erro na abertura do arquivo");
        exit(1);
    }
    
    char buffer[1000];
    int found = 0;
    while (fgets(buffer, 1000, arquivo))
    {
        if (strstr(buffer, textoDeletar))
        {
            found = 1;
            break;
        }
    }
    fclose(arquivo);
   
   
    if (found) {
        arquivo = fopen(nomeArquivo2, "r");
        FILE *temp = fopen("temp.txt", "w");
        if (arquivo == NULL || temp == NULL)
        {
            printf("Erro na abertura do arquivo");
            exit(1);
        }
        while (fgets(buffer, 1000, arquivo))
        {
            if (strstr(buffer, textoDeletar))
            {
                fprintf(temp, "%s", textoSubstituir);
            }
            else
            {
                fprintf(temp, "%s", buffer);
            }
        }
        fclose(arquivo);
        fclose(temp);
        remove(nomeArquivo2);
        rename("temp.txt", nomeArquivo2);
        printf("Texto substituído com sucesso\n");
        return 1;
    }
    else
    {
        printf("Texto não encontrado\n");
        return 0;
    }
}
