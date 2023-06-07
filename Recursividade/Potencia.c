#include <stdio.h>
#include <stdlib.h>

int pot(int base, int exp){
	int r;
	printf("%d ^ %d\n",base,exp);getch();
	if(exp == 0){ // caso base
		printf("%d ^ 0 = 1\n",base);
		return 1;
	}//fim if
	
	//passo recursivo
	r = base * pot(base,exp-1);
	printf("%d ^ %d = %d\n",base,exp,r);getch();
	return r;
}// fim funcao

int main(){
	int base;
	int exp;
	printf("Valor para Base:");
	scanf("%d",&base);
	printf("Valor para Expoente:");
	scanf("%d",&exp);
	
	printf("Potencia de %d elevado a %d = %d\n",base, exp, pot(base,exp));
	return 0;
}
