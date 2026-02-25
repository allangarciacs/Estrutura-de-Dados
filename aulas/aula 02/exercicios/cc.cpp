#include <cstdlib>
#include <string>
#include <iostream>
#define TAMANHO 10

using namespace std;

#include "utilidades.h"


int main() {
    string vetorNomes[TAMANHO];
    int totalNomesInseridos = 0;

     inicializar(vetorNomes);

     totalNomesInseridos = inserir("Davi", vetorNomes, totalNomesInseridos);
     totalNomesInseridos = inserir("Allan", vetorNomes, totalNomesInseridos);
     totalNomesInseridos = inserir("Gabriel", vetorNomes, totalNomesInseridos);

     if (totalNomesInseridos > 0) {
         exibir(vetorNomes);
     } else {
         cout << "vetor de nomes vazio\n";

    }
    
    string nome;
    cout << "digite um nome: ";
    getline(cin, nome);

    exibir(vetorNomes);

    // int posicao;
    // posicao = ondeEsta(nome, vetorNomes);

    return 1;

}