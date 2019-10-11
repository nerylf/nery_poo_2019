package matricula;

import java.util.ArrayList;

public class Aluno{
    ArrayList<Disc> listDisc;
    String id;

    Aluno(String id){
        this.id = id;
    }

    String getId(){
        return this.id;
    }

    void addDisc(Disc disc){
        this.listDisc.add(disc);
    }

	@Override
	public String toString() {
        String out = this.id + " [ ";        
        for (Disc d : listDisc)
            out += d.getId() + ", ";
        out += " ]";
		return out;
	}
}