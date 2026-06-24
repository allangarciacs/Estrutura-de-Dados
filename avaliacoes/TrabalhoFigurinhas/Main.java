import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Figura> aFigurinhasRepetidas = new TreeSet<>();
        TreeSet<Figura> aFigurinhasDesejadas = new TreeSet<>();

        String arquivoRepetidas = "Minhas_Repetidas.csv";
        String arquivoDesejadas = "Minhas_Desejadas.csv";

        Funcoes funcao = new Funcoes();
        
        funcao.carregarArquivo(arquivoRepetidas, aFigurinhasRepetidas);
        funcao.carregarArquivo(arquivoDesejadas, aFigurinhasDesejadas);

        Scanner teclado = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n    MENU");
            System.out.println("1 - Cadastrar figurinhas repetidas");
            System.out.println("2 - Listar figurinhas repetidas");
            System.out.println("3 - Cadastrar figurinhas desejadas");
            System.out.println("4 - Listar figurinhas desejadas");
            System.out.println("5 - Comparar suas desejadas com as repetidas de outro");
            System.out.println("6 - Comparar as repetidas de outro com as suas desejadas");
            System.out.println("7 - SAIR");
            System.out.print("Opcao: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:
                    funcao.cadastrarFigura(teclado, aFigurinhasRepetidas, arquivoRepetidas);
                    break;

                case 2:
                    funcao.listarFigurinhas(aFigurinhasRepetidas);
                    break;

                case 3:
                    funcao.cadastrarFigura(teclado, aFigurinhasDesejadas, arquivoDesejadas);
                    break;

                case 4:
                    funcao.listarFigurinhas(aFigurinhasDesejadas);
                    break;

                case 5:
                    funcao.buscarDesejadas(teclado, aFigurinhasDesejadas);
                    break;

                case 6:
                    funcao.compararRepetidas(teclado, aFigurinhasRepetidas);
                    break;

                case 7:
                    System.out.println("Finalizando...");
                    break;

                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcao != 7);

        teclado.close();
    }
}