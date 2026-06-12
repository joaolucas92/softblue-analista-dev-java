import java.util.Collection;

public class Produtos {
	
	Collection<Produto> produtos;
	
	public Produtos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void mudarColecao(Collection<Produto> produtos) {
		Collection<Produto> temp = this.produtos;
		this.produtos = produtos;	
		// O método addAll() adiciona todos os elementos de uma coleção em outra coleção
		this.produtos.addAll(temp);
	}

	public void adicionar(Produto produto) {
		produtos.add(produto);
	}
	
	public void imprimir() {
		System.out.println("Produtos armazenados em: " + produtos.getClass().getName());
		for (Produto p : produtos) {
			System.out.println(p);
		}
		System.out.println("------------------------------------------");
	}

}
