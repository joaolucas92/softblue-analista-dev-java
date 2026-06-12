import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Laranja", 2.50);
		Produto p2 = new Produto("Laranja", 2.70);
		Produto p3 = new Produto("Maçã", 1.45);
		Produto p4 = new Produto("Mamão", 4.95);
		Produto p5 = new Produto("Limão", 2.30);
		
		ArrayList<Produto> colecao1 = new ArrayList<Produto>();
		Set<Produto> colecao2 = new HashSet<Produto>();
		Set<Produto> colecao3 = new LinkedHashSet<Produto>();
		Set<Produto> colecao4 = new TreeSet<Produto>();
		
		Produtos prod = new Produtos(colecao1);
		
		prod.adicionar(p1);
		prod.adicionar(p2);
		prod.adicionar(p3);
		prod.adicionar(p4);
		prod.adicionar(p5);
		prod.imprimir();
		
		prod.mudarColecao(colecao2);
		prod.imprimir();
		
		prod.mudarColecao(colecao3);
		prod.imprimir();
		
		prod.mudarColecao(colecao4);
		prod.imprimir();
	}

}
