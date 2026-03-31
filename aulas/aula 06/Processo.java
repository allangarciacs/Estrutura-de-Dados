public class Processo {
    public int id;
    public String descricao;

    public Processo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object obj) {     
        /*
         * Define quando dois objetos Processo são considerados iguais.
         * A comparação é feita com base no atributo 'id',
         * tratando-o como identificador único (chave primária).
         */
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Processo other = (Processo) obj;

        if (id != other.id)
            return false;

        return true;
    }

    @Override
    public String toString() {      
        /*
         * Define a forma como o objeto será exibido ao ser impresso,
         * facilitando a visualização dos seus atributos.
         */
        return "Processo [id=" + id + ", descricao=" + descricao + "]";
    } 

}
