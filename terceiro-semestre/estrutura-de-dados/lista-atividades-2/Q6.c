#include <stdio.h>

int main() {

 int num;
 int count = 0;
 int total = 0;
 float porcentagem;

    do {
        printf("Digite um numero: \n");
        scanf("%d", &num);
        if (num > 0) {
            total++;
            if (num >= 10 && num <= 20) {
                count++;
            }
        }
    } while (num > 0);

    printf("total %d, count %d",total,count);

    if (total > 0) {
        porcentagem = (100/total) * count;
        printf("Entre 10 e 20: %.2f%%\n", porcentagem);
    } else {
        printf("Nenhum numero informado.\n");
    }

    return 0;
}
 