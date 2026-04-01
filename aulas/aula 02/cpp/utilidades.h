#include <cstdlib>
#include <string>
#include <iostream>
#define TAMANHO 10

using namespace std;

void inicializar(string vetor[]) {
    for (int i = 0; i < TAMANHO; i++){
        vetor[i] = "vazio";
    }
}

int inserir(string nome, string vetor[], int total) {
    if (total == TAMANHO) { 
        cout << "Vetor lotado";
    } else {
        for (int i = 0; i < TAMANHO; i++) {
            if (vetor[i] == "vazio") {
                vetor[i] = nome;
                total++;
                break;
            }
        }
    }
    return total;
}

void exibir(string vetor[]) {
    for (int i = 0; i < TAMANHO; i++) {
        if (vetor[i] != "vazio"){
            cout << vetor[i] << "\n";
        }
    }
}
