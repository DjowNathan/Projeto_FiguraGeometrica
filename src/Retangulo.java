
public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double calcDiagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		return super.getAltura() * super.getBase();
	}

	@Override
	public double perimetro() {
		return 2 * super.getAltura() + 2 * super.getBase();
	}
	
	

}
