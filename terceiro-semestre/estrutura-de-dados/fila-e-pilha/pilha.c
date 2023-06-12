/**
 * @file template_pilha.c
 * @author Giancarlo Salton
 * @version 0.1
 * @date 2023-06-12
 *
 * @copyright Copyright (c) 2023
 *
 * @brief Arquivo template para funções à serem executadas em uma pilha.
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
int pilhaVazia(Item* head);
void imprimePilha(Item* head);

void empilha(Item* itemAnterior, Item* novo);
int desempilha(Item* itemAnterior);

int main() {

    Item* topo = (Item*)malloc(sizeof(Item*));
    topo->next = NULL;

    for (int i = 0; i < 5; i++)
        empilha(topo, setItem(i));

    imprimePilha(topo);

    int removido = desempilha(topo);

    printf("Item desempilhado: %d\n", removido);

    imprimePilha(topo);

    return 0;
}

Item* setItem(int id) {
    Item* novo = (Item*)malloc(sizeof(Item*));
    novo->id = id;
    novo->next = NULL;
    return novo;
}
