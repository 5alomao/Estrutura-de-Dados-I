#include <stdio.h>

int pesquisa(tNo* v, int dado) {
    tNo* a = vet;

    while (a != NULL) {
        if (a->dado == dado) {
            return 1;
        }
        a = a->prox;
    }

    return 0;
}
