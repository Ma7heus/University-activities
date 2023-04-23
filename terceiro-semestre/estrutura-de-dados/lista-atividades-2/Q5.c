#include <stdio.h>

int main() {

    int num;
    printf("Digite um numero qualquer: ");
    scanf("%d", &num);
    int resultado = 1;

    if(num == 0 || num== 1) {
        resultado = 1;
    } else {
        for(int i=1; i<=num ; i++){
            resultado *= i;
        }
    }

    printf("Resultado: %d",resultado);

    return 0;
}