import java.io.File;

public class Aplicacao {
	
	public static void main(String[] args) throws Exception {
		
		File pasta = new File("./Fotos");
		Organizador organizador = new Organizador();
		
		Album album = organizador.carregarFotos(pasta);
		album.listarFotos();
	}

}
