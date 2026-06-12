public class Aplicacao {
	
	public static void main(String[] args) {
		
		Object o = null;
		
		try {
			o.toString();
		} catch (NullPointerException e) {
			System.out.println("Erro: Objeto não pode ser nulo!");
		}
		
		System.out.println("Fim do programa!");
	}

}
