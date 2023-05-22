#include <stdio.h>

int main() {

    printf("Digite um numero inteiro qualquer: \n");
    int numero;
    scanf("%d", &numero);
    int metade;
    if(numero /2 != 0){ 
        metade = (numero + 1)/2;
    } else{
        metade = numero /2;
    }

    for (int i = 1; i <= numero; i++ ){
        printf("%d\n",i);
        if(i == metade){
            printf("Metade\n");
        }
    }

    return 0;
}