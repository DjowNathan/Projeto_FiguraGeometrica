
public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double calcDiagonal() {
		return Math.sqrt(
					Math.pow(super.getAltura(), 2) + Math.pow(super.getBase(), 2)
				);
	}

	@Override
	public double area() {
		return super.getAltura() * super.getBase();
	}

	@Override
	public double perimetro() {
		return 2 * super.getAltura() + 2 * super.getBase();
	}

	@Override
	public String toString() {
		return "Retangulo [calcDiagonal()=" + calcDiagonal() + ", area()=" + area() + ", perimetro()=" + perimetro()
				+ "]";
	}
	
	

}
