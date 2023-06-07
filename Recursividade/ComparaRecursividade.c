#include <stdio.h>
#include <stdlib.h>

void f(int n){
	if(n == 0)
		printf(" fim");
	else{
		f(n-1);
		printf(" %d ",n);
		Sleep(300);
	}
}

void f2(int n){
	if(n == 0)
		printf("fim ");
	else{
		printf(" %d ",n);
		Sleep(300);
		f2(n-1);	
	}
}

int main(){
	int n;
	
	printf("Numero: ");
	scanf("%d",&n);
	
	printf("F1: ");
	f(n);
	printf("\n");
	printf("F1: ");
	f2(n);
	return 0;
}
