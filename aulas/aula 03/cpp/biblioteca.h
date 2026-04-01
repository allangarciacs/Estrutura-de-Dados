#include <iostream>
#include <cstdlib>
#include <vector> 
#include <ctime>

using namespace std; // repete o cabeçalho aqui

/**
 * @brief Metodo que popula uma lista com numeros inteiros e aleatorios dentro de uma faixa
 * 
 * @param lista Armazena números inteiros e aleatórios 
 * @param quantidadeNumeros Total de numeros intieros a serem inseridos
 * @param faixaInicial Número inicial de faixa
 * @param faixaFinal Número final da faixa
 */
void popularListaAleatoria(vector<int>&lista, int quantidadeNumeros, int faixaInicial, int faixaFinal) {
    // Observe o símbolo & na frente da variável lista. Isso acontece pq em C++ se houver 
    // Alteração na linha, preciso utulizar o simbolo do endereçamento 

    srand(time(NULL));
    int numeroSorteado;
    for (int i = 0; i < quantidadeNumeros; i++) {
        numeroSorteado = faixaInicial + (rand() % faixaFinal);
        lista.push_back( numeroSorteado );
    }
}

/**
 * @brief Método que exibe o conteúdo de uma lista  
 * 
 * @param lista Lista contando numeros inteiros
 */
void exbirLista(vector<int> lista) {
    for (int i = 0; i < lista.size(); i++) {
        cout << lista[i] << "\n";
    }
    cout << "--------------------";
    cout << "\n";
    cout << "Total de elementos: " << lista.size() << "\n";
}

/**
 * @brief Método q copia o conteúdo da lista origem para dentro da lista destino retirando os itens relicados 
 * 
 * @param listaOrigem Lista original contendo todos os números 
 * @param listaDestino Lista final contendo somente os números não replicados
 */
void copiarListaSemReplicados(vector <int> listaOrigem, vector <int> listaDestino) {
    for (int item : listaOrigem) {
        // Em C++ precisamos procurar 
        if (find(listaDestino.begin(), listaDestino.end(), item) == listaDestino.end()) {
            listaDestino.push_back(item);
        }
    }
}
