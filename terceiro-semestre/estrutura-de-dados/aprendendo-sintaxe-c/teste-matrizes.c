#include <stdio.h>

int main() {
    //int matriz[2][3] = {{0, 0, 0}, {1, 2, 3} };  

    // for(int i = 0; i < 2; i++){
    //      printf("\n");
    //      for(int j = 0; j<2; j++) {
    //         printf("%d ",matriz[i][j]);
    //      }   
    // }



// for (int i = 0; i< 10;i++){
//     printf("\nLinha %d - ", i);
//     for (int j = 0; j < 20; j++) {
//         printf("*");
//     }
// }

  char prod[4][30]={"Televisão ","Geladeira  ","Fogão     ", "Ar         "};
  char meses[6][4]={"Jan","Fev","Mar","Abr","Mai","Jun"};
  int vprod[4][6]={
    {500,250,134,320,98,100},
    {125, 254, 865, 321},
    {264, 251, 015, 551},
    {222, 151, 848, 545}
    };
  int l,c;

    for (int i = 0; i < 6; i++) {
        printf("%s ", meses[i]);
    }
    printf("\n");

  for (l=0;l<4;l++) {
     printf("\n%s:",prod[l]);
     for (c=0;c<6;c++)
        printf("%d ",vprod[l][c]);
  }

    return 0;
}