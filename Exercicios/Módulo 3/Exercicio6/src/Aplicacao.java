//Verifique a validade de uma data e mostre uma mensagem na tela dizendo se a data é válida ou
//inválida. Deve haver três variáveis para armazenar esta data: uma para o dia, outra para o mês
//e outra para o ano. Considere que fevereiro pode ter somente 28 dias

public class Aplicacao {

	public static void main(String[] args) {
		
		int dia = 22;
		String mes = "Dezembro";
		int ano = 1992;
		
		if (dia > 28 && mes == "Fevereiro") {
			System.out.println("A data é inválida!");
		} else if (dia > 30 && mes == "Abril") {
			System.out.println("A data é inválida!");
		} else if (dia > 30 && mes == "Junho") {
			System.out.println("A data é inválida!");
		} else if (dia > 30 && mes == "Setembro") {
			System.out.println("A data é inválida!");
		} else if (dia > 30 && mes == "Novembro") {
			System.out.println("A data é inválida!");
		} else if (dia > 31 || dia < 1) {
			System.out.println("A data é inválida!");
		} else {
			System.out.println("A data informada é: " + dia+"/"+mes+"/"+ano);
		}
	}

}
