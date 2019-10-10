package agencia;

public class CP extends Conta{

    CP(int id, double saldo){
        super(id, saldo);
    }

    @Override
    void update(){
        this.saldo += (this.saldo) * 0.02;
    }

    @Override
    public String toString() {
        String out = super.toString() + " : CP";
        return out;
    }
}