public class Semaforo extends Thread {

	private String corSemaforo = "verde";
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (this) {
				if (corSemaforo.equals("verde")) {
					corSemaforo = "vermelho";
				} else {
					corSemaforo = "verde";
					notifyAll();
				}
				
				System.out.println("O semáforo agora está " + corSemaforo);
			}
		}
	}
	
	public synchronized void mudarCorDoSemaforo(int id) {
		while (corSemaforo.equals("vermelho")) {
			try {
				System.out.println("Carro " + (id + 1) + " esperando o sinal abrir.");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Carro " + (id + 1) + " atravessou o sinal verde.");
	}
	
	public String getCorSemaforo() {
		return corSemaforo;
	}

}
