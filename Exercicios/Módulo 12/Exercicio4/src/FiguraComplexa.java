public class FiguraComplexa extends Figura {
	
	private Figura[] figuras;
	
	public FiguraComplexa(Figura... figuras) {
		this.figuras = figuras;
	}
	
	public double calcularArea() {
		double areaTotal = 0.0;
		for (Figura f : figuras) {
			areaTotal += f.getArea();
		}
		System.out.print("Área total: ");
		return areaTotal;
	}

}
