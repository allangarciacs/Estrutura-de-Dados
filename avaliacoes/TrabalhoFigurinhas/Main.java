package avaliacaoFigurinha;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {


    String nomeBase = "MinhasFigurinhas.csv";
    try (BufferedReader leitor = new BufferedReader(new FileReader(nomeBase, StandardCharsets.UTF_8))) {      
        String linha;
        while ((linha = leitor.readLine()) != null) { // le ate acabar
            String[] valores = linha.split(",");      // splita
              



        }



    }
    
}
