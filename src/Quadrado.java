
public class Quadrado extends Poligono implements Diagonal {

	public Quadrado (double lado) {
		super(lado, lado);
	}
	
	@Override
	public double calcDiagonal() {
		return super.getAltura() * Math.sqrt(2);
	}

	@Override
	public double area() {
		return Math.pow(super.getAltura(), 2);
	}

	@Override
	public double perimetro() { 
		return 4 * super.getAltura();
	}

	@Override
	public String toString() {
		return "Quadrado [calcDiagonal()=" + calcDiagonal() + ", area()=" + area() + ", perimetro()=" + perimetro()
				+ "]";
	}
	
	
	
}
