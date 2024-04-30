#include <stdio.h>
#include <stdlib.h>

// Lê as notas dos estudantes e retorna o total de notas
int lerNotas(int notas[]) {
    int total=0;
    for(int i=0; i<4; i++) {
        printf("Entre a nota do estudante %d: ", i);
        scanf("%d", &notas[i]);
        total+=notas[i];
    }
    return total;
}

// Calcula e imprime a moda dos elementos do array
void calcularModa(int notas[]) {
    int frequencia[10]={0}, maiorFrequencia=0, moda=-1;
    for(int i=0; i<4; i++){
        frequencia[notas[i]]++;
        if(frequencia[notas[i]]>maiorFrequencia){
            maiorFrequencia=frequencia[notas[i]];
            moda=notas[i];
        }
    }
    printf("Moda: %d\n", moda);
}

// Calcula e imprime a mediana dos elementos do array
void calcularMediana(int notas[]){
    int meio=2; // 4 elementos no array
    qsort(notas, 4, sizeof(int), compare);
    if(meio%2==0){
        printf("Mediana: %d\n", (notas[meio-1]+notas[meio])/2);
    }else{
        printf("Mediana: %d\n", notas[meio]);
    }
}

// Calcula e imprime a média dos elementos do array
void calcularMedia(int notas[]){
    int total=lerNotas(notas);
    double media=(double)total/4;
    printf("Media: %.2f\n", media);
}

// Função de comparação para qsort
int compare(const void *a, const void *b) {
    return (*(int *)a-*(int *)b);
}

int main() {
    int notas[4];
    calcularMedia(notas);
    calcularMediana(notas);
    calcularModa(notas);
    return 0;
}