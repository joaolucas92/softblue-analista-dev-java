import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
	
	public static boolean validarCpf(String cpf) {
		String regex = "\\d{3}[\s.]?\\d{3}[\s.]?\\d{3}[\s-]?\\d{2}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(cpf);
		
		return m.matches();
		
	}
	
	public static boolean validarTelefone(String telefone) {
		String regex = "(\\(\\d{2}\\))?\\s*\\d{4}[\s-]\\d{4}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(telefone);
		
		return m.matches();
	}

}
