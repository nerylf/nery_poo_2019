import java.util.Scanner;

public class Unicornio{
    int qtdPass = 0;
    int maxPass;
    int km = 0;
    int cari = 0;
    int maxCari;
    boolean mimado = false;

    void showStatus(){
        System.out.println( "--------------------------------------------" + 
                            "\nPass: " + qtdPass + ", maximo: " + maxPass +
                            "\nCarinho: " + cari + ", maximo: " + maxCari +
                            "\nKm: " + km + 
                            "\nMimado: " + mimado +
                            "\n--------------------------------------------");
    }

    void subir(int qtd){
        if (mimado){
            System.out.println("Nao vai subir ninguem, eu que mando aqui!");
            return;
        }
        else if ((qtd + qtdPass) > maxPass){
            System.out.println("Se aquieta, nao levo mais que " + maxPass + " pessoas!!");
            return;
        }        
        qtdPass += qtd;
        System.out.println("Pessoas a bordo: " + qtdPass);
    }

    void darCarinho(int qtd){
        if (mimado){
            System.out.println("Nao quero seu carinho, vc nao me merece!");
            return;
        }
        cari += qtd;
        if ((qtd + cari) > maxCari){
            mimado = true;
            return;
        }
        
    }

    void brigar(){
        cari -= 8;
        mimado = false;
        System.out.println("Aff, carinho restante: " + cari);
    }



    public static void main(String[] args) {
        Unicornio walter = new Unicornio();
        walter.maxPass = 3;
        walter.maxCari = 10;

        Scanner scanner = new Scanner(System.in);
        String line;
        String[] ui;

        while(true){
            System.out.println("st; subir n; carinho n; brigar");

            line = scanner.nextLine();
            ui = line.split(" ");

            if (ui[0].equals("st")){
                walter.showStatus();
            } 
            else if (ui[0].equals("subir")){
                walter.subir(Integer.parseInt(ui[1]));
            } 
            else if (ui[0].equals("carinho")){
                walter.darCarinho(Integer.parseInt(ui[1]));
            } 
            else if (ui[0].equals("brigar")){
                walter.brigar();
            } 
            else if (ui[0].equals("exit")){
                break;
            } 
            else {  
                System.out.println("fail: Comando Invalido!");
            }
        }
    }
}