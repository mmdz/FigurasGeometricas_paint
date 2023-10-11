package ar.edu.unlam.pb2.figurasgeometricas;

public interface Perimetro {

	//perimetro cuadrado = (lado*4)
	//perimetro rectangulo = (base*2 + altura*2)
	//perimetro triangulo = (lado+lado+lado)
	//perimetro circulo = (diametro*PI) (CIRCUNFERENCIA)
	public abstract Double calcularPerimetro();

}
