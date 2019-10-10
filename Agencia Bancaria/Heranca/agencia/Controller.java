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
            try{
                System.out.println("add id; in; out; transf; update");

                line = scanner.nextLine();
                ui = line.split(" ");
                
                switch(ui[0]){
                    case "add":
                        ag.addCliente(new Cliente(ui[1]));
                        break;
                    case "in":
                        System.out.println("conta valor");

                        line = scanner.nextLine();
                        ui = line.split(" ");
                        ag.depositar(Integer.parseInt(ui[0]), Double.parseDouble(ui[1]));
                        
                        break;
                    case "out":
                        System.out.println("conta valor");

                        line = scanner.nextLine();
                        ui = line.split(" ");
                        ag.sacar(Integer.parseInt(ui[0]), Double.parseDouble(ui[1]));
                        
                        break;
                    case "transf":
                        System.out.println("conta1 conta2 valor");

                        line = scanner.nextLine();
                        ui = line.split(" ");
                        ag.transferir(Integer.parseInt(ui[0]), Integer.parseInt(ui[1]), Double.parseDouble(ui[2]));
                        
                        break;
                    case "exit":                    
                        run = false;
                        break;
                    case "update":                    
                        ag.update();
                        break;
                    case "show":
                        System.out.println(ag.toString());
                        break;
                    default:
                        System.out.println("Comando Invalido!");
                }
                System.out.println("-------------------------------------");

            }catch(RuntimeException e){
                System.out.println(e);
            }
        }
        System.out.println("Adeus");

    }
}