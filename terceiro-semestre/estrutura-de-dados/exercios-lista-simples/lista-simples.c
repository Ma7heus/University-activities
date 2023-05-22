#include <stdio.h>
#include <stdlib.h>

struct item {
    int id;
    struct item *next;
};

typedef struct item Item;

int main(){

    Item *head = setItem(-1);

    int i;
    for (i = 0 ; i < 5 ; i++){
        Item *temp = setItem(i+1);
        insereNoFinal(head, temp);
    }
    imprimeLista(head);

    printf("Insere novo item no inicio.\n");
    Item *temp = setItem(0);
    insereNoInicio(head, temp);
    imprimeLista(head);

    printf("Insere novo item no final.\n");
    temp = setItem(6);
    insereNoFinal(head, temp);
    imprimeLista(head);

    printf("Removendo %d.\n", removeDaLista(head, 3));
    imprimeLista(head);

    printf("Removendo %d do início.\n", removeDoInicio(head));
    imprimeLista(head);

    printf("Removendo %d do final.\n", removeDoFinal(head));
    imprimeLista(head);

    return EXIT_SUCCESS;
}

Item *setItem(int id){
    Item *novo = (Item *) malloc(sizeof(Item *));
    novo->id = id;
    novo->next = NULL;
    return novo;
}

int listaVazia(Item *head){
    int isVazia = 1;
    Item *temp = head;
    while(temp->next != NULL){
        isVazia = 0;
    }
    return isVazia;
}

void imprimeLista(Item *head) {
    Item *temp = head;
    while (temp->next != NULL) {
        printf("ID %d", temp->id);
    }
}

void insereItem(int id){
    Item *novo = (Item *)malloc(sizeof(Item));
    

}





