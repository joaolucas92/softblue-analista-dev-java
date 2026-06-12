public class Aplicacao {

	public static void main(String[] args) {
		
		double soma = Operacao.SOMA.calcular(15, 18);
		System.out.println(Operacao.SOMA + " -> " + soma);
		
		double subtracao = Operacao.SUBTRACAO.calcular(30, 10);
		System.out.println(Operacao.SUBTRACAO + " -> " + subtracao);
		
		double multiplicacao = Operacao.MULTIPLICACAO.calcular(16, 6);
		System.out.println(Operacao.MULTIPLICACAO + " -> " + multiplicacao);

		double divisao = Operacao.DIVISAO.calcular(50, 5);
		System.out.println(Operacao.DIVISAO + " -> " + divisao);
	}
}
