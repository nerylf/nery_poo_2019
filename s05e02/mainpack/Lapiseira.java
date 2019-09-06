package mainpack;

public class Lapiseira{
    String marca;
    Double ponta; 
    int maxGraf;
    Grafite grafite;

    Lapiseira(String marca, Double ponta, int maxGraf){
        this.marca = marca;
        this.maxGraf = maxGraf;
        this.grafite = null;
    }

    public void escrever(){
        if(grafite == null) {
            System.out.println("Nao tem grafite seu safado!!");
            return; 
        }

        System.out.println("ESCREVENDO");
    }

    public void colocarGrafite(Grafite grafite){
        this.grafite = grafite;
    }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMaxGraf() {
		return maxGraf;
	}

	public void setMaxGraf(int maxGraf) {
		this.maxGraf = maxGraf;
	} 

}