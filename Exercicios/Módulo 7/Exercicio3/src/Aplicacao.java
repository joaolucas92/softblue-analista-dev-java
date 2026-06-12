public class Aplicacao {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Porta p1 = new Porta(3, 1.5, false);
		System.out.println("Altura: " + p1.getAltura() + ", Largura: " + p1.getLargura() + ", Aberta: " + p1.isAberta());
		p1.abrir();
		System.out.println("Altura: " + p1.getAltura() + ", Largura: " + p1.getLargura() + ", Aberta: " + p1.isAberta());
		Porta p2 = (Porta) p1.clone();
		System.out.println("Altura: " + p2.getAltura() + ", Largura: " + p2.getLargura() + ", Aberta: " + p2.isAberta());
		p2.fechar();
		System.out.println("Altura: " + p2.getAltura() + ", Largura: " + p2.getLargura() + ", Aberta: " + p2.isAberta());
	}

}
