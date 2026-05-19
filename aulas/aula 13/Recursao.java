// recursao é um recurso computacional de programação que substitui as instruções
// de repetição (for=while)
// Toda recursao obedece a tres pontos:
    // A inicializaco da variavl de controle
    // B teste de parada com a variavel de controle
    // C transformacao da variavel de controle

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class recursao {

    public static void popular(ArrayList<Integer> lista, int quantidade) {
        Random gerador = new Random();
        int numero;
        for (int i = 0; i < quantidade; i++) {
            numero = gerador.nextInt(15);
            lista.add(numero); 
        }
    }

    public static void exibir(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i) );
        }
    }

    public static void exibirR(ArrayList<Integer> lista, int n) {
        if (n > 0) {
            exibirR(lista, n - 1);
            System.out.println(lista.get(n - 1));
        }
    }

    static int somarR(ArrayList<Integer> lista, int n) {
        if (n > 0) {
            int soma = lista.get(n - 1) + somarR(lista, n - 1);
            return soma;
        }
        return 0;
    }

    static int somaDosPares(ArrayList<Integer> lista, int n) {
        if (n > 0) {
            int somaPares;
            if (lista.get(n - 1) % 2 == 0) {
                somaPares = lista.get(n - 1) + somaDosPares(lista, n - 1);
            } else {
                somaPares = 0 + somaDosPares(lista, n - 1);
            }
            return somaPares;
        }
        return 0;
    }  

    static int quantidadePares(ArrayList<Integer> lista, int n) {
        if (n > 0) {
            int totalPares = 0;
            if (lista.get(n - 1) % 2 == 0) {
                totalPares = 1 + quantidadePares(lista, n - 1);
            } else {
                totalPares = 0 + quantidadePares(lista, n - 1);
            } 
            return totalPares;
        }
        return 0;
    }

    static int qtdeNaLista(ArrayList<Integer> lista, int n, int procurado) {
        if (n > 0) {
            int total = 0;
            if (lista.get(n - 1) == procurado) {
                total = 1 + qtdeNaLista(lista, n - 1, procurado);
            } else {
                total = 0 + qtdeNaLista(lista, n - 1, procurado);
            }
            return total;
        }
        return 0;
    }

    static void substituirValorNaLista(ArrayList<Integer> lista, int n, int original, int novo) {
        if (n > 0) {
            if (lista.get(n - 1) == original) {
                lista.set(n - 1, novo); 
            }
            substituirValorNaLista(lista, n - 1, original, novo);
        }
    }

    static boolean ehOrdenada(ArrayList<Integer> lista, int n) {
        if (n == 1 || n == 0) { // c caso tiver so 1 ou nenhum item na lista
            return true;
        }

        if (lista.get(n - 1) < lista.get(n -2)) { // se o atual for menor q o anterior
            return false;                         // significa q eh ordenada
        }
        return ehOrdenada(lista, n - 1);
    }

    static void multiplosD4(ArrayList<Integer> lista, int n) {
        if (n > 0) {
            if (lista.get(n - 1) % 4 == 0) {
                System.out.println(lista.get(n - 1));
            } 
            multiplosD4(lista, n - 1);
            }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int quantidade = 3;
        popular(lista, quantidade);
        System.out.println("LISTA ORIGINAL");
        exibir(lista);
        // exibirR(lista, lista.size());

        System.out.println("\nA soma dos elementos da lista eh: "
        +somarR(lista, lista.size()));

        System.out.println("A soma dos pares da lista eh: "
        +somaDosPares(lista, lista.size()));

        System.out.println("A quantidade de numeros pares da lista eh: "
        +quantidadePares(lista, lista.size()));

        /* Exercicio de fixação sobre o código base gerado. Faça métodos
        recursivos que:
        1) receba uma lista, seu tamanho, valor de pesquisa. Caso o valor
        da pesquisa ocorra na lista, retornar quantas vezes ele aparece.
        
        2) receba uma lista, seu tamanho, valor de pesquisa, valor de
        substituição. Caso o valor ocorra na lista, substituir o valor de
        pesquisa pelo valor de substituição
        
        3) recebe uma lista, seu tamanho e retorne TRUE se a lista é
        ordenada, FALSE se é desordenada
        
        4) receba uma lista e seu tamanho. O método deve exibir todos
        números múltiplos de 4 */

        System.out.println("\nDigite um valor de pesquisa para procurar na lista: ");
        int valorDePesquisa = teclado.nextInt();
        System.out.println("Qtde de vezes que ("+valorDePesquisa+") aparece na lista: "
            +qtdeNaLista(lista, lista.size(), valorDePesquisa));    

        System.out.print("Digite um valor de pesquisa para substituir o valor procurado na lista: ");
        int valorDeSubstituicao = teclado.nextInt();
        substituirValorNaLista(lista, lista.size(), valorDePesquisa, valorDeSubstituicao);
        System.out.println("NOVA LISTA:");
        exibir(lista);

        System.out.println("A lista eh ordenada? "+ehOrdenada(lista, lista.size()));

        System.out.println("Multiplos de 4 presentes na lista: ");
        multiplosD4(lista, lista.size());

        teclado.close();;
    }
}