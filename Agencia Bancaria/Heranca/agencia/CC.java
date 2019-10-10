package agencia;

public class CC extends Conta{

    CC(int id, double saldo){
        super(id, saldo);
    }

    @Override
    void update(){
        this.saldo -= 20;
        
    }

    @Override
    public String toString() {
        String out = super.toString() + " : CC";
        return out;
    }
}