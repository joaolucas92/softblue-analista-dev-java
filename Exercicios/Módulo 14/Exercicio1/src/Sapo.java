public class Sapo extends Thread {
	
	private static final int MAX_PULO = 50;
	private static final int MAX_DESCANSO = 1000;
	private static Object monitor = new Object();
	private String nome;
	private int distanciaPercorrida;
	private int distanciaTotal;
	private int ultimoPulo;
	private static int colocacao;
	
	public Sapo(String nome, int distanciaTotal) {
		this.nome = nome;
		this.distanciaTotal = distanciaTotal;
	}

	@Override
	public void run() {
		while (distanciaPercorrida < distanciaTotal) {
			pular();
			descansar();
			avisarSituacao();
		}
		
		cruzarLinhaDeChegada();
	}
	
	private void pular() {
		ultimoPulo = (int)(Math.random() * MAX_PULO);
		distanciaPercorrida += ultimoPulo;
		
		if (distanciaPercorrida < distanciaTotal) {
			distanciaPercorrida = distanciaTotal;
		}
	}
	
	private void descansar() {
		int tempo = (int)(Math.random() * MAX_DESCANSO);
		
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void avisarSituacao() {
		System.out.println(nome + " pulou " + ultimoPulo + "cm. A distância percorrida foi de " + distanciaPercorrida + "cm.");
	}
	
	private void cruzarLinhaDeChegada() {
		synchronized (monitor) {
			colocacao++;
			System.out.println(nome + " cruzou a linha de chegada em " + colocacao + "º lugar.");
		}
	}
	
}