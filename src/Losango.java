
public class Losango extends Poligono {
	
	public Losango(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		double area = super.getBase() * super.getAltura();
		return area;
	}
	
	@Override
	public double perimetro() {
		double perimetro = 4 * super.getBase();
		return perimetro;
	}

	
	
}
