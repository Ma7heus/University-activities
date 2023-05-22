#include <stdio.h>

int main() {
    printf("Horas trabalhadas: \n");
    double horas;
    scanf("%lf",&horas);
    printf("Valor da hora: \n");
    double valor;
    scanf("%lf",&valor);

    double resultado = 0;
    if(horas > 200){
        resultado = (horas * valor);
        resultado += (horas * valor)* 0.05;
    } else{
        resultado = horas * valor;
    }

    printf("Salario: %.2lf", resultado);
 
    return 0;









}