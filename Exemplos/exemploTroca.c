#include <stdio.h>

void trocaRef(int *a, int *b){
	
	int temp;
	
	temp=*a;
	*a=*b;
	*b=temp;
	
	printf("\n*** Funcao 2***\n");
	printf("A=%d B=%d\n",*a,*b);
}

void troca(int a, int b){	

	int temp;
	
	temp = a;
	a = b;
	b = temp;
	
	printf("*** Funcao 1***\n");
	printf("A=%d B=%d\n",a,b);
}

int main(){
	
	int a,b;
	
	printf("Entre com dois valores:");
	scanf("%d%d",&a,&b);
	
	troca(a,b);
	
	printf("*** Main ***\nA=%d B=%d",a,b);
	
	
	
	return 0;
}
