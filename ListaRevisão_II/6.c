#include <stdio.h>

int qtd = 0;

int h(int m, int n) {
	
	qtd++;
    if (n == 1) 
        return m + 1;
        
    if (m == 1) 
        return n + 1;
    
   return h(m, n - 1) + h(m - 1, n);
  
}

int main() {
    int r = h(3, 3);
    printf("O retorno para h(3, 3) eh: %d\n", r);
    printf("Numero de chamadas %d\n", qtd);
    return 0;
}
