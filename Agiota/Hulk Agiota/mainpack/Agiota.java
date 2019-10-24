package mainpack;

public class Agiota{
    Repositorio<String, Cliente> repCli;
    Double saldo;

    public Agiota(Double saldo){
        this.saldo = saldo;
        repCli = new Repositorio<String, Cliente>("Cliente");
    }

    public void addCliente(String key, String id){
        repCli.add(key, new Cliente(id));
    }
    
}