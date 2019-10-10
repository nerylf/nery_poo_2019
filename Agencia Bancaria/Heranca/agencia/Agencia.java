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

	@Override
	public String toString() {
        String out = "";        
        
        for (Conta conta : listaConta){
            out += "[ " + conta.toString() + " ]\n";
        }           
		return out;
	}

    
}