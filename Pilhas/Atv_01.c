#include <stdio.h>
#include "libPilha_a.h"

void converteDecimal(int decimal,int base){
	
		tPilha p; //cria �rea de pilha um vetor onde ser�o colocados os dados
		inicializa(&p);
		
		
		
	while(decimal>0){
		push(&p, decimal%base);
		decimal = decimal / base;
	}//fim while
	
	mostraPilha(p);
}

int main(){
	
	int decimal;
	int base;
	printf("Valor para convers�o de base: ");
	scanf("%d", &decimal);
	
	printf("Valor da base: (2-8): ");
	scanf("%d",&base);
	
	converteDecimal(decimal,base);
	
	return 0;
}
