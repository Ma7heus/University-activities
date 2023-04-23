#include <stdio.h>

int main() {

    int num;
    printf("Digite um numero qualquer: ");
    scanf("%d", &num);
    int soma;
    for(int i=0;i<=num;i++){
        soma += i;
    }

    printf("%d",soma);

    return 0;
}