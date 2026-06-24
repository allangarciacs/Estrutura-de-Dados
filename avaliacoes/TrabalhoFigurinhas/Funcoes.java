import java.io.*;
import java.util.*;

public class Funcoes {

    public void salvarArquivo(String arquivo, Figura figura) { // pega o nome do arquivo e adiciona a figura nele
        try (FileWriter fileWriter = new FileWriter(arquivo, true)) {
            fileWriter.write(figura.toCSV() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void carregarArquivo(String arquivo, TreeSet<Figura> aPackDeFigurinhas) {
        File file = new File(arquivo);

        if (!file.exists()) {
            return;
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                aPackDeFigurinhas.add(Figura.fromCSV(linha));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listarFigurinhas(TreeSet<Figura> aPackDeFigurinhas) {

        if (aPackDeFigurinhas.isEmpty()) {
            System.out.println("Nao tem figurinhas!");
            return;
        }

        for (Figura figura : aPackDeFigurinhas) {
            System.out.println(figura);
        }
    }

    public void cadastrarFigura(Scanner teclado, TreeSet<Figura> aPackDeFigurinhas, String arquivo) {

        System.out.print("Selecao: ");
        String nomeSelecao = teclado.nextLine();

        System.out.print("Numero: ");
        int numeroFigura = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Descricao: ");
        String descricao = teclado.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = teclado.nextInt();

        System.out.print("Rara (true/false): ");
        boolean rara = teclado.nextBoolean();
        teclado.nextLine();

        Figura figura = new Figura(nomeSelecao, numeroFigura, descricao, quantidade, rara);

        if (aPackDeFigurinhas.add(figura)) {
            salvarArquivo(arquivo, figura);
            System.out.println("Figurinha salva!");
        } else {
            System.out.println("Figura ja existe!");
        }
    }

    public void buscarDesejadas(Scanner scanner, TreeSet<Figura> figurinhasDesejadas) {

        System.out.print("Nome do arquivo de repetidas: ");
        String arquivoComparacao = scanner.nextLine();

        TreeSet<Figura> packDoOutro = new TreeSet<>();

        carregarArquivo(arquivoComparacao, packDoOutro);

        System.out.println("\nFiguras compativeis (vc deseja ele tem repedida):");

        for (Figura figura : packDoOutro) {
            if (figurinhasDesejadas.contains(figura)) {
                System.out.println(figura);
            }
        }
    }
        public void compararRepetidas(Scanner scanner, TreeSet<Figura> figurinhasDesejadas) {

        System.out.print("Nome do arquivo de desejadas: ");
        String arquivoComparacao = scanner.nextLine();

        TreeSet<Figura> packDoOutro = new TreeSet<>();

        carregarArquivo(arquivoComparacao, packDoOutro);

        System.out.println("\nFiguras compativeis (ele busca e voce tem repetida):");

        for (Figura figura : packDoOutro) {
            if (figurinhasDesejadas.contains(figura)) {
                System.out.println(figura);
            }
        }
    }
}