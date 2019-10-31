package mainpack;

public class Agiota{
    Repositorio<String, Cliente> repCli;
    Repositorio<Integer, Transation> repTran;
    Double saldo;

    public Agiota(Double saldo){
        this.saldo = saldo;
        repCli = new Repositorio<String, Cliente>("Cliente");
        repTran = new Repositorio<Integer, Transation>("Transation");
    }

    public void addCliente(String key, String id){
        repCli.add(key, new Cliente(id));
    }

    public Repositorio<String, Cliente> getRepCli() {
        return repCli;
    }

    public void setRepCli(Repositorio<String, Cliente> repCli) {
        this.repCli = repCli;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void emprestar(int idTransation, String id, Double valor){
        if (valor > this.saldo){
            System.out.println("saldo insuficiente!");
            return;
        }

        Cliente mcliente = repCli.get(id);
        Transation transation = new Transation(idTransation, mcliente.getId(), -valor);
        mcliente.getRepTransation().add(idTransation, transation);
        mcliente.setSaldo(mcliente.getSaldo() + valor);
        this.repTran.add(idTransation, transation);
        this.saldo -= valor;
    }

    public Repositorio<Integer, Transation> getRepTran() {
        return repTran;
    }

    public void receber(int idTransation, String id, Double valor){
        Cliente mcliente = repCli.get(id);
        if (mcliente == null){
            System.out.println("Cliente nao existe!");
            return;
        }
        if(valor > mcliente.getSaldo()){
            System.out.println(mcliente.getId() + " nao pode pagar mais do que ta devendo");
            return;
        }
        Transation transation = new Transation(idTransation, mcliente.getId(), valor);
        mcliente.getRepTransation().add(idTransation, transation);
        mcliente.setSaldo(mcliente.getSaldo() - valor);
        this.repTran.add(idTransation, transation);
        this.saldo += valor;

    }

    public matar(String id){
        Cliente mcliente = repCli.get(id);
        if (mcliente == null){
            System.out.println("Cliente nao existe!");
            return;
        }        
        repCli.remove(id);

        for(Transation t : repTran.values()){
            if (t.getClienteId().equals(id))
                t = null;
        }
    }
    
}