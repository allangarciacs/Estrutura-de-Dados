import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class NovoPrincipal {
    public static void main(String[] args) {
        List<Cli> lista = new ArrayList<>();
        String nomeBase = "Dados.csv";

        // O try-with-resources já fecha o arquivo automaticamente (igual ao 'with' do Python)
        try (BufferedReader leitor = new BufferedReader(
                new FileReader(nomeBase, StandardCharsets.UTF_8))) {
            
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dadosLinha = linha.split(",");
                
                Cli objClima = new Cli(dadosLinha[0],dadosLinha[1],dadosLinha[2], dadosLinha[3]);

                // Requer que o método equals() esteja implementado na classe Clima
                if (!lista.contains(objClima)) {
                    lista.add(objClima);
                }
            }

            for (Cli item : lista) {
                System.out.println(item);
            }

        } catch (Exception e) {
            System.err.println("Ocorreu algum erro... " + e.getMessage());
        }
    }
}