#include <stdio.h>

int main(){
    int positivos = 0;
    int negativos = 0;

    for(int i =1; i <5; i++){
        printf("N%d: ",i);
        int n;
        scanf("%d",&n);
        if(n >= 0){
            positivos ++;
        }else {
            negativos ++;
        }
    }

    printf("%d (+) e %d (-)", positivos, negativos);

    return 0;
}