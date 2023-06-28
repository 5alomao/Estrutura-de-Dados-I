#include <stdio.h>

void removePar(tNo** head) {
	
    if (*head == NULL)
        return;

    tNo* a = *head;
    tNo* prev = NULL;

    while (a != NULL) {
        if (a->dado % 2 == 0) {
            if (prev == NULL) {
                *head = a->prox;
                free(a);
                a = *head;
            } else {    
                prev->prox = a->prox;
                free(a);
                a = prev->prox;
            }
        } else {
            prev = a;
            a = a->prox;
        }
    }
}
