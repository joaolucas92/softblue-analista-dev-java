import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	private static final String FILE_LIVROS = "livros.bin";
	
	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		List<Livro> livros = new ArrayList<>();

		while (true) {
			System.out.println("Selecione a opção desejada: ");
			System.out.println("1 - Gravar");
			System.out.println("2 - Ler");
			System.out.println("0 - Terminar Programa");
			String opcao = scan.nextLine();

			if (opcao.equals("0")) {
				System.out.println("Fim da execução!");
				break;
			} else if (opcao.equals("1")) {
				System.out.print("Quantos livros serão gravados:");
				int qtde = scan.nextInt();
				scan.nextLine();

				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				for (int i = 0; i < qtde; i++) {
					System.out.println("Cadastre novo livro:");
					System.out.print("Título: ");
					String titulo = scan.nextLine();
					System.out.print("Número de páginas: ");
					int numPaginas = scan.nextInt();
					scan.nextLine();
					System.out.print("Nome do autor: ");
					String nomeAutor = scan.nextLine();
					System.out.print("Data de Nascimento do autor: ");
					String dataNasc = scan.nextLine();
					Date dataFormat = sdf.parse(dataNasc);
					Livro livro = new Livro(titulo, numPaginas, new Autor(nomeAutor, dataFormat));
					livros.add(livro);
				}
				try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_LIVROS))) {
					dos.writeInt(livros.size());
					for (Livro l : livros) {
						l.write(dos);
					}
				}
			} else if (opcao.equals("2")) {
				try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_LIVROS))) {
					int qtd = dis.readInt();
					for (int i = 0; i < qtd; i++) {
						Livro l = new Livro();
						l.read(dis);
						System.out.println(l);
					}
				}
			} else {
				continue;
			}

		}
		scan.close();
	}

}