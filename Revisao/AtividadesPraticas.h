//12. Crie uma função para verificar se um elemento existe em uma fila circular estática. 
int existe(tFilaCircular f, tdado x){
        while(f.ini <= f.fim){
            if(f.fila[f.ini].num == x.num)
                return 1;
         f.ini++;
    }// fim while
    return 0;
}
//-------------------------------------------------------

//13. Crie uma função que dado um valor, retorne a posição que o mesmo se encontra na fila linear com implementação dinâmica. 
int retornaPosicao(tFila f, tdado dado){
	int pos=0;
	while(f.ini != NULL){
		if(f.ini->dado.x == dado.x){
			return pos;
		}
		pos++;
		f.ini = f.ini->prox;
	}
	return -1;
	printf("\n");
}
//-----------------------------------------

//14. Crie uma função para apresentar o último elemento da fila.
tdado last(tFila f){
	return f.fim->dado;
}
//ou
void last2(tFila f){
	printf("Ultimo: %d\n",f.fim->dado.x);
}
//-----------------------------------------

//15. Crie uma função para mostrar a quantidade de elementos da fila. 
int qtdElementos(tFila f){
	return f.tamanho;
}
//------------------------------------------------

//17. Escreva uma função que verifique se uma fila encadeada que contém números  inteiros está em ordem crescente.

int testaCrescente(tFila f){ 
    while(f.ini != NULL && f.ini->prox != NULL){
        if(f.ini->dado.x > f.ini->prox->dado.x)
            return 0;
        f.ini = f.ini->prox;
    }
    return 1;
}
//---------------------------------------------

//18. Crie a função para mostrar o topo da pilha que utiliza estrutura encadeada.

tdado peek(tPilha p){
	return p.topo->dado;
}
//-------------------------------------------------

//19. Crie uma função isFull que retorne 1 caso uma pilha estática esteja cheia.

int isFull(tPilha p){
	if(p.topo == MAX-1)
		return 1;
	else
		return 0;
}
//--------------------------------------------------
