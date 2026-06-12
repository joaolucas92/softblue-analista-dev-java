public class Retangulo extends Figura {
	
	private double lado;
	private double altura;
	private double area;
	
	public Retangulo(double lado, double altura) {
		this.lado = lado;
		this.altura = altura;
	}

	public double getLado() {
		return lado;
	}

	public double getAltura() {
		return altura;
	}

	public double getArea() {
		return area;
	}

	@Override
	public double calcularArea() {
		area = lado * altura;
		System.out.print("Área do retângulo: ");
		return area;
	}
	
}
