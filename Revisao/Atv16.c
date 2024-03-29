#include <stdio.h>
#define MAX 10

typedef int tdado;

typedef struct{
	tdado pilha[MAX];
	int topo;
}tPilha;
//--------------------
void inicializa(tPilha *p){
	p->topo = -1;
}
//----------------------
int push(tPilha *p, tdado dado){
	if(p->topo == MAX-1) // cheio
		return 0;
	p->topo++;
	p->pilha[p->topo] = dado;	
	return 1;
}
//------------------------
tdado pop(tPilha *p){
	tdado removido = p->pilha[p->topo];
	p->topo--;
	return removido;
}
//---------------------------
tdado peek(tPilha p){
	return p.pilha[p.topo];
}
//------------------------
int isEmpty(tPilha p){
	if (p.topo == -1)
	  return 1; // vazia
	else
	  return 0;  
}
//------------------------
void mostraPilha(tPilha p){
	while(p.topo> -1){
		printf("%d|",p.pilha[p.topo]);
		p.topo--;
	}// fim while
	printf("\n");
}
void converteDecimal(int decimal,int base){
	
		tPilha p;
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
