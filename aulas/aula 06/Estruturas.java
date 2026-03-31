import java.util.List; 
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Random; 

public class Estruturas{
    public static void main(String[] args) {

    // Lista que armazena objetos do tipo Processo
    ArrayList<Processo> lista = new ArrayList<>(); 

    int id;
    String descricao; 

    Scanner teclado = new Scanner(System.in);
    Random gerador = new Random();
    Processo tmp; 

    /*
     * Entrada de dados:
     * O programa solicita descrições de processos ao usuário.
     * Para cada processo, é gerado um ID aleatório.
     * A inserção continua até que o usuário digite "SAIR".
     * Processos duplicados (de acordo com equals) não são adicionados.
     */
    while(true){
        id = gerador.nextInt(500);  
        System.out.print("Descricao do Processo: ");
        descricao = teclado.nextLine().toUpperCase();

        if(descricao.equals("SAIR")){
            break;
        }

        tmp = new Processo(id, descricao);

        if(!lista.contains(tmp)){   
            lista.add(tmp); 
        }
    }

    // Exibe a quantidade total de processos cadastrados
    System.out.println("Quantidade de Processos: "+lista.size()); 

    /*
     * Ordenação da lista:
     * Os processos são ordenados alfabeticamente com base na descrição.
     */
    lista.sort((p1, p2) -> p1.descricao.compareTo(p2.descricao)); 

    // Exibe todos os processos cadastrados
    for(Processo p : lista){
        System.out.println(p);  
    }

    /*
     * Busca de processos:
     * Permite localizar processos cuja descrição contenha
     * uma palavra ou expressão informada pelo usuário.
     */
    System.out.print("Digite palavra ou Expressao que deseja localizar: ");
    descricao = teclado.nextLine().toUpperCase();

    for(Processo p : lista){
        if(p.descricao.contains(descricao)){        
            System.out.println(p);
        }
    }

    /*
     * Remocao de processo:
     * Remove o primeiro processo cuja descrição contenha
     * o texto informado pelo usuário.
     */
    System.out.print("Digite o processo que deseja remover da lista: ");
    descricao = teclado.nextLine().toUpperCase();

    for(int i = 0; i < lista.size(); i++){
        Processo p = lista.get(i);

        if(p.descricao.contains(descricao)){         
            lista.remove(i);    
            break; 
        }
    }

    // Exibe a lista atualizada após a remocao
    System.out.println("Nova Lista: ");
    for(Processo p : lista){
        System.out.println(p);
    }
      
    teclado.close(); 
    }
}
