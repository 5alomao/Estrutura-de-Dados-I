#include <stdio.h>
#include <stdlib.h>

int fat(int n){
	int r;
	printf("fat(%d)\n",n);getch();
	if(n == 0){ // caso base
		printf("fat(0) = 1\n");
		return 1;
	}//fim if
	
	//passo recursivo
	r = n * fat(n-1);
	printf("Fat(%d) = %d\n",n,r);getch();
	return r;
}// fim funcao

int main(){
	int n;
	printf("Valor para Fatorial:");
	scanf("%d",&n);
	printf("Fatorial de %d: %d\n",n,fat(n));
	return 0;
}
