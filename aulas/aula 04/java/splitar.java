import java.util.ArrayList;

public class splitar {
    
    public static void main(String[] args) {
        ArrayList<glicemia> lista = new ArrayList<>();
        
        String linha = "120,11/03/2026,9:00";

        String vetorLinha[] = linha.split(",");

        glicemia obj = new glicemia(Integer.parseInt(vetorLinha[0]), vetorLinha[1], vetorLinha[2]);

        //System.out.println(obj.valor + " - " +obj.data + " - " + obj.hora);

        if (!lista.contains(obj)) {
            lista.add(obj);
        }

        for (glicemia item: lista) {
            System.out.println(item.valor + " - " + item.data + " - " + item.hora);
        }

    }

}
