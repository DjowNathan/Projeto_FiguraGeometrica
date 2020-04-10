
public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return super.getBase() * super.getAltura() / 2;
	}

	@Override
	public double perimetro() {
		double cateto = super.getBase()/2;
		double hipotenusa = Math.pow(cateto, 2) + Math.pow(super.getAltura(),2);
		hipotenusa = Math.sqrt(hipotenusa);
		return super.getBase()*hipotenusa + hipotenusa * super.getBase() + super.getBase() * super.getBase();
	}

	@Override
	public String toString() {
		return "Triangulo [area()=" + area() + ", perimetro()=" + perimetro() + "]";
	}
}
