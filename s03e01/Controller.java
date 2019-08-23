import java.util.Scanner;

class Peixe{
    int barriga = 0;
    int maxBarriga = 100;

    void alimentar(int qtdAlimento){
        barriga += qtdAlimento;        
    }   

    void esperar(int tempo){
        System.out.println("EGUA!!");
        barriga -= (tempo * 5);        
    }

    void showStatus(){
        System.out.println("Peixe ta vivo com barriga: " + barriga);
    }
}

public class Controller{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Peixe nemo = new Peixe();

        while(true){
            if (nemo.barriga < 0){
                nemo.showStatus();
                System.out.println("O PEIXE MORREU DE FOME!!!");
                break;
            } else if (nemo.barriga > nemo.maxBarriga){
                nemo.showStatus();
                System.out.println("O PEIXE EXPLODIU!!!!");
                break;
            }

            System.out.println("feed qtd; wait h; show");
            String line = scanner.nextLine();

            String[] ui = line.split(" ");

            if (ui[0].equals("feed"))
                nemo.alimentar(Integer.parseInt(ui[1]));            
            else if (ui[0].equals("wait"))                
                nemo.esperar(Integer.parseInt(ui[1]));            
            else if (ui[0].equals("show"))
                nemo.showStatus();
            else if (ui[0].equals("exit"))
                break;
            

        }
        scanner.close();

    }
}