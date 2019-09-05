package mainpack;

public class Curso{
    String nomeCurso;
    int dificuldade;
    int qtdCadeiras;

    public Curso(String nomeCurso, int dificuldade, int qtdCadeiras){
        this.nomeCurso = nomeCurso;
        this.dificuldade = dificuldade;
        this.qtdCadeiras = qtdCadeiras;
    }

    String getName(){
        return nomeCurso;
    }

    int getDif(){
        return dificuldade;
    }

    int getQtdCad(){
        return qtdCadeiras;
    }
}