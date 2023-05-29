#include <stdio.h>

void infinityDream(int n){
	printf("Chamda %d:",n);
	
	if(n == 0)
		return;
	
	printf("Sonhando...\n");getch();
	
	Sleep(200);
	infinityDream(n-1);
	printf("Retorno instancia %d\n",n);
	getch();
} 

int main(){
	int x;
	scanf("%d",&x);
	infinityDream(x);
	
}
