/* 
Coleções são Estruturas de Dados Abstratas
    - List -> Vector, ArrayList, LinkedList
        - Listas para armazenamento de dados, remoção, busca e relatórios.
    - Stack (pilha) - LIFO -> Last in, First Out - o último que entra é o primeiro a sair
        - TOPO - peak
        - Há somente duas operações clássicas: ROMOVER do topo e INSERIR no topo
            - push() - inserir
            - pop() - remover
        - Outros métodos básicos:
            - peek() - mostra o topo
            - size() - mostra o tamanho 
            - isEmpty() - verifica se vazia
            - contains() - procura por um elemento na pilha
     - Queue (fila) - FIFO -> Fist in, First out - primeiro que chega é o primeiro a sair
        - DOIS PONTEIROS: um para a cabeça (inicio <remover>; outro para a cauda(fim <inserir>))
        - Novamente, há somente dois métodos básicos
            - add()
            - remove()
        - Outro métodos básicos
            - size()
            - isEmpty()
            - contains()
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
public class Colecoes {
    public static void main(String[] args) {

        /* 
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(15);
        lista.add(5);
        lista.add(45);
        lista.add(100);
        lista.sort(null);
        System.out.println(lista.contains(100));
        lista.remove((Integer)100);
        System.out.println(lista.contains(100));

        Stack<Integer> pilha = new Stack<>();
        // pilha.add(15); // quando na pilha, é melhor usar push
        pilha.push(15); 
        pilha.push(5); 
        pilha.push(100);
        pilha.push(45);
        System.out.println(pilha);
        pilha.pop(); // tira o ultimo elemento
        System.out.println(pilha.contains(45));
        System.out.println("Topo: "+pilha.peek());

        Queue<Integer> fila = new LinkedList<>(); // uma fila, é uma lista encadeada, por isso n é 'new Queue'
        fila.add(15); 
        fila.offer(5); // pode usar tanto o add quanto o offer
        fila.add(100);
        fila.add(45);  
        System.out.println(fila);
        // fila.sort(); -> não se usa o sort em uma fila, pq perde o sentido e vira uma lista
        fila.remove(); // FIFO - remove o primeiro da fila
        System.out.println(fila.contains(15));
        System.out.println("Topo: "+fila.peek());
        
        */

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(100);
        lista.add(45);
        lista.add(null);
        System.out.println(lista);
        lista.remove((Integer)100);
        System.out.println(lista.contains(100));

        System.out.println("\n");

        // 1 maneira de exibir
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    
        System.out.println("\n");

        // 2 maneira de exebir 
        for (Integer i : lista){
            System.out.println(i);
        }

        System.out.println("\n");

        // 3 maneira de exibir - usa-se esse quando for mudar a lista dentro do for
        Iterator<Integer> i = lista.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());            
        }

     }
}