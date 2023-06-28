#include <stdio.h>

int crescente(tNo* head) {
	
    if (head == NULL || head->prox == NULL)
        return 1;
    

    tNo* a = head;
    
    while (a->prox != NULL) {
    	
        if (a->dado > a->prox->dado) 
            return 0;  
        
        a = a->prox;
    }

    return 1;  
}
