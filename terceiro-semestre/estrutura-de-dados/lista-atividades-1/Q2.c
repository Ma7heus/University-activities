#include <stdio.h>

int main(){
    float preco;
    printf("Preco do Produto: \n");
    scanf("%f", &preco);

    printf("Forma de pagamento: A vista(1), a prazo (2):");
    int pagamento;
    scanf("%i", &pagamento);

    if(pagamento == 1){
        preco -= preco * 0.05;
        printf("Preco a vista: %.2f", preco);
    } else if (pagamento == 2) {
        preco += preco * 0.1;
        printf("Preco a prazo: %.2f", preco);
    } else {
        printf("Opcao selecionada nao existe, tente novamente: \n");
        main();
    }

    return 0;
}
