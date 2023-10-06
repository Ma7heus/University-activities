/**
 * @file T1.c
 * @author Matheus Biasi e Artur Berno
 * @version 0.1
 * @date 2023-10-05
 *
 * @copyright Copyright (c) 2023
 *
 *
 */
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void copia(int *A, int *V, int size)
{
    for (int i = 0; i < size; i++)
        V[i] = A[i];
}

void printaArray(char texto[], int *A, int size)
{
    printf("\n%s ", texto);
    for (int i = 0; i < size; i++)
    {
        printf("%d ", A[i]);
    };
}

void swap(int *a, int *b)
{
    int temp = *(b);
    *b = *a;
    *a = temp;
};

void bubbleSort(int *A, int size)
{
    int i, j;
    long int contador = 0;
    for (i = 0; i < size; i++)
    {
        for (j = i + 1; j < size; j++)
        {
            if (*(A + j) < *(A + i))
            {
                swap((A + j), (A + i));
                contador++;
            }
        }
    }
    printf("\n Trocas no bubble: %ld\n", contador);
}

void selectionSort(int *A, int size)
{
    int min, aux;
    long int contador = 0;
    for (int i = 0; i < size - 1; i++)
    {
        min = i; // guarda o valor de i em min para testar no próximo loop se é o menor
        for (int j = i + 1; j < size; j++)
        {
            if (A[j] < A[min])
            {            // o valor da array que esta sendo acessado neste momento é o menor até agora?
                min = j; // se sim atualiza o valor da variável min
            }
            if (i != min)
            { // se não for atualiza a array trocando os valores de lugar com um auxiliar
                aux = A[i];
                A[i] = A[min];
                A[min] = aux;
                contador++;
            }
        }
    }
    printf("\n Trocas no selection: %ld\n", contador);
}

void insertionSort(int *A, int size)
{
    long int contador = 0;
    int aux, j;
    for (int i = 1; i < size; i++)
    { // inclui inicialmente o primeiro elemento começando com array[1]
        aux = A[i];

        for (j = i - 1; j >= 0 && A[j] > aux; j--)
        { // começando as comparações na primeira posição e dando loop até q o valor da array em j ser maior que o valor do aux (i)
            A[j + 1] = A[j];
            contador++;
        }

        A[j + 1] = aux;
        contador++;
    }
    printf("\n Trocas no insertion: %ld\n", contador);
}

int particiona(int *A, int baixo, int alto, long int *contador)
{
    int pivo = A[alto];
    int i = (baixo - 1);

    for (int j = baixo; j <= alto - 1; j++)
    {
        if (A[j] < pivo)
        {
            i++;
            swap(&A[i], &A[j]);
            (*contador)++;
        }
    }
    swap(&A[i + 1], &A[alto]);
    (*contador)++;
    return (i + 1);
}

void quickSort(int *A, int baixo, int alto, long int *contador)
{
    if (baixo < alto)
    {
        int indicePivo = particiona(A, baixo, alto, contador);
        quickSort(A, baixo, indicePivo - 1, contador);
        quickSort(A, indicePivo + 1, alto, contador);
    }
}

int main()
{
    int contadorExecusoes = 0;
    while (contadorExecusoes < 3)
    {
        contadorExecusoes++;
        printf("\n====Execucao numero %d====\n", contadorExecusoes);

        srand(time(NULL));
        int n = 1000000; // tamanho do vetor
        int *vet = (int *)malloc(n * sizeof(int));

        if (vet == NULL)
        {
            printf("Falha na alocação de memória.\n");
            return 1;
        }

        for (int i = 0; i < n; i++)
        {
            vet[i] = (n - i);
        }

        printf("\nVetor tamanho = %d\n", n);

        // // bubble sort
        // int *bubbleVec = (int *)malloc(n * sizeof(int));
        // copia(vet, bubbleVec, n);
        clock_t begin; // = clock();
        // bubbleSort(bubbleVec, n);
        clock_t end; // = clock();

        double time_spent; // = (double)(end - begin) / CLOCKS_PER_SEC;
        // printf("Bubble executou em: %f segundos.\n", time_spent);

        // selection sort -----------------------------

        // int *selectionVec = (int *)malloc(n * sizeof(int));
        // copia(vet, selectionVec, n);
        // begin = clock();
        // selectionSort(selectionVec, n);
        // end = clock();

        // time_spent = (double)(end - begin) / CLOCKS_PER_SEC;
        // printf("Selection executou em: %f segundos.\n", time_spent);

        // insertion sort ------------------------------

        // int *insertionVec = (int *)malloc(n * sizeof(int));
        // copia(vet, insertionVec, n);
        // begin = clock();
        // insertionSort(insertionVec, n);
        // end = clock();
        // time_spent = (double)(end - begin) / CLOCKS_PER_SEC;
        // printf("Insertion executou em: %f segundos.\n  ", time_spent);

        // quickSort ---------------------------------------

        int *quickVec = (int *)malloc(n * sizeof(int));
        long int contadorQuick = 0;
        copia(vet, quickVec, n);
        begin = clock();
        quickSort(quickVec, 0, n - 1, &contadorQuick);
        end = clock();
        time_spent = (double)(end - begin) / CLOCKS_PER_SEC;
        printf("\n Trocas no quick: %ld\n", contadorQuick);
        printf("Quick executou em: %f segundos.\n", time_spent);

        free(vet);
        // free(bubbleVec);
        // free(selectionVec);
        // free(insertionVec);
        free(quickVec);
    }

    return 0;
}