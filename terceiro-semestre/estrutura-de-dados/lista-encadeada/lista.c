#include <stdio.h>

struct funcionario{
    int id;
    char nome[30];
    double salario;
    struct funcionario *next;
};

typedef struct funcionario Func;

int main() {

    Func *head = (Func *)malloc(
        sizeof(Func));

        head ->next = NULL;

        if(head->next == NULL)
            printf("Lista vazia");  
        else
            printf("Lista com elementos!\n");

    Func *pafuncio = (Func *) malloc(
        sizeof(Func));

        pafuncio->id = 1;
        strcpy(pafuncio->nome, "Pafuncio");
        pafuncio->salario = 3000.0;
        pafuncio -> next = NULL;


        head -> next = pafuncio;

        if (head->next == NULL)
            printf("Lista vazia!\n");
        else
            printf("Lista com elementos!\n");

    Func *temp = head;
    int count = 0;
    while(temp->next != NULL){
        count ++;
        temp = temp->next;
    }

    printf("Número de itens na lista: %d\n", count);




    return 0;
}