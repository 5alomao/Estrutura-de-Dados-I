#include <stdio.h>
#include <stdlib.h>

int n = 0;

int fib(int termo){
	int r;
	if(termo == 0)
		return 0;
		
	if(termo == 1)
		return 1;
	
	
	//passo recursivo
	n++;
	r = fib(termo-1) + fib(termo-2);
	n++;
	return r;
}// fim funcao

int main(){
	int testes;
	int valor;
	int i=0;
	scanf("%d",&testes);
	for(i; i<testes;i++){
	    scanf("%d",&valor);
	    printf("fib(%d) = %d calls = %d\n",valor,n,fib(valor));
	    n=0;
	}
	
	return 0;
}
