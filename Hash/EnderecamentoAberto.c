#include <stdio.h>
#include <stdlib.h>
#define VAZIO 0
#define REMOVIDO 1
#define OCUPADO 2

typedef struct{
	char nome[40];
	long long cpf;
}tdado;

typedef struct{
   tdado dado;
   int estado;	
}thash;

int comp;
//--------------------------------
void inicializa(thash v[], int n){
	int i;
	for(i=0;i<n;i++)
	   v[i].estado = VAZIO;
}
//-------------------------------
int funcaoHash(long long chave, int n, int i){
	// criar a funcao hash
	return (chave+i)%n;
}
//-------------------------------
int insereHash(thash v[], tdado x, int n){
	int i=0, map;
	do{
		map = funcaoHash(x.cpf, n, i);
		if(v[map].estado != OCUPADO){ // se nao esta ocupada
		     // inserir o dado e retornar a posicao map
		     v[map].dado = x;
		     v[map].estado = OCUPADO; //diretiva de pr� compila��o
		     return map;
		}// fim if
		
		// se a posicao estiver ocupado ocorreu conflito
		printf("Ocorreu conflito - Deslocando\n");
		i++; // deslocar para prox posicao
	}while(i<n);
	// se percorrer todo vetor e n�o conseguiu inserir
	// retornar -1
	return -1;
}
//--------------------------
int busca(thash v[], int n, tdado x){
	comp=0;
	int map, i=0;
	do{
		map = funcaoHash(x.cpf, n, i);
		comp++;
		if(v[map].estado == VAZIO)
			return -1;
		// testar se nao posicao existe o dado buscado
		if(v[map].estado == OCUPADO && v[map].dado.cpf == x.cpf)
			return map;
		else
			i++;	
	}while(i<n);
	return -1;
}
//--------------------------
int deleteHash(thash v[], int n, tdado x){
     	int map;
     	map = busca(v,n,x);
     	if(map != -1)
     		v[map].estado = REMOVIDO;
     	
		return map;	
}
//--------------------------
int alteraHash(thash v[], int n, tdado x){
	int map;
     	map = busca(v,n,x);
     	if(map != -1){
     		v[map].dado.cpf = x.cpf;
		 }
		return map;
}
//-------------------
void printHash(thash v[], int n){
	int i;
	for(i=0;i<n;i++){
		if(v[i].estado==OCUPADO)
		   printf("[%d] - %d - %s |", i, v[i].dado.cpf, 
		                                  v[i].dado.nome);
		else
		  printf("[%d] -___|",i);                                  
	}// fim for 
	printf("\n"); 
}
//-----------------------
int menu(){
int op;
printf("\t\t*** IFSULDEMINAS - MACHADO ***\n\n");
printf("\t\t*** Estrutura de Dados I ***\n\n");
printf("\t\t*** HASH OPEN ADDRESS ***\n");
printf("1-Inserir\n");
printf("2-Remover\n");
printf("3-Buscar\n");
printf("4-Alterar\n");
printf("0-Sair\n");
scanf("%d",&op);
return op;
}
//-------------------------
int main(){
	int op, map, n;
	thash *v; // thash v[1000];
	tdado x,n;
	printf("Tamanho da tabela:");
	scanf("%d",&n);
	v = malloc(sizeof(thash)*n); // alocando o vetor de forma dinamica
	inicializa(v,n);
	do{
		printHash(v,n);
		op = menu();
		switch(op){
			case 1: printf("Entre com Nome:");
			        fflush(stdin); gets(x.nome);
			        printf("\nEntre com CPF:");
			        scanf("%d",&x.cpf);
			        map = insereHash(v,x,n);
			        if(map==-1)
			        	printf("Tabela cheia :(\n");
			        else
					 	printf("Inserido na posicao %d\n",map);
			break;	 	
			case 2: printf("CPF para remover:");
			         scanf("%d",&x.cpf);
			         map = deleteHash(v,n,x);
			         if(map == -1)
			         	printf("Chave nao existente para remocao\n");
			         else
					 	printf("Chave removida com sucesso! :)");	
			break;			
			case 3: printf("CPF para busca:");
			 		scanf("%d",&x.cpf);
					map = busca(v,n,x);
					if(map == -1)
						printf("Chave nao encontrada :(\n");
					else
						printf("Chave encontrada na posicao %d\n",map);
					
					printf("Quantidade de comparacoes:%d\n",comp);		
			break;	
			case 4: printf("CPF da pessoa para alterar:");
			         scanf("%d",&x.cpf);
			         // alterar	
			         printf("Digite o novo cpf:");
			         scanf("%d",&n.cpf);
			         alteraHash(v,n,n);
			break;			
			case 0: printf("Saindo...\n");
			break;		   
		}
		getch();
		system("cls");
	}while(op!=0);
}
