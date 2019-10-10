package agencia;

public abstract class Conta{

    double saldo;
    Cliente cliente;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String out = "";

        out += this.id + " : " + this.cliente.getId() + " : " + this.saldo;

        return out;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}