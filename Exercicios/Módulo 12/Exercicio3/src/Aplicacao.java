public class Aplicacao {
	
	public static void main(String[] args) {
		
		Colecao c1 = new Pilha();
		Colecao c2 = new Fila();
		
		manipularDados(c1);
		manipularDados(c2);
		
	}
	
	private static void manipularDados(Colecao c) {
		/* Insere três itens */
		c.inserirItem('A');
		c.inserirItem("teste");
		c.inserirItem(10);
		c.inserirItem(12.4);
		c.inserirItem("ArrayList");
		
		/* Remove os três itens */
		String i1 = (String) c.removerItem();
		String i2 = (String) c.removerItem();
		String i3 = (String) c.removerItem();
		String i4 = (String) c.removerItem();
		String i5 = (String) c.removerItem();
		
		/* Imprime o resultado */
		System.out.print(i1 + ", " + i2 + ", " + i3 + ", " + i4 + ", " + i5);
		System.out.println();
	}

}
