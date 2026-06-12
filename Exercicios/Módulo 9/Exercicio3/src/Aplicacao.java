import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		LocalDate dataNascimento = LocalDate.parse("19/05/1955", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate dataAtual = LocalDate.now();
		
		Period p1 = Period.between(dataNascimento, dataAtual);
		
		System.out.println("Quanto dias, meses e anos se passaram desde nascimento de James Gosling?");
		System.out.println("Dias: " + ChronoUnit.DAYS.between(dataNascimento, dataAtual));
		System.out.println("Meses: " + p1.toTotalMonths());
		System.out.println("Anos: " + ChronoUnit.YEARS.between(dataNascimento, dataAtual));
		
		LocalDateTime horaInicial = LocalDateTime.parse("12/11/2025 03:00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		LocalDateTime horaAtual = LocalDateTime.now();
		
		Duration d1 = Duration.between(horaInicial, horaAtual);
		System.out.println("Quantos segundos se passaram desde às 3 da manhã?");
		System.out.println("Segundos: " + d1.toSeconds());
		
	}

}
