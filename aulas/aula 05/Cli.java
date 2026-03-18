public class Cli {
    public String ano;
    public String mes;
    public String temperatura;
    public String precipitacao;

    public Cli(String ano, String mes, String temperatura, String precipitacao) {
        this.ano = ano;
        this.mes = mes;
        this.temperatura = temperatura;
        this.precipitacao = precipitacao;
    }

    // reescrevemos toString para exibir um objeto completo da classe
    @Override
    public String toString() {
        return "Clima [ano=" + this.ano + ", mes=" + this.mes + ", temperatura=" + this.temperatura + ", precipitacao=" + this.precipitacao
                + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        Clima c = (Clima)obj;
        return (this.ano.equals(c.ano) && this.mes.equals(c.mes) && this.temperatura.equals(c.temperatura) && this.precipitacao.equals(c.precipitacao));
    } 

}