import java.util.ArrayList;
import java.util.Scanner;

public class principal {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<glicemia> lista = new ArrayList<>();

        //alternativa 1
        glicemia obj = new glicemia(191, "11/03/2026", "11:00");


        //alternativa 3;
        int valor;
        String data, hora;
        for (int i = 0; i < 3;i++) {
            System.out.println("Valor glicemia: ");
            valor = teclado.nextInt();
            teclado.nextLine();
            System.out.println("data (dd/mm/aaaa): ");
            data = teclado.nextLine();
            
            System.out.println("hora: ");
            hora = teclado.nextLine();

            lista.add(new glicemia(valor, data, hora));
        }
    
        //exibir lista - alternativa 1
        for (int i = 0; i < lista.size();i++) {
           System.out.println(lista.get(i).valor + " - " + lista.get(i).data + " - " + lista.get(i).hora);
        }

        //exibir lista - alternativa 2
        for (glicemia item : lista) {
            System.out.println((item.valor + " - " + item.data + " - " +item.hora));
        }
        
        teclado.close();
    }
}
