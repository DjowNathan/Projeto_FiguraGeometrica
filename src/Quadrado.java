
public class Quadrado extends Poligono implements Diagonal {

	public Quadrado (double lado) {
		super(lado, lado);
	}
	
	@Override
	public double calcDiagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		return Math.pow(super.getAltura(), 2);
	}

	@Override
	public double perimetro() { 
		return 4 * super.getAltura();
	}
	
	
	
}
