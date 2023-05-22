#include <stdio.h>


int main() {
    int countAlunos = 0;
    int matricula;
    float mediaTotal;
    float somaTota = 0;
    
    do{
        printf("Matricula: \n");
        scanf("%d", &matricula);
        if(matricula == 0){
            break;
        }


        countAlunos ++;
            int sumNotas = 0;
            float mediaAluno;

        for(int i = 1; i<=10;i++) {
            int nota;
            
            printf("Nota %d:", i);
            scanf("%d", &nota);
            sumNotas += nota;

        }
    mediaAluno = sumNotas / 10;
    somaTota += mediaAluno;
    
    printf("%d, media : %.2f\n",matricula, mediaAluno);


    } while (matricula != 0);
    
    mediaTotal = somaTota / countAlunos;
    printf("Media geral da turma: %.2f", mediaTotal);

    return 0;
}