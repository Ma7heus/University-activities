#include <stdio.h>

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

int main() {
    int arr[] = {12, 11, 13, 5, 6, 7};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("Array original:\n");
    imprimirArray(arr, n);

    heapSort(arr, n);

    printf("Array ordenada usando Heap Sort:\n");
    imprimirArray(arr, n);

    return 0;
}

