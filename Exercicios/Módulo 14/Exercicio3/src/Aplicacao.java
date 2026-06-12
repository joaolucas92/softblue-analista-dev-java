
public class Aplicacao {
	
	private static final int QTDE_CARROS = 10;
	
	public static void main(String[] args) {
		
		Semaforo semaforo = new Semaforo();
		semaforo.start();
		
		Carro[] carros = new Carro[QTDE_CARROS];
		
		for (int i = 0; i < carros.length; i++) {
			carros[i] = new Carro(i, semaforo);
			carros[i].start();
		}
	}

}
