
public class Quadrado implements AreaCalculavel {
	
	double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		System.out.print("Área do quadrado: ");
		return Math.pow(lado, 2);
	}

}
