package mainpack;

public class Lapiseira{
    String marca;
    int maxGraf;
    Grafite grafite;

    Lapiseira(String marca, int maxGraf){
        this.marca = marca;
        this.maxGraf = maxGraf;
    }

    public void escrever(){
        if(grafite == null) {
            return; 
        }
    }

    public void colocarGrafite(Grafite grafite){
        this.grafite = grafite;
    }

    public Double getTamGraf(){
        if(grafite == null) {
            return; 
        }
        return grafite.tamanho;
    }

	public Lapiseira(String marca, int maxGraf) {
		this.marca = marca;
		this.maxGraf = maxGraf;
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