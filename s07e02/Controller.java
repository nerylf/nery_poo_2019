import java.util.ArrayList;

class Coach extends GenteNormal{
    private int quant = 0;

    Coach(String nome){
        super(nome);
        this.chatisse += 80;
        this.nocao = 0;

    }

    @Override
    void Quantizar() {
        this.quant += 1;
        System.out.println("Quantizando!");
    }

    @Override
    public String toString() {
        if (this.quant > 5)
            return "-COACH QUANTICO-" + super.toString();
        else
            return "-COACH-" + super.toString();
    }

    
}

class GenteNormal{
    protected String nome;
    protected int chatisse;
    protected int nocao;

    GenteNormal(String nome){
        this.nome = nome;
        this.chatisse = 5;
        this.nocao = 10;
    }

    void Quantizar(){
        System.out.println("Me respeita rapaz, sou fisico nao!");
    }

    @Override
    public String toString() {
        return this.nome + ": chatisse " + this.chatisse + ": nocao " + this.nocao;
    }
    
}


public class Controller{
    public static void main(String[] args) {
        ArrayList<GenteNormal> pessoas = new ArrayList<GenteNormal>();
        
        

        GenteNormal amorim = new GenteNormal("Amorim");
        Coach deys = new Coach("Deys");

        pessoas.add(amorim);
        pessoas.add(new GenteNormal("Nery"));   

        pessoas.add(deys);

        for (GenteNormal gente : pessoas){
            System.out.println(gente);
        }


        
        deys.Quantizar();
        deys.Quantizar();
        amorim.Quantizar();
        deys.Quantizar();
        deys.Quantizar();
        deys.Quantizar();
        deys.Quantizar();

        for (GenteNormal gente : pessoas){
            System.out.println(gente);
        }
        
    }
}