import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Livro implements Recordable {

	private String titulo;
	private int numPaginas;
	private Autor autor;

	public Livro(String titulo, int numPaginas, Autor autor) {
		this.titulo = titulo;
		this.numPaginas = numPaginas;
		this.autor = autor;
	}
	
	public Livro() {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public Autor getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Livro => Título: " + titulo  + "\n Número de Páginas: " + numPaginas + "\n" + autor + "\n ----------------";
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		titulo = in.readUTF();
		if (titulo.equals(NULL_DATA)) {
			titulo = null;
		}
		
		numPaginas = in.readInt();
		
		if (autor == null) {
			autor = new Autor();
		}
		
		autor.read(in);
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		if (titulo != null) {
			out.writeUTF(titulo);
		} else {
			out.writeUTF(NULL_DATA);
		}
		
		out.writeInt(numPaginas);
		
		if (autor != null) {
			autor.write(out);
		}
	}
}
