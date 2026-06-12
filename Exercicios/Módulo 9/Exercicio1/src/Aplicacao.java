import java.text.DateFormat;
import java.util.Calendar;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Calendar c1 = Calendar.getInstance();
		c1.set(2020, Calendar.OCTOBER, 4);
		Produto p1 = new Produto("Feijão", 2.5, c1.getTime());
		
		Calendar c2 = Calendar.getInstance();
		c2.set(2022, Calendar.JANUARY, 1);
		Produto p2 = new Produto("Café", 1.0, c2.getTime());
		
		Calendar c3 = Calendar.getInstance();
		c3.set(2017, Calendar.NOVEMBER, 12);
		Produto p3 = new Produto("Beterraba", 0.9, c3.getTime());
		
		System.out.printf("%d) %12s %09.2f %s %n", 1, p1.getNome(), p1.getPeso(), p1.getFormattedDataValidate());
		System.out.printf("%d) %12s %09.2f %s %n", 2, p2.getNome(), p2.getPeso(), p2.getFormattedDataValidate());
		System.out.printf("%d) %12s %09.2f %s %n", 3, p3.getNome(), p3.getPeso(), p3.getFormattedDataValidate());
		
		//Exemplo fora do exercício para formatar a data sem usar o método getFormattedDataValidate()
		Calendar c4 = Calendar.getInstance();
		c4.set(2025, Calendar.DECEMBER, 22);
		Produto p4 = new Produto("Macarrão", 3.0, c4.getTime());
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.SHORT);
		String s4 = df4.format(p4.getDataValidade());
		System.out.printf("%d) %12s %09.2f %s %n", 4, p4.getNome(), p4.getPeso(), s4);
	}

}
