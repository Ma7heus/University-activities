#include <stdio.h>

int main() {
    int num[5];

    num[0] = 1;
    num[1] = 2;
    num[2] = 3;
    num[3] = 4;
    num[4] = 5;
    num[5] = 6;
    
    int length = sizeof(num) / sizeof(int);

    for(int i = 0; i <= length; i++){
         printf("%d ", num[i]);   
    }

    return 0;
}