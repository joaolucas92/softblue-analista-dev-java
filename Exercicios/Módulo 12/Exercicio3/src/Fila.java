/*
 * Cole��o de dados do tipo fila. Na fila, o primeiro elemento a ser adicionado � o primeiro a ser removido.
 */
public class Fila extends Colecao {
	
	/* Posi��o onde o pr�ximo elemento deve ser inserido */
	protected int posInserir;
	
	/* Posi��o onde o pr�ximo elemento deve ser removido */
	protected int posRemover;
	
	public Fila() {
		super();
	}

	public Fila(int tamanho) {
		super(tamanho);
	}

	/* Insere um item na pr�xima posi��o de inser��o */
	public void inserirItem(Object item) {
		itens[posInserir] = String.valueOf(item);
		posInserir++;
	}

	/* Remove o item da posi��o de remo��o */
	public Object removerItem() {
		Object item = itens[posRemover];
		itens[posRemover] = null;
		posRemover++;
		return item;
	}
}