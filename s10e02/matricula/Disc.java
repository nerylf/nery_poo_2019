package matricula;

import java.util.ArrayList;

public class Disc{
    ArrayList<Aluno> listAlu;
    String id;

    Disc(String id){
        this.id = id;
    }

    String getId(){
        return this.id;
    }

    void addAlu(Aluno alu){
        this.listAlu.add(alu);
    }

	@Override
	public String toString() {
        String out = this.id + " [ ";        
        for (Aluno a : listAlu)
            out += a.getId() + ", ";
        out += " ]";
		return out;
	}
}