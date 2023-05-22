#include <stdio.h>

int main() {
    printf("Operando 1: \n");
    int operando1;
    scanf("%d", &operando1);

    printf("Operando 2: \n");
    int operando2;
    scanf("%d", &operando2);

    int resultado;
    for(int i =0; i<operando2; i++) {
        resultado += operando1; 
    }

    printf("Resultado: %d", resultado);
    return 0;
}