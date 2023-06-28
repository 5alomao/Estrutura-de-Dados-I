#include <stdio.h>

int soma(int vet[], int tam) {
	
    if (tam == 0)
        return 0;
    
    return vet[tam-1] + soma(vet, tam-1);
}

int main() {
	
    int vet[10], i, r;

    for (i = 0; i < 10; i++) 
        vet[i] = i;
    

    r = soma(vet, 10);
    printf("Soma: %d\n", r);

    return 0;
}

