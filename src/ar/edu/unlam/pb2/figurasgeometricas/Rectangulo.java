package ar.edu.unlam.pb2.figurasgeometricas;

public class Rectangulo extends Figuras implements Perimetro , Area{

	private Double ladoA; //seran 2 ladoA y 2 ladoB
	private Double ladoB;
	
	//constructores
	public Rectangulo() {
		super();
		this.ladoA = 0.0;
	}	
	public Rectangulo(Double ladoA, Double ladoB, String color){
		super(color);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	
	@Override
	public Double calcularArea() {
		
		Double area = this.ladoA*this.ladoB;
		return area;
	}

	@Override
	public Double calcularPerimetro() {
		
		Double perimetro = (this.ladoA*2 + this.ladoB*2);
		return perimetro;
	}

	
	
	

//getter y setter	
	public Double getLadoA() {
		return ladoA;
	}
	public void setLadoA(Double ladoA) {
		this.ladoA = ladoA;
	}
	public Double getLadoB() {
		return ladoB;
	}
	public void setLadoB(Double ladoB) {
		this.ladoB = ladoB;
	}



}
