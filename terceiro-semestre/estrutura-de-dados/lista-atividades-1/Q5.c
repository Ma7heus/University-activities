#include <stdio.h>

int main(){
    int posicao;
    printf("Posicao: ");
    scanf("%d",&posicao);

    if (posicao >= 1 && posicao <=5){
        printf("TOP 5");
    } else if(posicao >= 6 && posicao <=10){
         printf("TOP 10");
    } else if(posicao >= 11 && posicao <=20){
         printf("TOP 20");
    } else if(posicao >= 21 && posicao <=30){
         printf("TOP 30");
    } else{
        printf("TOP 100");
    }

    return 0;
}