package matricula;

import java.util.Scanner;

public class Controller{
    public static void main(String[] args) {        

        Escola escola = new Escola();

        boolean run = true;

        Scanner scan = new Scanner(System.in);
        
        while(run){
            System.out.println("nwalu; nwdisc; show; exit; mat;");

            String line = scan.nextLine();
            String[] ui = line.split(" ");

            switch (ui[0]){
                case "nwalu":
                    for (int i = 1; i < ui.length; i ++){
                        escola.addAlu(new Aluno(ui[i]));
                    }
                    System.out.println("done");
                    break;
                case "nwdisc":
                    for (int i = 1; i < ui.length; i ++){
                        escola.addDisc(new Disc(ui[i]));
                    }
                    System.out.println("done");
                    break;
                case "show":
                    System.out.println(escola);                    
                    break;
                case "exit":
                    run = false;
                    break;
                case "mat":
                    for (Aluno a : escola.getListAlu()){
                        if (a.getId().equals(ui[1])){
                            
                        }
                    }
                    break;
                default:
                    System.out.println("Comando invalido!");
            }
        }
        scan.close();
        System.out.println("Bye bye!");           
    }
}