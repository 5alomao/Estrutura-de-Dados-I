#include <stdio.h>
#include <stdlib.h>

int fib(int termo){
	int r;
	
	printf("Fibo(%d)\n",termo);getch();
	if(termo == 0){
		printf("Fibo(%d) = 0\n",termo);getch();
		return 0;
	}
		
	if(termo == 1){
		printf("Fibo(%d) = 1\n",termo);getch();
		return 1;
	}
	
	//passo recursivo
	r = fib(termo-1) + fib(termo-2);
	printf("Fibo(%d) = %d\n",termo,r);
	return r;
}// fim funcao

int main(){
	int termo;
	
	printf("Termo: ");
	scanf("%d",&termo);
	
	printf("Fibonacci: %d",fib(termo));
	return 0;
}
