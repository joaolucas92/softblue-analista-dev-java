public class Quadrado extends Figura {
	
	private double lado;
	private double area;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}
	
	public double getArea() {
		return area;
	}

	@Override
	public double calcularArea() {
		area = lado * lado;
		System.out.print("Área do quadrado: ");
		return area;
	}
	
}
