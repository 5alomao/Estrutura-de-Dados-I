#include <stdio.h>
#include <stdlib.h>
typedef struct{
	//cordenadas lab
	int x; 
	int y;	
}tdado;

typedef struct no{
	tdado dado;
	struct no *prox;
}tno;

typedef struct pilha{
	tno *topo
}tPilha;
//----------------
void inicializa(tPilha *p){
	p->topo = NULL;
}
//----------------
int push(tPilha *p, tdado novoDado){
	tno *novo;
	novo = malloc(sizeof(tno));
	if(novo ==NULL)
		return 0;
	novo->dado = novoDado; // Atribuindo valor
	novo->prox = p->topo; // Próximo é quem era o topo
	p->topo = novo;
	return 1;
}
//----------------
tdado pop(tPilha *p){
	tdado removido = p->topo->dado;
	tno *aux = p->topo; // Guardar endereço para liberar espaço de memória
	p->topo = p->topo->prox; // Movendo topo para no debaixo
	free(aux); //Libera área de memória
	return removido;
}
//----------------
tdado peek(tPilha p){
	return p.topo->dado;
}
//----------------
int isEmpty(tPilha p){
	return p.topo == NULL?1:0;
	
	/*
	if(p.topo == NULL)
		return 1;
	else
		return 0;
	*/
}
//----------------
void mostraPilha(tPilha p){
	while(p.topo!=NULL){
		printf("(%x)[%d,%d]->%x ",p.topo,p.topo->dado.x,p.topo->dado.y,p.topo->prox);
		p.topo = p.topo->prox; //Desce para o próximo dado
	}
	printf("\n");
}
//----------------
int menu(){
	int op;
	printf("*** Estrutura de Dados I - Pilha Encadeada ****\n");
	printf("1-Push (Inserir)\n");
	printf("2-Pop (Remover)\n");
	printf("3-Peek (Olhar Topo)\n");
	printf("4- Insere até Travar\n");
	printf("0-Sair\n");
	printf("Digite sua Escolha:");
	scanf("%d",&op);
	return op;
}
