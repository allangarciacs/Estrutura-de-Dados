### Estrutura de Dados
<pre>
- Disciplina ou uma área da Ciência da Computação que estuda algoritmos para melhor gestão de memória
- Estrutura de Dados Físicas
  - Variáveis - dependentes das linguagens de programação
    - int do Java é diferente do int do Ciência 

- Estruturas de Dados Abstratas 
  - Algoritmos de gestão de memória
  - Estrutuas Lineares - valores (matriz e dimensão)
    - Pilha (Stack);
        Inserção, remoção, estaVazia, tamanho, localizar, topo
    - Fila (Queue); 
        Inserção, remoção, estaVazia, tamanho, localizar, primeiro, ultimo
     - Lista (List);
</pre>
---
### Comandos 
<pre>
JAVA
javac nomeDoArquivo.java            -> compila
java nomeDoArquivo                  -> roda

C e C++
gcc .\nomeDoArquivo.c -o roda       -> compila o código c
g++ .\nomeDoArquivo.cpp -o roda     -> compila o código c++
.\roda.exe                          -> roda o código (c++ e c em win)
.\roda                              -> roda o código c no linux
  
PYTHON
python nomeDoArquivo.py             (no windows)
python3 nomeDoArquivo.py            (no linux)

VSCODE e TERMINAL
Ctrl + Shift + ´                    -> abre o terminal
Ctrl + d                            -> mudar nome de uma variável
ctrl + k + c                        -> comenta a area selecionada
dir / ls                            -> visualiza as pastas
cd nomeDaPasta                      -> entra na pasta 
Cls ou clear                        -> limpa o terminal 
</pre>
---
### Resumo
<pre>
Estruturas de Dados
  - Fíaicas: variáveis das linguagens de programação: int, float, string, vetores, matrizes, ...
  - Abstratas: 
       - Lista
           - C++      - vector
           - Java     - List, ArrayList, LinkedList
           - C#       - List, ArrayList
           - Python   - List
       - Pilha
       - Fila
       - Árvore
       - Grafo

Algoritmos de gestão de memória: guardar/armazenar e buscar/pesquisarda melhor forma possível (eficiência)
    - operações clássicas:
       -> Inserir  
            - C++      - push_back()
            - Java     - add()
            - C#       - Add()
            - Python   - append()
       -> remover pela posição ou pelo elemento
          - C++      - pop_back() ou erase() 
          - Java     - remove()
          - C#       - Remove()
          - Python   - remove() 
       -> verificar temanho da Estrutura
          - C++      - size() 
          - Java     - size()
          - C#       - Count()
          - Python   - lenght()                   
       -> se esta vazia
          - se o tamanho for igual a zero
          - empty() ou isEmpty()
  
  -> localizar
       vetor = [5,9,7,2,5]
       TAM   = 5

      - C 
          numero = 5
          encontrado = false
           for (int i = 0; i < TAM; i++) {
               if (numero == vetor[i]) {
                  encontrado = true;
                  break;
               }
           }
           if (encontrado) {
              print("numero encontrado");
           } else {
              print("numero nao encontrado");
           }
                    
      - Python
          vetor = [5,9,7,2,5]
          numero = 5 
          if numero in vetor;
              print("encontrado");
          else
              print("nao encontrado")
                        
      - Java
          vetor = [5,9,7,2,5]
          numero = 5
          if (vetor.contains(numero)) {
               System.out.println("encontrado");
           } else { 
               System.out.println("nao encontrado");
           }
                  
      - C#
           vetor = [5,9,7,2,5]
           numero = 5
           if (vetor.Contains(numero)) {
              Consule.write("encontrado");
           } else { 
              Console.write("nao encontrado");
           }
</pre>
---
### Matrizes especiais
<pre>
- Muitas linhas e muitas colunas - dimensão grande 
- Maioria das células é zero ou nula
- ocorrem em tratamento de imagem ou vídeos

Principais PROBLEMAS de matrizes especiais

Off 
  - Em python, uma matriz é uma lista de listas
  - linguem gol(?) da google
</pre>

  <img width="591" height="463" alt="image" src="https://github.com/user-attachments/assets/dd9d1326-8b67-435e-9d87-92e61349aecc" />

### Recursão
<pre>
Rescursão é uma técnica de repetição

// inicializaçao da variavel de controle 
// teste d parada
// tranformaçao da variavel de controle  
</pre>

### Árvores
<pre>
Árvore = Estrutura de Dados abstrata
  -> guarda e busca bem
  -> usa-se quanda há muitos dados que são buscados com muita frequência (> 40.000)
  -> genérica
  -> binária: 1 nodo - com 2 filhos no 

Conceitos
  -> raiz: nó ou nodo de uma subárvore
  -> folha: nó ou nodo sem filhos
  -> percurso (baseados em recursão)
     - RED                    (PESQUISA)
     - ERD                    (EXIBIÇÃO)
     - EDR                    (DESTRUIÇÃO DA ÁRVORE)

        8
      /   \
     3     10
    / \      \
   1   6      14
      / \     /
     4   7   13

RED (Raiz → Esquerda → Direita)         → if (arvore.contains(x)))  
8, 3, 1, 6, 4, 7, 10, 14, 13            
  
ERD (Esquerda → Raiz → Direita)         → for (Integer i : arvore) {
1, 3, 4, 6, 7, 8, 10, 13, 14

EDR (Esquerda → Direita → Raiz)
1, 4, 7, 6, 3, 13, 14, 10, 8

arvore.clear                 

Árvores binárias 
  - Pesquisa / Busca
Usar equals() ao invés de Comparator

  
</pre>

## Grafo
<pre>
Grafo = ED = Coleção
  Roteamento = Percurso = Caminhamento
    -> Track ou Route
              Rodoviário        Informática
REPRESENTAR { Equipamento     { Rede elétrica
              Aeroviário        Rm
              Ferroviário

((((Lista) Pilha) Fila) Árvore) Grafo)
Grafo 
        a ----> b
        ^      ^ \
         \    /   \
          \ /      \(b,C)
           d -----> c
            ^       |
              \     |
               \    (c,e)
                 \  e

CONCEITOS
  - nó ou nodo, porém, na matemática, é chamado de vértice
    .  v = {a,b,c,d,e}
  - Arestra ou arco (linhas de ligação entre nós)
    .  A = {a,b ; b,c ; c,e ; d,a ; d,b ; d,c ; e,d}
  - Grau = Arestas que chegam e partem
    . total
    . incidência (chegada)
    . partida
  - Simetria
    . Simétrico
    . Assimétrico = DIGRAFO
  - Represenação - Disco
                 - RAM

  Java
  class Grafo {
    int matrizADJ[][];
    int qtdVertices;

  public Grafo(int 

  
</pre>


