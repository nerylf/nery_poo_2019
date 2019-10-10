package ContaDoBalacubaco;

class Cliente{
    String id;
    ArrayList<Conta> contas = new ArrayList<Conta>();

    Cliente(String id){
        this.id = id;

        contas.add(new contaCorrente());
        contas.add(new contaPoupanca());
    }
}

abstract class Conta{

}

class contaCorrente extends Conta{

}

class contaPoupanca extends Conta{
    
}

class Agencia{

}



public class Controller{
    public static void main(String[] args) {
        
    }
}