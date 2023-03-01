#include <stdio.h>
#define MAX 10

typedef struct{
	char desc[50];
	char data[20];
}tdado;

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
tdado pop(tPilha *p, tdado dado){
	dado = p->pilha[p->topo];
	p->topo--;
	return dado;;
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
//------------------------
void mostraPilha2(tPilha p){
	while(p.topo> -1){
		printf("%s - %s |",p.pilha[p.topo].desc,p.pilha[p.topo].data);
		p.topo--;
	}// fim while
	printf("\n");
}
