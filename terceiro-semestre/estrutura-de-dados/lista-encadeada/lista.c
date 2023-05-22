#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct funcionario{
    int id;
    char nome[31];
    double salario;
    struct funcionario *next;
};

typedef struct funcionario Funcionario;

int main(){
    Funcionario *head = (Funcionario *)malloc(
                            sizeof(Funcionario));

    head->next = NULL;

    if (head->next == NULL)
        printf("Lista vazia!\n");
    else
        printf("Lista com elementos!\n");

    Funcionario *pafuncio = (Funcionario *)malloc(
                                sizeof(Funcionario));

    pafuncio->id = 1;
    strcpy(pafuncio->nome, "Pafuncio");
    pafuncio->salario = 3000.0;
    pafuncio->next = NULL;

    head->next = pafuncio;
//---------Adiconando Matheus----
    Funcionario *matheus = (Funcionario * )malloc(sizeof(Funcionario));

    matheus->id = 2;
    strcpy(matheus->nome, "Matheus");
    matheus->salario = 15000.00;
    matheus->next = NULL;

    pafuncio->next = matheus;

    
    if (head->next == NULL)
        printf("Lista vazia!\n");
    else
        printf("Lista com elementos!\n");

    Funcionario *temp = head;
    int count = 0;
    while (temp->next != NULL){
        count++;
        temp = temp->next;
    }



    printf("Número de itens na lista: %d\n", count);

    







}