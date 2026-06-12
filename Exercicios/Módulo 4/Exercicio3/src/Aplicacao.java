public class Aplicacao {
	
	public static void main(String[] args) {
		
		Quadrado q1 = new Quadrado();
		Triangulo t1 = new Triangulo();
		Circunferencia c1 = new Circunferencia();
		Trapezio trap1 = new Trapezio();
		
		q1.lado = 5;
		System.out.println("Área do quadrado: " + q1.calcularArea());
		
		t1.base = 8;
		t1.altura = 9;
		System.out.println("Área do triângulo: " + t1.calcularArea());
		
		c1.raio = 6.5;
		System.out.println("Área da circunferência: " + c1.calcularArea());
		
		trap1.baseMaior = 10;
		trap1.baseMenor = 6;
		trap1.altura = 4;
		System.out.println("Área do trapézio: " + trap1.calcularArea());
	}
}
