package matricula;

import java.util.ArrayList;

public class Escola{
    ArrayList<Aluno> repAluno;
    ArrayList<Disc> repDisc;

    Escola(){
        repAluno = new ArrayList<Aluno>();
        repDisc = new ArrayList<Disc>();
    }

    ArrayList<Aluno> getListAlu(){
        return this.repAluno;
    }
    ArrayList<Disc> getListDisc(){
        return this.repDisc;
    }

    void addAlu(Aluno alu){
        repAluno.add(alu);
    }

    void addDisc(Disc disc){
        repDisc.add(disc);
    }

    @Override
    public String toString() {
        String out = "---Aluno---\n";

        for (Aluno a : repAluno)
            out += a + "\n";
        
        out += "---Disciplina---\n";
        for (Disc d : repDisc)
            out += d + "\n";
        

        return out;
    }

    
}