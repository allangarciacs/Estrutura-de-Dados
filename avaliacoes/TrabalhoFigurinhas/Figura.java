import java.util.Objects;

public class Figura implements Comparable<Figura> {
    String nomeSelecao;
    int numeroFigura;
    String descricao;
    int quantidade;
    boolean rara;

    public Figura(String nomeSelecao, int numeroFigura, String descricao, int quantidade, boolean rara) {
        this.nomeSelecao = nomeSelecao;
        this.numeroFigura = numeroFigura;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.rara = rara;
    }

    @Override // define como as figurinhas vao ser ordenadas na TreeSet
    public int compareTo(Figura outraFigura) { 
        int comparacao = this.nomeSelecao.compareTo(outraFigura.nomeSelecao);
        if (comparacao == 0) {
            return Integer.compare(this.numeroFigura, outraFigura.numeroFigura);
        }
        return comparacao;
    }

    @Override // define quando uma figurinha eh igual a outra
    public boolean equals(Object outroObjeto) {
        Figura outraFigura = (Figura) outroObjeto;
        return this.nomeSelecao.equals(outraFigura.nomeSelecao) // sao iguais se o nome da selecao
                && this.numeroFigura == outraFigura.numeroFigura; // e o numero sao iguais
    }

    @Override // gera um numero para a figurinha (ajuda na otimizacao)
    public int hashCode() {
        return Objects.hash(nomeSelecao, numeroFigura);
    }

    @Override
    public String toString() {
        return nomeSelecao + " #" + numeroFigura + " - " + descricao +
                " | qtd: " + quantidade + " | rara: " + rara;
    }

    public String toCSV() { // converte a figurinha para csv
        return nomeSelecao + "," + numeroFigura + "," + descricao + "," + quantidade + "," + rara;
    }

    public static Figura fromCSV(String linhaDoArquivo) { // le uma linha do arquivo e transforma em objeto Figura
        String[] linha = linhaDoArquivo.split(",");
        return new Figura(linha[0], Integer.parseInt(linha[1]),
                linha[2], Integer.parseInt(linha[3]),
                Boolean.parseBoolean(linha[4]));
    }
}