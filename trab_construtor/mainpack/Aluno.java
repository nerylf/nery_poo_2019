package mainpack;

public class Aluno{
    String nome;
    Curso curso;
    int qtdFalta = 0;
    int saudeMental;
    int saudeFisica;
    int vidaSocial;
    int rendimento = 0;
    boolean eBolsista;
    boolean estaVivo = true;

    public Aluno(String nome){
        this.nome = nome;
               
    }

    void setCurso(Curso curso){
        this.curso = curso;

        this.saudeMental = 100 - (5 * (curso.getDif() + curso.getQtdCad()));
        this.saudeFisica = 100 - (10 * curso.getDif());
        this.vidaSocial = 100 - (15 * curso.getQtdCad());
        this.rendimento = 30 - (10 * curso.getDif());
    }

    void showStatus(){
        System.out.println("--------------------------\n" + nome);
        if (curso != null)
            System.out.println("Curso: " + curso.getName() + ", Dif: " + curso.getDif() + ", Cadeiras: " + curso.getQtdCad());
        else
            System.out.println("Curso: Vagabundo");
            
        System.out.println( "Saude Mental: " + saudeMental +
                            "\nSaude Fisica: " + saudeFisica +
                            "\nVida Social: " + vidaSocial +
                            "\nRendimento: " + rendimento + 
                            "\nBolsista: " + eBolsista +
                            "\nFaltas: " + qtdFalta +
                            "\n--------------------------");
    }

    void ganharBolsa(){
        if (curso == null){
            System.out.println("Tu nem tem curso seu safado!!");
            return;
        }
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
        if (curso == null){
            System.out.println("Tu nem tem curso seu safado!!");
            return;
        }
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
        saudeMental += (horas * 10);
        rendimento -= (horas * 10);        
    }

    void estudar(int horas){
        if (curso == null){
            System.out.println("Tu nem tem curso seu safado!!");
            return;
        }
        saudeMental -= (horas * 8);
        saudeFisica -= (horas * 2);
        rendimento += (horas * 8);
        vidaSocial -= (horas * 4);
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
    void trancarCurso(){
        if (curso == null){
            System.out.println("Tu nem tem curso seu safado!!");
            return;
        }

        saudeMental += 200;
        saudeFisica += 200;
        vidaSocial += 200; 

        eBolsista = false;
        this.curso = null;
    }

    void beber(){
        saudeMental += 5;
        saudeFisica -= 10;
        vidaSocial += 20;
    }
}