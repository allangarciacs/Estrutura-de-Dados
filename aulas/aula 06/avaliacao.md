---

Diferenças entre vector, list, arraylist e linkedlist. Alem de dizer quando cada uma deve ser usada.

---

## **List**
É uma interface, que define o que uma lista deve fazer.
*  Por exemplo:
  - add()    - adicionar elementos
  - remove() - remover elementos
  - get()    - acessar pelo índice

É usada como um tipo genérico para listas. 

---

## **ArrayList**
É uma lista baseada em **array dinâmico**, que aumenta conforme a necessidade.
* Ela possui:
  - Acessa os elementos por índice rapidamente
  - Mas é mais lenta na insersão/remoção no meio, porque precisa deslocar todos os elementos
 
É a opção mais comum - tanto para guardar sequências de elementos quanto para fazer operações simples na lista.

---

## **LinkedList**
Lista duplamente encadeada - cada elemento aponta para o próximo ou para o anterior. 
* Serve para:
  - Inserções e remoções rápidas - se tiver a posição.
  - Acesso por índice mais lento, porque precisa percorrer a lista.
 
Usada quando houverem muitas incerções, remoçõe e manipulações no início ou no fim da lista. 

---

## **Vector**
Se parece com o ArrayList - também é baseado no **array dinâmico**.
  - É sicronizado (thread-safe) - tem controle para acesso concorrente, o que o torna mais lento e pesado

É mais comum em sistemas antigos, em sistemas mais modernos, o ArrayList é usado em seu lugar.

---

## **Resumo geral:**
* List → interface (define comportamento)
* ArrayList → melhor para acesso rápido
* LinkedList → melhor para muitas inserções/remoções
* Vector → antigo, sincronizado, pouco usado
