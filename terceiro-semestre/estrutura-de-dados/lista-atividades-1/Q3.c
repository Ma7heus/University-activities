#include <stdio.h>

int main(){

    int horaInicio;
    int horaFim;
    int duracao;
    printf("Inicio: \n");
    scanf("%d", &horaInicio);

    printf("Fim: \n");
    scanf("%d", &horaFim);

    if (horaFim < horaInicio){
        duracao = (horaFim - horaInicio) +24;
    } else{
        duracao = horaFim - horaInicio;
    }
    
    printf("Duracao: %d", duracao);
    printf(" horas");
    
    return 0;
}
