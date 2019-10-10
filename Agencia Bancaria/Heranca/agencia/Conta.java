package agencia;

public abstract class Conta{

    double saldo;
    String idCliente;
    int id;

    Conta(int id, double saldo){
        this.id = id;
        this.saldo = saldo;
    }

    abstract void update();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}