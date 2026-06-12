
public class Aplicacao {

	public static void main(String[] args) {
		
		double area;
		
		AreaCalculavel q = new Quadrado(2);
		area = q.calcularArea();
		System.out.println(area);
		
		AreaCalculavel r = new Retangulo(5.5, 3);
		area = r.calcularArea();
		System.out.println(area);
		
		AreaCalculavel c = new Circunferencia(3.5);
		area = c.calcularArea();
		System.out.println(area);
	}

}
