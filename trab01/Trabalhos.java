package trab01;

public class Trabalhos{
    public static void main(String[] args) {
        
        /*
        Garrafa garrafa1 = new Garrafa();
        
        garrafa1.cor = "Azul";
        garrafa1.litros = 2;
        garrafa1.mlRestante = 500;

        garrafa1.destampar();
        System.out.println(garrafa1.mlRestante);

        garrafa1.beber(200);

        System.out.println(garrafa1.mlRestante);
        */

        Ventilador arno = new Ventilador();

        arno.showStatus();

        arno.powerOn();
        arno.showStatus();
        arno.powerOff();
        arno.showStatus();

    }
}
