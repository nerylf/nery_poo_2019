package agencia;

import java.util.ArrayList;

public class Agencia{

    int index;
    ArrayList<Cliente> listaCliente;
    ArrayList<Conta> listaConta;

    Agencia(){
        listaCliente = new ArrayList<Cliente>();
        listaConta = new ArrayList<Conta>();

        index = 0;
    }

    void addCliente(Cliente cliente){
        CC cc = new CC(index, 0);
        cc.setCliente(cliente);
        cliente.addContas(cc);
        listaConta.add(cc);
        index ++;
        
        CP cp = new CP(index, 0);
        cp.setCliente(cliente);
        listaConta.add(cp);
        cliente.addContas(cp);
        index ++;

        listaCliente.add(cliente);

        System.out.println("" + cliente.getId() + " cadastrado!");
    }

    public void depositar(int index, double valor){
        listaConta.get(index).depositar(valor);
    }

    public void sacar(int index, double valor){
        listaConta.get(index).sacar(valor);
    }

    public void transferir(int index1, int index2, double valor){
        listaConta.get(index1).sacar(valor);
        listaConta.get(index2).depositar(valor);
    }

    public void update(){
        for(Conta conta : listaConta){
            conta.update();
        }
    }

	@Override
	public String toString() {
        String out = "";        
        
        for (Conta conta : listaConta){
            out += "[ " + conta.toString() + " ]\n";
        }           
		return out;
	}

    
}