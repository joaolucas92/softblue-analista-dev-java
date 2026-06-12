
public class Corrida {
	
	private static final int QTDE_SAPOS = 5;
	private static final int DISTANCIA_TOTAL = 100;
	
	public static void main(String[] args) {
		
		Sapo[] sapos = new Sapo[QTDE_SAPOS];
		
		for (int i = 0; i < sapos.length; i++) {
			sapos[i] = new Sapo("Sapo "+ (i + 1), DISTANCIA_TOTAL);
			sapos[i].start();
		}
		
	}

}
