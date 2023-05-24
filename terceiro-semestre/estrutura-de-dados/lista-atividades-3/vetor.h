#define VETOR_H


struct tv2d {
    int p1;
    int p2;
};

typedef struct tv2d v2d;

v2d setPosicao(int p1, int p2);

void imprime(v2d vetor);

v2d soma(v2d v1, v2d v2);

v2d subtracao(v2d v1, v2d v2);

int modulo(v2d v);

int produtoInterno(v2d v);



