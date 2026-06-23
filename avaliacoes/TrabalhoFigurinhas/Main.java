import java.io.*;
import java.util.*;

public class Main {

/* Neste código, o static faz com que as variáveis (como os TreeSet de figurinhas e o Scanner)
pertençam à classe Main e não a um objeto específico, permitindo que elas sejam acessadas
diretamente dentro dos métodos estáticos, como o main, sem precisar criar uma instância da
classe. Já o static final é usado para definir constantes, como os nomes dos arquivos CSV
(ARQUIVO_REPETIDAS e ARQUIVO_DESEJADAS), ou seja, valores que pertencem à classe e não podem
ser alterados durante a execução do programa. Dessa forma, o static facilita o acesso global
dentro da classe, enquanto o final garante que valores importantes, como caminhos de arquivos,
permaneçam fixos e não sejam modificados acidentalmente, aumentando a segurança e organização
do código. */

    static TreeSet<Figura> figurinhasRepetidas = new TreeSet<>();
    static TreeSet<Figura> figurinhasDesejadas = new TreeSet<>();

    static final String ARQUIVO_REPETIDAS = "figuras_repetidas_pessoais.csv";
    static final String ARQUIVO_DESEJADAS = "figuras_desejadas_pessoais.csv";

    public static void main(String[] args) {

        carregarArquivo(ARQUIVO_REPETIDAS, figurinhasRepetidas);
        carregarArquivo(ARQUIVO_DESEJADAS, figurinhasDesejadas);

        Scanner scanner = new Scanner(System.in);

    int opcaoMenu;

    do {
        System.out.println("\n=== MENU ===");
        System.out.println("1 - Cadastrar repetidas");
        System.out.println("2 - Listar repetidas");
        System.out.println("3 - Cadastrar desejadas");
        System.out.println("4 - Listar desejadas");
        System.out.println("5 - Match com outro jogador");
        System.out.println("6 - Sair");
        System.out.print("Opção: ");

        opcaoMenu = scanner.nextInt();
        scanner.nextLine();

        if (opcaoMenu == 1) {
            cadastrarFigura(scanner, figurinhasRepetidas, ARQUIVO_REPETIDAS);
        } 
        else if (opcaoMenu == 2) {
            listarFigurinhas(figurinhasRepetidas);
        } 
        else if (opcaoMenu == 3) {
            cadastrarFigura(scanner, figurinhasDesejadas, ARQUIVO_DESEJADAS);
        } 
        else if (opcaoMenu == 4) {
            listarFigurinhas(figurinhasDesejadas);
        } 
        else if (opcaoMenu == 5) {
            compararComOutro(scanner);
        }

    } while (opcaoMenu != 6);
}   

    static void cadastrarFigura(Scanner scanner, TreeSet<Figura> conjuntoDeFiguras, String arquivo) {

        System.out.print("Seleção: ");
        String nomeSelecao = scanner.nextLine();

        System.out.print("Número: ");
        int numeroFigura = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("Rara (true/false): ");
        boolean rara = scanner.nextBoolean();
        scanner.nextLine();

        Figura figura = new Figura(nomeSelecao, numeroFigura, descricao, quantidade, rara);

        if (conjuntoDeFiguras.add(figura)) {
            salvarArquivo(arquivo, figura);
            System.out.println("Salvo com sucesso!");
        } else {
            System.out.println("Figura já existe!");
        }
    }

    static void listarFigurinhas(TreeSet<Figura> conjuntoDeFiguras) {
        if (conjuntoDeFiguras.isEmpty()) {
            System.out.println("Nenhuma figurinha cadastrada.");
            return;
        }

        for (Figura figura : conjuntoDeFiguras) {
            System.out.println(figura);
        }
    }

    static void compararComOutro(Scanner scanner) {

        System.out.print("Nome do arquivo do outro jogador: ");
        String arquivoOutroJogador = scanner.nextLine();

        TreeSet<Figura> figurinhasOutroJogador = new TreeSet<>();
        carregarArquivo(arquivoOutroJogador, figurinhasOutroJogador);

        System.out.println("\nFIGURAS QUE BATEM (você quer e ele tem):");

        for (Figura figura : figurinhasOutroJogador) {
            if (figurinhasDesejadas.contains(figura)) {
                System.out.println(figura);
            }
        }
    }

    static void salvarArquivo(String arquivo, Figura figura) {
        try (FileWriter fileWriter = new FileWriter(arquivo, true)) {
            fileWriter.write(figura.toCSV() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void carregarArquivo(String arquivo, TreeSet<Figura> conjuntoDeFiguras) {
        File file = new File(arquivo);
        if (!file.exists()) return;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String linhaDoArquivo;

            while ((linhaDoArquivo = bufferedReader.readLine()) != null) {
                conjuntoDeFiguras.add(Figura.fromCSV(linhaDoArquivo));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}