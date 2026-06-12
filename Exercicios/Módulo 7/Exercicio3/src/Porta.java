public class Porta implements Cloneable {

	private double altura;
	private double largura;
	private boolean aberta;

	@Override
	public Object clone() throws CloneNotSupportedException {
		Porta p = new Porta(this.altura, this.largura, this.aberta);
		return p;
	}
	
	public Porta(double altura, double largura, boolean aberta) {
		this.altura = altura;
		this.largura = largura;
		this.aberta = aberta;
	}
	
	void abrir() {
		aberta = true;
	}

	void fechar() {
		aberta = false;
	}

	public double getAltura() {
		return altura;
	}

	public double getLargura() {
		return largura;
	}

	public boolean isAberta() {
		return aberta;
	}

}
