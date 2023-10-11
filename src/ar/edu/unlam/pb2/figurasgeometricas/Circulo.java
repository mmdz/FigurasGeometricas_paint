package ar.edu.unlam.pb2.figurasgeometricas;

public class Circulo extends Figuras implements Perimetro , Area{
	
	private Double radio;
	//diametro = 2*radio
		
	//constructores
	public Circulo() {
		super();
		this.radio = 0.0;
	}	
	
	public Circulo(Double radio, String color){
		super(color);
		this.radio = radio;
	}
	
	
	@Override
	public Double calcularArea() {
		//area circulo = (radio*(PI^2)) 
		Double area = this.radio*( Math.pow(Math.PI, 2.0));
		return area;
	}

	@Override
	public Double calcularPerimetro() {
	//perimetro es circunferencia del circulo
		Double diametro = this.radio*2;
		Double perimetro = (diametro*Math.PI);
		return perimetro;
	}

	
	
//getter y setter	
	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}
	
	

	
}
