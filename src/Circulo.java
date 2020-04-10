
public class Circulo extends Figura {
	
	private double raio;
		
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	//posso retornar ja o valor da area sem uma variavel.
	public double area() {
		return Math.PI * Math.pow(this.raio, 2);
	}

	@Override
	public double perimetro() {
		double perimetro = 2 * Math.PI * this.raio;
		return perimetro;
	}

}
