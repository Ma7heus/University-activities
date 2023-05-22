#include <stdio.h>

int main() {

    float filhos;
    float salario;
    int count = 0;
    float somaSalario;
    float somaFilho;

     do {
        printf("Digite o salario: \n");
        scanf("%f", &salario);
        
         if(salario >= 0) {
            printf("Digite o numero de filhos: \n");
            scanf("%f", &filhos);
            somaSalario += salario;
            somaFilho += filhos;
            count++;
        }
       
    } while (salario > 0);

    printf("Media salarios: %.1f\n", somaSalario/count);
    printf("Media filhos: %.1f\n", somaFilho/count);




    return 0;
}