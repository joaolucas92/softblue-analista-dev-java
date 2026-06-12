public class Calculador {
	
	public static void main(String[] args) {
		
		Figura f1 = new Quadrado(3);
		Figura f2 = new Quadrado(10);
		Figura f3 = new Retangulo(2, 7);
		Figura f4 = new Retangulo(5, 3);
		
		System.out.println(f1.calcularArea());
		System.out.println(f2.calcularArea());
		System.out.println(f3.calcularArea());
		System.out.println(f4.calcularArea());
		
		Figura figComp = new FiguraComplexa(f1, f2, f3, f4);
		System.out.println(figComp.calcularArea());
	}

}
