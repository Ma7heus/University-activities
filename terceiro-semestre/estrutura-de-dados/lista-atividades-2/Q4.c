#include <stdio.h>

int main()
{

    while (1) {
        char operacao = '@';
        printf("Operacao que deseja realizar (+, -, *, /): ");
        scanf("%c", &operacao);

        if (operacao == '@') {
            break;
        }

        float num1;
        float num2;
        printf("Operador 1: \n");
        scanf("%f", &num1);

        printf("Operador 2: \n");
        scanf("%f", &num2);
        float resultado;

        switch (operacao)
        {
        case '+':
            resultado = num1 + num2;
            printf("\n%.2f + %.2f = %.2f\n", num1, num2, resultado);
            break;

        case '-':
            resultado = num1 - num2;
            printf("\n%.2f - %.2f = %.2f\n", num1, num2, resultado);
            break;

        case '*':
            resultado = num1 * num2;
            printf("\n%.2f * %.2f = %.2f\n", num1, num2, resultado);
            break;

        case '/':
            if (num2 == 0) {
                printf("\nNão é possível dividir por zero!\n");
            }
            else
            {
                resultado = num1 / num2;
                printf("\n%.2f / %.2f = %.2f\n", num1, num2, resultado);
            }
            break;

        default:
            printf("Operação %c nao existe.\n", operacao);
            break;
        }


    }
    printf("Programa encerrado.");

    return 0;
}