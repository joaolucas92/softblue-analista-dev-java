public class Carro extends Thread {

	private int id;
	private Semaforo semaforo;

	public Carro(int id, Semaforo semaforo) {
		this.id = id;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		while (true) {
			semaforo.mudarCorDoSemaforo(id);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
