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

void insereItem(Item *itemAnterior, Item *novo){
<<<<<<< HEAD
    Item *novo = (Item *)malloc(sizeof(Item));
    
=======
    novo->next = itemAnterior->next;
}
>>>>>>> c76eee7f664938fbd34d563c23287bce4e8191fb

void insereNaLista(Item *head, Item *novo, int posicao){
    Item *temp = head;
    Item *ItemPosicao = NULL;
    int cont = 0;
    while(temp->next != NULL) {
        cont ++;
        if(cont == posicao){
            ItemPosicao = temp->next;
        }
    }
    novo->next = ItemPosicao;
    temp->next = novo;
}

void insereNoInicio(Item *head, Item *novo) {
    novo->next = head->next;
    head->next = novo;
}

void insereNoFinal(Item *head, Item *novo) {
    Item *ultimoItem = NULL;
    Item *temp = head;
    while(temp->next != NULL){
       Item *item = temp->next;
        if(item->next == NULL){
            item->next = novo;
        }
        temp = temp->next;
    }
}

int removeItem(Item *itemAnterior){
    Item *itemParaRemover = itemAnterior->next;
    itemAnterior->next = itemParaRemover->next;
    return 1;
}

int removeDaLista(Item *head, int posicao){
    Item *temp = head;
    Item *ItemPosicao = NULL;
    int cont = 0;
    while(temp->next != NULL) {
        cont ++;
        if(cont == posicao){
            ItemPosicao = temp->next;
        }
    }
    temp->next = ItemPosicao->next;
    return 1;
}

int removeDoInicio(Item *head){
    Item *primeiro = head->next;
    head->next = primeiro->next;
    return 1;
}

int removeDoFinal(Item *head) {
    Item *ultimoItem = NULL;
    Item *temp = head;
     
    while(temp->next != NULL) {
       Item *item = temp->next;
        if(item->next == NULL){
            temp->next = NULL;
            break;
        }
        temp = temp->next;
    }
    return 1;
}


