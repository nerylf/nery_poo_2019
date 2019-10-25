package mainpack;

import java.util.Map;

class Paciente{
	String id;
	Map<String, Medico> medicos;
	void addMedico(Medico medico) {
		Medico pmedico = medicos.get(medico.id);
		if(pmedico != null)
			return;
		medicos.put(medico.id, medico);
		medico.addPaciente(this);
	}

	void removerMedico(Medico medico){
		Medico pmedico = medicos.get(medico.id);
		if (pmedico == null)
			return;
			
		pmedico.removerPaciente(this);
		medicos.remove(medico.id);

	}

	
	
}
class Medico{
	String id;
	Map<String, Paciente> pacientes;
	void addPaciente(Paciente paciente) {
		Paciente mpaciente = pacientes.get(paciente.id);
		if(mpaciente != null)
			return;
		pacientes.put(paciente.id, paciente);
		paciente.addMedico(this);
	}

	void removerPaciente(Paciente paciente){
		Paciente mpaciente = pacientes.get(paciente.id);
		if (mpaciente == null)
			return;		
		paciente.removerMedico(this);
		pacientes.remove(paciente.id);

	}
}

public class Controller {
    public static void main(String[] args) {
		
	}
}
