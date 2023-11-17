/**
 * @file tp2.c
 * @author Matheus Biasi, Artur Berno
 * @version 0.1
 * @date 2023-011-15
 *
 * @copyright Copyright (c) 2023
 */

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void radixsort(int arr[], int n);
int getMax(int arr[], int n);
void countSort(int arr[], int n, int exp);
void heapify(int arr[], int n, int i);
void heapSort(int arr[], int n);

// A função Radix Sort
void radixsort(int arr[], int n) {
    // Numero MAXIMO
    int m = getMax(arr, n);

    for (int exp = 1; m / exp > 0; exp *= 10)
		countSort(arr, n, exp);	//chamada da função COUNT SORT
}

int getMax(int arr[], int n) {
    int mx = arr[0];
    for (int i = 1; i < n; i++)
        if (arr[i] > mx)
            mx = arr[i];
    return mx;
}

// Função para fazer a contagem de classificação de arr[] de acordo com o dígito representado por exp.
void countSort(int arr[], int n, int exp) {
    int output[n]; // vetor de saída
    int i, count[10] = {0};
	int contador = 0;

    // Armazene a contagem de ocorrências em count[]
    for (i = 0; i < n; i++)
        count[(arr[i] / exp) % 10]++;

    // Mude count[i] para que count[i] agora conteM a posição atual desse dígito no output[]
    for (i = 1; i < 10; i++)
        count[i] += count[i - 1];

    // Construa o vetor de saída
    for (i = n - 1; i >= 0; i--) {
        output[count[(arr[i] / exp) % 10] - 1] = arr[i];
        count[(arr[i] / exp) % 10]--;
    }

    // Copie o vetor de saída para arr[], para que arr[] agora contenha números classificados de acordo com o dígito atual
    for (i = 0; i < n; i++){
        arr[i] = output[i];
	}

	printf("\n Trocas no radix: %d\n", contador);

}

void trocar(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void maxHeapify(int arr[], int n, int i) {
    int maior = i;
    int esq = 2 * i + 1;
    int dir = 2 * i + 2;

    if (esq < n && arr[esq] > arr[maior])
        maior = esq;

    if (dir < n && arr[dir] > arr[maior])
        maior = dir;

    if (maior != i) {
        trocar(&arr[i], &arr[maior]);
        maxHeapify(arr, n, maior);
    }
}

void heapSort(int arr[], int n) {
    int contador = 0;
    for (int i = n / 2 - 1; i >= 0; i--)
        maxHeapify(arr, n, i);

    for (int i = n - 1; i > 0; i--) {
        trocar(&arr[0], &arr[i]);
        contador++;
        maxHeapify(arr, i, 0);
    }

    printf("Número de trocas realizadas: %d\n", contador);
}

void imprimirArray(int arr[], int n) {
    for (int i = 0; i < n; ++i)
        printf("%d ", arr[i]);
    printf("\n");
}


// RadixSort %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
// int main()
// {
// 	srand(time(NULL));
// 	int n = 100000; // tamanho do vetor
// 	int *vet = (int *)malloc(n * sizeof(int));

// 	if (vet == NULL)
// 	{
// 		printf("Falha na alocação de memória.\n");
// 		return 1;
// 	}

// 	for (int i = 0; i < n; i++)
// 	{
// 		vet[i] = (n - i);
// 	}

// 	printf("\nVetor tamanho = %d\n", n);
// 	clock_t begin = clock();
// 	radixsort(vet, n); // chamada da função RADIX SORT
// 	clock_t end = clock();

// 	double time_spent = (double)(end - begin) / CLOCKS_PER_SEC;
// 	printf("RADIX executou em: %f segundos.\n", time_spent);

// 	free(vet);

// 	return 0;
// }



	// HeapSort %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
int main()
{
	srand(time(NULL));
	int n = 100000; // tamanho do vetor
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

	clock_t begin = clock();
	heapSort(vet, n); // chamada da função Heap Sort

	clock_t end = clock();

	double time_spent = (double)(end - begin) / CLOCKS_PER_SEC;

	printf("Heap Sort executou em: %f segundos.\n", time_spent);

	free(vet);

	return 0;
}
