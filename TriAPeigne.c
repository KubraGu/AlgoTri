#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void triepeigne(int tab[], int n) {
    int intervalle = n;
    int echange = 0;

    do {
        intervalle = (int) (intervalle / 1.3);
        if (intervalle < 1) {
            intervalle = 1;
        }
        echange = 0;
        for (int i = 0; i + intervalle < n; i++) {
            if (tab[i] > tab[i + intervalle]) {
                int pivot = tab[i];
                tab[i] = tab[i + intervalle];
                tab[i + intervalle] = pivot;
                echange = 1;
            }
        }
    } while (intervalle > 1 || echange);
}

int main() {
    int n = 200000;
    int tab[n];

    // Remplissage du tableau avec des valeurs aléatoires
    for (int i = 0; i < n; i++) {
        tab[i] = rand();
    }

    clock_t start = clock();
    triepeigne(tab, n);
    clock_t end = clock();
    double time_spent = (double)(end - start) / CLOCKS_PER_SEC;
    printf("\n Cela a prit : %f", time_spent);
    return 0;
}