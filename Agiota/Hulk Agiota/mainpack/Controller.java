package mainpack;

import java.util.Scanner;

public class Controller{
    public static void main(String[] args) {
        Repositorio<String, Cliente> repCliente = new Repositorio<String, Cliente>("Cliente");
        Repositorio<Integer, Transation> repTransarion = new Repositorio<Integer, Transation>("Transation");
        int nextTransation = 0;
        Agiota hulk;

        /*
        String line;
        String[] ui;
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("init saldo");
            line = scan.nextLine();
            ui = line.split(" ");
            if (!ui[0].equals("init")){
                System.out.println("Comando invalido!");
                continue;
            }
            hulk = new Agiota(Double.parseDouble(ui[1]));
            break;
        }
        

        while(true){

            line = scan.nextLine();
            ui = line.split(" ");

            switch(ui[0]){
                case "showSaldo":
                    System.out.println(hulk.getSaldo());
                    break;
            }
        }
        */

        hulk = new Agiota(1000.0);

        hulk.addCliente("Opa", "Opa da Silva");
        hulk.addCliente("Alo", "Alo de Oliveira");
        hulk.addCliente("Supinsvaldo", "Supinsvaldo de almeida");

        hulk.emprestar(nextTransation, "Opa", 10.0);
        nextTransation ++;
        hulk.emprestar(nextTransation, "Opa", 100.0);
        nextTransation ++;
        hulk.emprestar(nextTransation, "Opa", 2.0);
        nextTransation ++;
        hulk.emprestar(nextTransation, "Alo", 60.0);
        nextTransation ++;
        hulk.emprestar(nextTransation, "Alo", 5.0);
        nextTransation ++;

        System.out.println(hulk.getRepCli().get("Opa").getRepTransation().getAll());
        System.out.println(hulk.getRepCli().get("Alo").getRepTransation().getAll());
        System.out.println(hulk.getRepTran().getAll());
        System.out.println(hulk.saldo);

        

        



    }
}