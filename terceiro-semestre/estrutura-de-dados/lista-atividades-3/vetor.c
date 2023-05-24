#include <stdio.h>
#include "vetor.h"
#include <math.h>


int main() {
    v2d v1 = setPosicao(2, 4);
    v2d v2 = setPosicao(1, 3);

    printf("Vetor v1: ");
    imprime(v1);
    printf("Vetor v2: ");
    imprime(v2);

    v2d somav = soma(v1, v2);

    v2d sub = subtracao(v1, v2);

    int mod = modulo(v1);
    printf("Módulo do vetor v1: %d\n", mod);

    int pordInt = produtoInterno(v1);
    printf("Produto interno do vetor v1: %d\n", pordInt);

    return 0;
}

v2d setPosicao(int p1, int p2) {
    v2d vetor; 
    vetor.p1 = p1;
    vetor.p2 = p2;
    return vetor;
}

void imprime(v2d vetor){
   printf("<%d, %d>\n", vetor.p1, vetor.p2);
}

v2d soma(v2d v1, v2d v2){
    v2d vetor;
    vetor.p1 = v1.p1 + v2.p1;
    vetor.p2 = v1.p2 + v2.p2;
    return vetor;
}

v2d subtracao(v2d v1, v2d v2){
    v2d vetor;
    vetor.p1 = v1.p1 - v2.p1;
    vetor.p2 = v1.p2 - v2.p2;
    return vetor;
}

int modulo(v2d v){
    int modulo = (v.p1 * v.p1 + v.p2 * v.p2);
    return sqrt(modulo);
}

int produtoInterno(v2d v){
    return v.p1 * v.p1 + v.p2 * v.p2;
}