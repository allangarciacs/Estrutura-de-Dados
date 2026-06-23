package avaliacaoFigurinha;

public class Figurinha {
    private String nomeSelecao;
    private int numeroFigura;
    private String descricao;
    private int quantidade;
    private boolean rara;

    public Figurinha(String nomeSelecao, int numeroFigura, String descricao, int quantidade, boolean rara) {
        this.nomeSelecao = nomeSelecao;
        this.numeroFigura = numeroFigura;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.rara = rara;
    }    
}
