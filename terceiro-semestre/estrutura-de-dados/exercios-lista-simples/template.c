/**
 * @file template_lista_simples.c
 * @author Giancarlo Salton // Denio Duarte
 * @version 0.1
 * @date 2023-05-22
 *
 * @copyright Copyright (c) 2023
 *
 * @brief Arquivo template para funções para serem executadas em uma lista
 *      encadeada simples.
 *
 */

#include <stdio.h>
#include <stdlib.h>

struct item {
    int id;
    struct item *next;
};

typedef struct item Item;

// Item *setItem(int id);
// int listaVazia(Item *head);
// void imprimeLista(Item *head);

// void insereItem(Item *itemAnterior, Item *novo);
// void insereNaLista(Item *head, Item *novo, int posicao);
// void insereNoInicio(Item *head, Item *novo);
// void insereNoFinal(Item *head, Item *novo);

// int removeItem(Item *itemAnterior);
// int removeDaLista(Item *head, int posicao);
// int removeDoInicio(Item *head);
// int removeDoFinal(Item *head);

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