package mainpack;

class Cadeira{
    String nome;
    int horas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Cadeira(String nome, int horas) {
        this.nome = nome;
        this.horas = horas;
    }
   
}