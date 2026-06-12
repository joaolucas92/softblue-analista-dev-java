//Um aluno tirou notas 8.5, 7.5 e 6.0 em provas que tinham peso 3, 2 e 5, respectivamente.
//Escreva um programa que imprima a média do aluno. 

public class Aplicacao {

	public static void main(String[] args) {
		
		double nota1 = 8.5;
		double nota2 = 7.5;
		double nota3 = 6.0;
		
		double media = ((nota1 * 3) + (nota2 * 2) + (nota3 * 5)) / (3 + 2 + 5);
		
		System.out.println("A média do aluno é: " + media);
		
	}

}
