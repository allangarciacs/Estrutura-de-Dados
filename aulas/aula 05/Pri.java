import java.util.ArrayList;

public class Pri {
         public static void main(String[] args) {
            ArrayList<Cli> lista = new ArrayList<>();
            
            // simulando que estamos lendo a linha a linha do arquivo
            String linha = "2020,Janeiro,Quente,muita"; // se o separador é virgula, usa-se virgula no slip 
            String dadosLinha[] = linha.split(",");
            Cli objClima = new Cli(dadosLinha[0], dadosLinha[1], dadosLinha[2], dadosLinha[3]);
            lista.add(objClima);

            // segunda linha
            linha = "2020,Janeiro,Frio,pouca";
            dadosLinha = linha.split(",");
            objClima = new Cli(dadosLinha[0], dadosLinha[1], dadosLinha[2], dadosLinha[3]);
            lista.add(objClima);

            // imprimir 
            for (Cli c : lista) {
                System.out.println(c); 
            } 
    
    }
}
