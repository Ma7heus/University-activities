#include<stdio.h>

int main(){

    int base, expoente;
    printf("Digite o valor da base: ");
    scanf("%d",&base);

    printf("Digite o valor do expoente: ");
    scanf("%d",&expoente);

    int pot;
    pot = potencia(base, expoente);
    printf("Potencia e %d\n", pot);
    
}

int potencia(int b, int e){
    printf("e = %d, b = %d ",e, b);
    if(e == 0){
        return 1;
    }
    if(e == 1){
        return b;
    } else{
        return b + (b * potencia(b, e -1));
    }

}