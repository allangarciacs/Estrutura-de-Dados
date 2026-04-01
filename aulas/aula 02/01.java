import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args)
        ArrayList<String> listaNomes = new ArrayList<>();
        Scanner teclado = new Scanner(System.ln)
        String nome;

    listaNomes.add("Lucas");
    listaNomes.add("Allan");
    listaNomes.add("Lucas");

    System.out.println(listaNomes);

    if (listaNomes.size() != 0){
        System.out.println("Digite um nome");
        nome = teclado.nextLine();
        listaNomes.remove(nome);
    } else {
        System.out.println("Nome nao localizado");
    }
    System.out.println("total de elementos.." + listaNomes.size()));
    System.out.println(listaNomes);

}
