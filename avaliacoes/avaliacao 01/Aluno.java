import java.util.List; // p usar nos metodos

public class Aluno {
    String nome;
    String curso;
    String sexo;
    int anoIngresso;

    public Aluno(String nome, String curso, String sexo, int anoIngresso) {
        this.nome = nome;
        this.curso = curso;
        this.sexo = sexo;
        this.anoIngresso = anoIngresso;
    }

    @Override // estilo q a lista vai ser exibida
    public String toString() {
        return "Aluno: nome = " + this.nome + ", curso = " + this.curso + ", sexo = "
        + this.sexo + ", anoIngresso = " + this.anoIngresso;
    }

    @Override // definir ngc pra ver se eh igual
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aluno a = (Aluno) obj;

        return this.nome.equals(a.nome) && this.curso.equals(a.curso) 
        && this.sexo.equals(a.sexo) && this.anoIngresso == a.anoIngresso;
    } 

    // pega a lista e ordena alfabeticamente
    public static void ordenarPorNome(List<Aluno> lista) {
        lista.sort((a1, a2) -> a1.nome.compareTo(a2.nome));
        // compareTo - compara strings em ordem alfabetica
    }
   
    // pega a lista e ordena por ano
    public static void ordenarPorAno(List<Aluno> lista) {
        lista.sort((a1, a2) -> Integer.compare(a1.anoIngresso, a2.anoIngresso));
        // compare compara os nmeros e ordena do menor p maior
    }
     
    // busca o aluno na lista (puxa a lista e a string q quer encontrar)
    public static Aluno buscar(List<Aluno> lista, String nome) {
        for (Aluno a : lista) {
            if (a.nome.equalsIgnoreCase(nome)) {
                return a;
            }
        }
    return null;
    }
    
    public static void ingressosPorAno(List<Aluno> lista) {
        for (int ano = 2020; ano <= 2023; ano++) {
            int contador = 0;

            for (Aluno a : lista) {
                if (a.anoIngresso == ano) {
                    contador++;
                }
            }
            System.out.println(ano +": " +contador);
        }
    }
}