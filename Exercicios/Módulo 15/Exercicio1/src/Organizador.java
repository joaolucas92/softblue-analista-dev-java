import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Organizador {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	
	public Album carregarFotos(File diretorio) throws Exception {
		Album album = new Album();
		Pattern p = Pattern.compile("[A-Z]+(?<id>\\d{5})-(?<data>\\d{8})_?(?<cidade>.+)?\\..+");
		
		for (File arquivo : diretorio.listFiles()) {
			String nome = arquivo.getName();
			Matcher m = p.matcher(nome);
			
			if (m.matches()) {
				String id = m.group("id");
				int idConvertido = Integer.parseInt(id);
				String data = m.group("data");
				String cidade = m.group("cidade");
				Date dataFormatada = sdf.parse(data);
				album.adicionar(idConvertido, dataFormatada, cidade);
			}
			
		}
		return album;
	}

}
