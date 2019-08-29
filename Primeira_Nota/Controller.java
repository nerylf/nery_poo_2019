import java.util.Scanner;

class Aluno{
    String nome;
    int qtdFalta = 0;
    int saudeMental = 80;
    int saudeFisica = 80;
    int vidaSocial = 100;
    int rendimento = 0;
    boolean eBolsista;
    boolean estaVivo = true;

    void showStatus(){
        System.out.println( "Saude Mental: " + saudeMental +
                            "\nSaude Fisica: " + saudeFisica +
                            "\nVida Social: " + vidaSocial +
                            "\nRendimento: " + rendimento + 
                            "\nBolsista: " + eBolsista +
                            "\nFaltas: " + qtdFalta);
    }

    void ganharBolsa(){
        if (eBolsista){
            System.out.println("Nao pode ter duas bolsas, safado!!");
            return;
        }
        eBolsista = true;
        saudeMental -= 20;
        vidaSocial -= 25;
        rendimento -= 5;

    }

    void faltarAula(){
        if (qtdFalta > 8){
            System.out.println("FALTOU DEMAIS!!!");
            if (eBolsista){
                System.out.println("Perdeu playboy, adeus bolsa!!");
                eBolsista = false;
                saudeMental += 20;
                vidaSocial += 25;
                rendimento += 5;
            }
        }
        qtdFalta += 1;

        saudeMental += 10;
        saudeFisica += 10;
        rendimento -= 10;
    }

    void procrastinar(int horas){
        saudeMental -= (horas * 10);
        rendimento -= (horas * 10);        
    }

    void estudar(int horas){
        saudeMental -= (horas * 10);
        saudeFisica -= (horas * 6);
        rendimento += (horas * 8);
        vidaSocial -= (horas * 10);
    }

    void checkStatus(){
        if (saudeMental < 0){
            System.out.println(nome + " morreu de loucura!!");
            estaVivo = false;
            return;
        }
        if (saudeFisica < 0){
            System.out.println(nome + " morreu de infarto!!");
            estaVivo = false;
            return;
        } 
    }
}

public class Controller{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        String line;
        String[] ui;
        System.out.println("Digite o nome do consagrado");
        aluno1.nome = scanner.nextLine();

        while (aluno1.estaVivo){
            System.out.println("status; bolsa; faltar; estudar h; proc h");

            line = scanner.nextLine();
            ui = line.split(" ");

            if (ui[0].equals("exit"))
                break;

            if (ui[0].equals("status"))
                aluno1.showStatus();

            if (ui[0].equals("bolsa"))
                aluno1.ganharBolsa();

            if (ui[0].equals("faltar"))
                aluno1.faltarAula();   

            if (ui[0].equals("estudar"))
                aluno1.estudar(Integer.parseInt(ui[1]));

            if (ui[0].equals("proc"))
                aluno1.procrastinar(Integer.parseInt(ui[1]));
            
            aluno1.checkStatus();        

        }
    }
}