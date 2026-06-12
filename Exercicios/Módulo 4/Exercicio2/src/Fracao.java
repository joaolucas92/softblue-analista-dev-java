public class Fracao {
	
	double numerador;
	double denominador;
	
	void armazenarFracao(double num, double denom) {
		this.numerador = num;
		this.denominador = denom;
	}
	
	void multiplciarFracao(Fracao f1, Fracao f2) {
		numerador = f1.numerador * f2.numerador;
		denominador = f1.denominador * f2.denominador;
	}
	
	String obterFracao() {
		return numerador + "/" + denominador;
	}

}
