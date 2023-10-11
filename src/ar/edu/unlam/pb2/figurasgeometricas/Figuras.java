package ar.edu.unlam.pb2.figurasgeometricas;

//figuras sera la clase padre
public abstract class Figuras {
	
	public String color;
	
	
	//constructores
	public Figuras() {
		this.color = "blanco";
	}
	public Figuras(String color) {
		this.color = color;
	}
	
	
	
	
//getter y setter	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	};
	


}
