
public class Lampada {

	private boolean ligada;
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void imprimir() {
		if (ligada == true) {
			System.out.println("Lâmpaada ligada!");
		} else {
			System.out.println("Lâmpaada desligada!");
		}
	}

	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

}
