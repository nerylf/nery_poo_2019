package agencia;

import java.util.Scanner;

public class Controller{
    public static void main(String[] args) {
        Boolean run = true;

        Agencia ag = new Agencia();
        //ag.addCliente(new Cliente("Machello"));

        Scanner scanner = new Scanner(System.in);
        String line;
        String[] ui;
        
        while(run){
            line = scanner.nextLine();
            ui = line.split(" ");
            
            switch(ui[0]){
                case "addCliente":
                    ag.addCliente(new Cliente(ui[1]));
                    break;
                case "exit":                    
                    run = false;
                    break;
                default:
                    System.out.println("Comando Invalido!");
            }
        }
        System.out.println("Adeus");

    }
}