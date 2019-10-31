package mainpack;

public class Transation{
    int id;
    String clienteId;
    Double valor;

    
    public String getClienteId(){
        return this.clienteId;
    }

    public Double getValor() {
        return valor;
    }

    public Transation(int id, String clienteId, Double valor) {
        this.id = id;
        this.clienteId = clienteId;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "" + id + " : " + clienteId + " : R$ " + valor;
    }

}