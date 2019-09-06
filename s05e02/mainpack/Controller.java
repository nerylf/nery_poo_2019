package mainpack;

public class Controller{
    public static void main(String[] args) {
        Lapiseira opa = new Lapiseira("Sucesso", 0.7, 10);
        System.out.println(opa);
        Grafite grafite1 = new Grafite(0.7, 5);
        
        opa.colocarGrafite(grafite1);

        opa.escrever();

        System.out.println(opa.grafite.tamanho);    
    }
}