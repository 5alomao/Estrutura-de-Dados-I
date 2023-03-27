#include <stdio.h>
#include <stdlib.h>
#include "pilhaEncadeada.h"
//PILHA ENCADEADA 

int main(){
	tPilha p1;
	inicializa(&p1);
	tdado dado;
	int op;
	do{
		printf("Endereco do Topo: [%x]\n",p1.topo);
		mostraPilha(p1);
		op = menu();
		switch(op){
			case 1: 
				printf("Dados para pilha - [x e y]: ");
				scanf("%d",&dado.x);
				scanf("%d",&dado.y);
				if(push(&p1,dado)==1)
					printf("Inserido com sucesso\n");
				else						
					printf("Pilha cheia - Stack Overflow\n");	
				break;
			case 2:	
				if(!isEmpty(p1)){//se nao for vazio
					dado = pop(&p1);
					printf("Dado removido: [%d,%d]\n",dado.x,dado.y);
				}
				else
					printf("Pilha vazia\n");
				break;
			case 3:	
				if(!isEmpty(p1)){//se nao for vazio
					dado = peek(p1);
					printf("Dado do topo: [%d,%d]\n",dado.x,dado.y);
					}
				else
					printf("Pilha vazia\n");
				break;
			case 4:
				srand(time(NULL));
				while(1){
					dado.x=rand()%10;
					dado.y=rand()%10;
					push(&p1,dado);
				}
				break;							
		}// fim switch
	    getch();// pausa
		system("cls");// limpa tela	
	}while(op!=0);
	return 0;                                
}
	
