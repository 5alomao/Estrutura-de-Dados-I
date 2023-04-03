#include <stdio.h>
#include <stdlib.h>
typedef struct{
	char processo[40];
	int tempo;
}tdado;

typedef struct no{
	tdado dado;
	struct no *prox;
}tno;

typedef struct{
	tno *ini,*fim;
	int tamanho;
}tFila;
//--------------------------
void inicializa(tFila *f){
	f->ini = NULL;
	f->fim = NULL;
	f->tamanho = 0;
}
//--------------------------
int enqueue(tFila *f, tdado x){ //passagem por referência da fila
 	tno *novo = malloc(sizeof(tno)); //Alocando uma nova área de memória - Novo nó // malloc retorna pro novo o endereço da alocação
	novo->dado = x;
	novo->prox = NULL;
	if(f->ini==NULL) //vazia
		f->ini = novo;
	else
		f->fim->prox = novo; //encadeando novo nó
		
	f->fim = novo;
	f->tamanho++;
	return 1;
}
//---------------------------
tdado dequeue(tFila *f){
	f->ini = f->ini->prox;
	f->tamanho--;
}
//------------------------------
int isEmpty(tFila f){

}
//--------------------------
void mostra(tFila f){ //passagen de parâmetro por valor da fila
	while(f.ini != NULL){
		printf("%s: %d | ->",f.ini->dado.processo,f.ini->dado.tempo);
		f.ini = f.ini->prox;
	}
	printf("\n");
}
//----------------------------
int menu(){
	int op;
	printf("*** Estrutura de Dados I - Fila Encadeada ****\n");
	printf("1-Enqueue (Inserir)\n");
	printf("2-Dequeue (Remover)\n");
	printf("3-Inicio e Fim\n");
	printf("0-Sair\n");
	
	printf("Sua Escolha:");
	scanf("%d",&op);
	
	return op;
}
//------------------
int main(){
	tFila f1;
	tdado x;
	int op;
	inicializa(&f1);
	do{
		mostra(f1);
		op = menu();
		switch(op){
			case 1: printf("Entre com o processo e tempo:");
					fflush(stdin);
					gets(x.processo);
					scanf("%d",&x.tempo);
					enqueue(&f1,x);
			break;
			case 2: if(!isEmpty(f1)) {
				      // ?
				     }// fim if vazio
				     else
				       printf("Process Queue empty :(\n");
				break;
			case 3:
			 break;	
			case 0: printf("Saindo .... ;)\n");	    
		}// fim switch
	    getch(); // system("pause");
	    system("cls");
	}while(op!=0);

	return 0;
}
