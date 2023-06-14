/*
1. Crie um código que compare o tempo de execução para gerar e 
apresentar os 40 primeiros termos da sequencia de Fibonacci 
utilizando recursividade sem tratamento e 
com programação dinâmica.
*/
#include <stdio.h>
long int memo[100];

void mostraVetor(int v[], int n){
	int i;
	for(i=0;i<=40;i++)
	  printf("%d | ",v[i]);
	  
	printf("\n");  
}

long int fibMemo(int n){
	if(n==0)
		return 0;
	if(n==1)
	 return 1;
	if(memo[n]!=-1) // ja calculou
	  return memo[n]; // retorna direto
	memo[n]= fib(n-1)+fib(n-2); //calcula e armazena
	return memo[n];  // depois retorna
}

int fib(int n){
	int r;
	if(n==0)
		return 0;
	
	if(n==1)
		return 1;
	
	r= fib(n-1)+fib(n-2);
	return r;
}
//-----------------
int main(){
	double ini,fim, trec;
	int n,i;
	long long res;
	printf("Termo:");
	scanf("%d",&n);
	//inicializar o vetor de memorização
	for(i=0;i<=n;i++)
		memo[i]=-1;

	ini = clock();
	for(i=0;i<=42;i++){
		printf("Termo %d da sequencia de Fibonacci=%d \n", i, fibMemo(i));
	}
	fim = clock();
	trec = (fim-ini) / 1000; 
	printf("Tempo:%.3lf\n", trec);
	
	ini = clock();
	for(i=0;i<=42;i++){
		printf("Termo %d da sequencia de Fibonacci=%d \n", i, fib(i));
	}
	fim = clock();
	trec = (fim-ini) / 1000; 
	printf("Tempo:%.3lf\n", trec);
	
	return 0;
}



