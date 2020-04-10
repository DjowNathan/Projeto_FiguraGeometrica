import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		
		ArrayList<Figura> figuras = new ArrayList<>();
		Figura circulo = new Circulo(4);
		figuras.add(circulo);
		figuras.add(new Losango(2, 6));
		figuras.add(new Quadrado(2));
		figuras.add(new Retangulo(10, 6));
		figuras.add(new Triangulo(5, 16));
	
		for(Figura figura : figuras) {
			System.out.println(figura);
		}
	}
}
