import java.util.Scanner;

class Peixe{
    int barriga = 0;
    int maxBarriga = 100;
    boolean isAlive = true;

    void alimentar(int qtdAlimento){
        if (isAlive){
            System.out.println("OBAA!!");
            barriga += qtdAlimento;        

            if (barriga > maxBarriga){
                System.out.println("O PEIXE EXPLODIU!!!!");
                isAlive = false;            
            }
        }
    }
    void esperar(int tempo){
        if (isAlive){
            System.out.println("EGUA!!");
            barriga -= (tempo * 5);
            
            if (barriga < 0){
                System.out.println("O PEIXE MORREU DE FOME!!!");     
                isAlive = false;   
            }   
            
        }
    }

    void showStatus(){
        System.out.println("Peixe ta vivo com barriga: " + barriga);
    }
}

public class Controller{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Peixe nemo = new Peixe();

        while(nemo.isAlive){
            
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