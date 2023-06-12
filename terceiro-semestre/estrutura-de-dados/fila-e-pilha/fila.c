/**
 * @file template_fila.c
 * @author Giancarlo Salton
 * @version 0.1
 * @date 2023-06-12
 *
 * @copyright Copyright (c) 2023
 *
 * @brief Arquivo template para funções à serem executadas em uma fila.
 *
 */
#include <stdio.h>
#include <stdlib.h>

struct item {
    int id;
    struct item* next;
};

typedef struct item Item;

Item* setItem(int id);
int filaVazia(Item* head);
void imprimeFila(Item* head);

// void enfileira(Item* itemAnterior, Item* novo);
// int desenfileira(Item* itemAnterior);

int main() {

    Item* inicio = (Item*)malloc(sizeof(Item*));
    inicio->next = NULL;

    for (int i = 0; i < 5; i++)
        enfileira(inicio, setItem(i));

    imprimeFila(inicio);

    int removido = desenfileira(inicio);

    printf("Item desenfileirado: %d\n", removido);

    imprimeFila(inicio);

    return 0;
}

Item* setItem(int id) {
    Item* novo = (Item*)malloc(sizeof(Item*));
    novo->id = id;
    novo->next = NULL;
    return novo;
}

enfileira(Item* inicio, Item* novo){
    Item *temp = inicio;

    while(temp -> next != NULL){
        temp = temp -> next;
    }
    temp -> next = novo;
    novo -> next = NULL;
}

int desenfileira(Item* inicio){
    Item *temp = inicio -> next;
    

}

