
/*
 * Representa uma cole��o de dados
 */
public class Colecao {

	/* Array de itens da cole��o. Como s�o arrays de Object, podem armazenar qualquer coisa */
	protected Object[] itens;
	
	/* Construtor que recebe o tamanho da cole��o como par�metro */
	public Colecao(int tamanho) {
		itens = new Object[tamanho];
	}
	
	/* Construtor que assume o tamanho 10 por padr�o */
	public Colecao() {
		this(10);
	}
	
	/* Insere um item. Este m�todo � sobrescrito pelas subclasses */
	public void inserirItem(Object item) {
	}
	
	/* Remove um item. Este m�todo � sobrescrito pelas subclasses */
	public Object removerItem() {
		return null;
	}
}