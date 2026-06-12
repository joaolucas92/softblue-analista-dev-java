
public class Circunferencia implements AreaCalculavel {

	double raio;
	
	public Circunferencia(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		System.out.print("Área da circunferência: ");
		return Math.PI * Math.pow(raio, 2);
	}

}
