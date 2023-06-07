#include <stdio.h>

int prob(int m, int n){
	int res;
	int h;
	
	if(n == 1){
		m +=1;
		return m;
	}
		
	
	if(m == 1){
		n +=1;
		return n;
	}
		
	if(n>1 && m>1)
		res = prob(m,n-1) + prob(m-1,n);
	
	return res;
}
int main(){
	int m;
	int n;
	printf("Valores:");
	scanf("%d%d",&m,&n);
	printf("Res: %d\n",prob(m,n));
	return 0;
}

