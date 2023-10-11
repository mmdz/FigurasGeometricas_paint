package ar.edu.unlam.pb2.figurasgeometricas;


public class Cuadrado extends Figuras implements Perimetro , Area{

	private Double ladoA; //seran los 4 iguales
	
	//constructores
	public Cuadrado(){
		super();
		this.ladoA = 0.0;
	}	
	public Cuadrado(Double ladoA, String color){
		super(color);
		this.ladoA = ladoA;
	}
	
	
	@Override
	public Double calcularArea() {
		
		Double area = Math.pow(this.ladoA,2.0);
		return area;
	}

	@Override
	public Double calcularPerimetro() {
		//perimetro cuadrado = (lado*4)
		Double perimetro = this.ladoA*4;
		return perimetro;
	}
	
	
//getter y setter	
	public Double getLadoA() {
		return ladoA;
	}
	public void setLadoA(Double ladoA) {
		this.ladoA = ladoA;
	}


	

}
