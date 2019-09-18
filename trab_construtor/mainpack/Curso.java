package mainpack;

public class Curso{
    String nomeCurso;
    int dificuldade;
    

    public Curso(String nomeCurso, int dificuldade){
        this.nomeCurso = nomeCurso;
        this.dificuldade = dificuldade;
    }

    String getName(){
        return nomeCurso;
    }

    int getDif(){
        return dificuldade;
    }
}