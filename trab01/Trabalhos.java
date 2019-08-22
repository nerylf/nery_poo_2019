package trab01;

public class Trabalhos{
    public static void main(String[] args) {
        Garrafa garrafa1 = new Garrafa();

        garrafa1.cor = "Azul";
        garrafa1.litros = 2;
        garrafa1.mlRestante = 500;

        garrafa1.destampar();
        System.out.println(garrafa1.mlRestante);

        garrafa1.beber(200);

        System.out.println(garrafa1.mlRestante);

    }
}

class Garrafa{
    float litros;
    int mlRestante;
    boolean estaTampada = true;
    String cor;

    void destampar(){
        if (!estaTampada){
            System.out.println("Ja esta destampada!!!!!");
            return;
        }
        System.out.println("Destampando a garrafa");
        estaTampada = false;
    }

    void tampar(){
        if (estaTampada){
            System.out.println("Ja esta tampada!!!!!");
            return;
        }
        System.out.println("Tampando a garrafa");
        estaTampada = true;
    }

    void beber(int mlBeber){
        if (mlRestante <= 0){
            System.out.println("Esta vazia!!!!");
            return;
        } else if (estaTampada) {
            System.out.println("Garrafa tampada!!!");
            return;
        }

        System.out.print("Bebendo ");
        System.out.println(mlBeber);
        mlRestante = mlRestante - mlBeber;


    }
}

