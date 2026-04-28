import java.io.BufferedReader;
import java.io.FileReader; 
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        List<Aluno> lista = new ArrayList<>(); //cria a lista q vai guardar os dados
        String nomeBase = "alunos.csv"; // nomeia a base de dados

        // leitor do arquivo
        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeBase, StandardCharsets.UTF_8))) {
        
            String linha;

            while ((linha = leitor.readLine()) != null) { // le ate acabar os dados
                String[] dadosLinha = linha.split(","); // divide a linha

                Aluno objAluno = new Aluno(dadosLinha[0],dadosLinha[1],
                    dadosLinha[2],Integer.parseInt(dadosLinha[3].trim()));
                    // trim tira espacos extras

                if (!lista.contains(objAluno)) { // verifica se ja tem
                    lista.add(objAluno); // p evitar itens duplicados
                }
            }
            
            do {
                System.out.println("---------- MENU ----------");
                System.out.println("1 - ver lista original");
                System.out.println("2 - ordenada por nome"); // professor a lista original ja estava em ordem alfabetica
                System.out.println("3 - ordenada por ano");
                System.out.println("4 - buscar aluno");
                System.out.println("5 - Qtde de ingressos por ano");
                System.out.println("0 - Sair");
                System.out.println("--------------------------");
                System.out.print("Opcao: ");

                opcao = teclado.nextInt();
                teclado.nextLine();

                switch (opcao) {
                    case 1:
                        lista.forEach(System.out::println);
                        break;

                    case 2: 
                        Aluno.ordenarPorNome(lista);
                        lista.forEach(System.out::println);
                        break;

                    case 3:
                        Aluno.ordenarPorAno(lista);
                        lista.forEach(System.out::println);
                        break;

                    case 4:
                        System.out.print("Digite o nome do aluno: ");
                        String nome = teclado.nextLine();

                        Aluno tem = Aluno.buscar(lista, nome);

                        if (tem != null)
                            System.out.println(tem);
                        else 
                            System.out.println("Nao encontrado\n");
                        break;

                    case 5:
                        System.out.println("--------------------------");
                        Aluno.ingressosPorAno(lista);
                        break;

                    case 0:
                        System.out.println("saindo...");
                        break;

                    default:
                     System.out.println("opcao invalida");
                }

            } while (opcao != 0);


        } catch (Exception e) {
            System.out.println("Erro..." +e.getMessage());
        }
    }
}