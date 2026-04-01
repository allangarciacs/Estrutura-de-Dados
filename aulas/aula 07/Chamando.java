import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chamando {
    public static void main(String[] args) {
        Queue<Integer> filaNormal = new LinkedList<>();
        Queue<Integer> filaPrioritaria = new LinkedList<>();
        int contarNormal = 1;
        int contarPrioritaria = 500;
        int totalAtendimentos = 1;
        Scanner teclado = new Scanner(System.in);
        String opcao = "";
        String qualFila = "";
        int fichaAtendida = -1;

        do {
            System.out.println("MENU");
            System.out.println("1 - Ficha Normal");
            System.out.println("2 - Ficha Prioritaria");
            System.out.println("3 - Chama ficha");
            System.out.println("4 - Mostrar fichas");
            System.out.println("5 - SAIR");
            System.out.println("OPCAO:\n");
            opcao = teclado.nextLine();

            switch (opcao) {
                case "1": 
                    System.out.println("Gerando ficha normal..."+contarNormal);
                    filaNormal.offer(contarNormal);
                    contarNormal++;
                    break;
                case "2": 
                    System.out.println("Gerando ficha prioritaria..."+contarPrioritaria);
                    filaPrioritaria.offer(contarPrioritaria);
                    contarPrioritaria++;
                    break;
                case "3": 
                    System.out.println("\nChamando fichas...");
                    if (totalAtendimentos % 3 == 0){ // a cade 3 fichas normais, chama 1 prioritaria
                        qualFila = "PRIORITARIA";

                    } else { // chamar normal
                        qualFila = "NORMAL";

                    }
                    if (qualFila.equals("PRIORITARIA") && !filaPrioritaria.isEmpty()) {
                        fichaAtendida = (int)filaPrioritaria.poll();
                        totalAtendimentos++;
                    } else if (qualFila.equals("NORMAL") && !filaNormal.isEmpty()) {
                        fichaAtendida = (int)filaNormal.poll();
                        totalAtendimentos++;
                    } else if (qualFila.equals("NORMAL") && filaNormal.isEmpty() && !filaPrioritaria.isEmpty()) {
                        qualFila = "PRIORITARIA";
                    }
                    if (fichaAtendida != -1) {
                        System.out.println("Chamando ficha..."+qualFila+" "+fichaAtendida+"\n");
                    } else {
                        System.out.println("Ngm atendido\n");
                    }

                    break;
                case "4": 
                    System.out.println("Mostrando fichas...");
                    int totalNormalFaltante = filaNormal.size();
                    int totalPrioritariaFaltante = filaPrioritaria.size();

                    System.out.println("Fila normal: "+filaNormal);
                    System.out.println("Total de fichas: "+totalNormalFaltante+"\n");

                    System.out.println("Fila prioritaria: "+filaPrioritaria);
                    System.out.println("Total de fichas: "+totalPrioritariaFaltante+"\n");

                    break;
                case "5":
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("Opcao invalida...");
                    break;
            }

        } while (!opcao.equals("5"));

        teclado.close();
    }
}
