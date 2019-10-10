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
        cliente.addContas(cc);
        listaConta.add(cc);
        index ++;
        
        CP cp = new CP(index, 0);
        listaConta.add(cp);
        cliente.addContas(cp);
        index ++;

        listaCliente.add(cliente);

        System.out.println("" + cliente.getId() + " cadastrado!");
    }

	@Override
	public String toString() {
        String out = "";
        
		return out;
	}

    
}