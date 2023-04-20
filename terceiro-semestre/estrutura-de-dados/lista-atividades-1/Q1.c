#include <stdio.h>
int main() {
    printf("Digite a quantidade de horas trabalhadas: \n");
    double horas;
    scanf("%lf",&horas);
    printf("Digite o valor de cada hora trabalhada: \n");
    double valor;
    scanf("%lf",&valor);

    double resultado = 0;
    if(horas > 200){
        resultado = (horas * valor);
        resultado += (horas * valor)* 0.05;
    } else{
        resultado = horas * valor;
    }

    printf("%.2lf", resultado);
 
    return 0;









}