public enum Operacao {
	
	SOMA('+'),
	SUBTRACAO('-'),
	MULTIPLICACAO('x'),
	DIVISAO('/');

	private char c;
	
	Operacao(char c) {
		this.c = c;
	}

	public String toString() {
		return String.valueOf(c);
	}
	
	public double calcular(double valor1, double valor2) {
		if (this == SOMA) {
			return valor1 + valor2;
		} else if (this == SUBTRACAO) {
			return valor1 - valor2;
		} else if (this == MULTIPLICACAO) {
			return valor1 * valor2;
		} else if (this == DIVISAO){
			return valor1 / valor2;
		} else {
			throw new UnsupportedOperationException("O cálculo não pode ser realizado!");
		}
	}

}
