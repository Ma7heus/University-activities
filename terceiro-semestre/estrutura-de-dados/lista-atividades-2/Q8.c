#include <stdio.h>

int main() {

    float alturaA = 1.5;
    float alturaC = 1.10;
    int anos = 0;

    do {
        anos ++;
        alturaA += 0.02;
        alturaC += 0.03;
    } while (alturaC <= alturaA);

    printf("%d anos", anos);

    return 0; 
}