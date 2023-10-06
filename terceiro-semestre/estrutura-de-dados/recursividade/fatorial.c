#include<stdio.h>

int fatorial(int n) {
    if (n == 0) {
        return 1;
    }
    else {
        return n * fatorial(n - 1);
    }
}

int main() {
    
    int numero;
    printf("digite um numero: ");
    scanf("%d", &numero);


    int fat = fatorial(numero);
    printf("Fatorial: %d\n", fat);

}