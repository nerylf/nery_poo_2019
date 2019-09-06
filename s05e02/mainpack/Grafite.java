package mainpack;

public class Grafite{
    Double ponta;
    int tamanho;

    Grafite(Double ponta, int tamanho){
        this.ponta = ponta;
        this.tamanho = tamanho;
    }

    public Double getPonta() {
        return ponta;
    }

    public void setPonta(Double ponta) {
        this.ponta = ponta;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

}