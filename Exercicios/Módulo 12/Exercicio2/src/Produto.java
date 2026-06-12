import java.text.NumberFormat;

public class Produto implements Comparable<Produto> {
	
	private static NumberFormat nf = NumberFormat.getCurrencyInstance();

	private String nome;
	private double valor;

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}
	
	public String toString() {
		return String.format("%s %s", "Produto: " + nome, "- Valor: " + nf.format(valor));
	}

	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	@Override
	public int compareTo(Produto p) {
		Double valor1 = Double.valueOf(this.valor);
		Double valor2 = Double.valueOf(p.valor);
		return valor1.compareTo(valor2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
//		long temp;
//		temp = Double.doubleToLongBits(valor);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Produto other = (Produto) obj;
//		if (nome == null) {
//			if (other.nome != null)
//				return false;
//		} else if (!nome.equals(other.nome))
//			return false;
//		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
//			return false;
//		return true;
//	}

	

}
