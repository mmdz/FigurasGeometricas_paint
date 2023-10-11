package ar.edu.unlam.pb2.figurasgeometricas;

public class Triangulo extends Figuras implements Perimetro , Area{
	
	//tipos: escaleno(3 !=), isoceles(2=) y equilatero(3=)
	private Double ladoA;
	private Double ladoB;
	private Double ladoC;

	
	public Triangulo() {
		super();
		this.ladoA = 0.0;
		this.ladoB = 0.0;
		this.ladoC = 0.0;
	}
	
	public Triangulo(Double ladoA, Double ladoB, Double ladoC, String color) {
		super(color);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	
	
	@Override
	public Double calcularArea() {
		Double base = 0.0;
		Double altura = 0.0;
		Double area = 0.0;
		
		//area triangulo = ((base*altura)/2)
		
		if(this.ladoA == this.ladoB && this.ladoA == this.ladoC) {
			//es EQUILATERO, por pitagoras: baseTri = lado/2 y altura = raiz( (lado^2) - (baseTri^2))
			Double baseTri = this.ladoA/2;
			altura = Math.sqrt((Math.pow(this.ladoB, 2.0) - Math.pow(baseTri, 2.0)));
			base = this.ladoC;
		} 
		
		if(this.ladoA == this.ladoB && this.ladoA != this.ladoC) {
			//es ISOCELES , mismo calculo q equilatero
			Double baseTri = this.ladoC/2; 
			altura = Math.sqrt((Math.pow(this.ladoA, 2.0) - Math.pow(baseTri, 2.0)));
			base = this.ladoC;
			
			if(this.ladoA == this.ladoC && this.ladoA != this.ladoB) {
				baseTri = this.ladoB/2; 
				altura = Math.sqrt((Math.pow(this.ladoA, 2.0) - Math.pow(baseTri, 2.0)));
				base = this.ladoB;
				
				if(this.ladoB == this.ladoC && this.ladoA != this.ladoB) {
					baseTri = this.ladoA/2; 
					altura = Math.sqrt((Math.pow(this.ladoB, 2.0) - Math.pow(baseTri, 2.0)));
					base = this.ladoA;
				}
			}
		}
		if(this.ladoA != this.ladoB && this.ladoA != this.ladoC && this.ladoB != this.ladoC) {
			
			//es ESCALENO semiperimetro: S = (ladoA+ladoB+ladoC)/2
			//el area = raiz (S*(S-ladoA)*(S-ladoB)*(S-ladoC))
			Double semi = (this.ladoA + this.ladoB + this.ladoC)/2;
			Double productoSemi = (semi*(semi - this.ladoA)*(semi - this.ladoB)*(semi - this.ladoC));
			
			base = Math.sqrt(productoSemi);
			altura = 1.0;
		}
		
						
		area = (base*altura)/2;
		return area;
	}

	
	@Override
	public Double calcularPerimetro() {
		Double perimetro = this.ladoA + this.ladoB + this.ladoC;
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

	public Double getLadoC() {
		return ladoC;
	}

	public void setLadoC(Double ladoC) {
		this.ladoC = ladoC;
	}



}
