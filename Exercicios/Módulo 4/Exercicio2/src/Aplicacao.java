public class Aplicacao {
	
	public static void main(String[] args) {
		Fracao fracao1 = new Fracao();
		Fracao fracao2 = new Fracao();
		
		fracao1.armazenarFracao(2, 3);
		fracao2.armazenarFracao(5, 8);
		
		Fracao fracao3 = new Fracao();
		fracao3.multiplciarFracao(fracao1, fracao2);		
		System.out.println(fracao3.obterFracao());
	}

}
