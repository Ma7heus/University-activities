#include <stdio.h>

int main() {
    int idade;
    printf("Idade: ");
    scanf("%d", &idade);

    if(idade <16){
        printf("Nao pode votar");
    } else if((idade >= 16 && idade < 18) || idade > 70){
         printf("Voto facultativo");
    } else {
         printf("Voto obrigatorio");
    }

    return 0;
}