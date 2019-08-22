package trab01;

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
