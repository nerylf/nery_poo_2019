package mainpack;

import java.util.ArrayList;

public class Cliente{
    Double saldo;
    String id;
    Repositorio<Integer, Transation> repTransation;

    public Cliente(String id) {
        this.id = id;
        this.saldo = 0.0;
        this.repTransation = new Repositorio<Integer, Transation>("Transation");
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " : " + saldo;
    }

    public Repositorio<Integer, Transation> getRepTransation() {
        return repTransation;
    }

}