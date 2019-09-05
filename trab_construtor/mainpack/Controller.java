package mainpack;
import java.util.Scanner;

public class Controller{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String line;
        String[] ui;
        System.out.println("Digite o nome do consagrado");
        line = scanner.nextLine();
        
        
        Aluno aluno1 = new Aluno(line);

        while (aluno1.estaVivo){
            System.out.println("curso n d q; status; bolsa; faltar; estudar h; proc h; trancar; beber");

            line = scanner.nextLine();
            ui = line.split(" ");

            if (ui[0].equals("trancar")){
                aluno1.trancarCurso();
                aluno1.showStatus();

                System.out.println("Parabens, zerou a vida!");
            }

            if (ui[0].equals("curso")){
                Curso curso = new Curso(ui[1], Integer.parseInt(ui[2]), Integer.parseInt(ui[3]));
                aluno1.setCurso(curso);
            }

            if (ui[0].equals("st"))
                aluno1.showStatus();

            if (ui[0].equals("bolsa"))
                aluno1.ganharBolsa();

            if (ui[0].equals("faltar"))
                aluno1.faltarAula();  
            if (ui[0].equals("beber"))
                aluno1.beber();   
 

            if (ui[0].equals("estudar"))
                aluno1.estudar(Integer.parseInt(ui[1]));

            if (ui[0].equals("proc"))
                aluno1.procrastinar(Integer.parseInt(ui[1]));
            
            aluno1.checkStatus();        

        }
    }
}