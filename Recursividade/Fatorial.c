#include <stdio.h>
#include <stdlib.h>

int fat(int n){
	int r;
	
	if(n == 0){ // caso base
		return 1;
	}//fim if
	
	//passo recursivo
	r = n * fat(n-1);
	return r;
}// fim funcao

int main(){
	int n;
	printf("Valor para Fatorial:");
	scanf("%d",&n);
	printf("Fatorial de %d: %d\n",n,fat(n));
	return 0;
}
