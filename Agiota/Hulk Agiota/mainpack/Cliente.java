package mainpack;

import java.util.ArrayList;

public class Cliente{
    Double saldo;
    String id;

    public Cliente(String id) {
        this.id = id;
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

}