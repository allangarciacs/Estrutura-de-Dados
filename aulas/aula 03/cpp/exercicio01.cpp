#include <iostream>
#include <cstdlib>
#include <vector> // para a lista
#include <ctime>

using namespace std;

#include "biblioteca.h"

int main() {
    vector<int> listaNumeros;
    int quantidadeNumeros;
    int faixaInicial = 10, faixaFinal = 50;
    vector<int> listaResultados;

    cout << "Digite quantos numeros quer gerar: ";  //printf
    cin >> quantidadeNumeros; //scanf

    popularListaAleatoria(listaNumeros, quantidadeNumeros, faixaInicial, faixaFinal);
    exbirLista(listaNumeros);
    copiarListaSemReplicados(listaNumeros, listaResultados);
    exbirLista(listaNumeros);

    return 1;
}
