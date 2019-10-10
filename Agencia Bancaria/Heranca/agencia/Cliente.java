package agencia;

import java.util.ArrayList;

public class Cliente{
    ArrayList<Conta> contas;
    String id;

    Cliente(String id){
        this.id = id;
        contas = new ArrayList<Conta>();       
    }

    void addContas(Conta conta){
        this.contas.add(conta);
    }

    public String getId() {
        return id;
    }
}