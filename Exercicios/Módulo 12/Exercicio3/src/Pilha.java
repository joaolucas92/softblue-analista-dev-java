
/*
 * Cole��o de dados do tipo pilha. Na pilha, o �ltimo elemento a ser adicionado � o primeiro a ser removido.
 */
public class Pilha extends Colecao {
	
	/* Posi��o do elemento que est� no topo da pilha */
	protected int posAtual;
	
	public Pilha() {
		super();
	}

	public Pilha(int tamanho) {
		super(tamanho);
	}

	/* Insere um item na cole��o */
	public void inserirItem(Object item) {
		itens[posAtual] = String.valueOf(item);
		posAtual++;
	}

	/* Remove o �ltimo elemento adicionado � cole��o */
	public Object removerItem() {
		posAtual--;
		Object item = itens[posAtual];
		itens[posAtual] = null;
		return item;
	}
}