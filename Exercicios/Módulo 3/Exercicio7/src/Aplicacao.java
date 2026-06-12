//Crie uma aplicação que possibilita a entrada via console de um conjunto de notas de um aluno.
//Assim que -1 for informado como nota, calcule a média das notas informadas anteriormente e
//mostre na tela. Caso a nota do aluno seja inválida, mostre uma mensagem na tela solicitando
//uma nova nota.
//A entrada via console deve ser feita utilizando a classe Console, fornecida junto com os
//códigos-fonte deste exercício. Copie o arquivo Console.java para dentro do seu projeto e você
//poderá utilizá-la.

public class Aplicacao {

	public static void main(String[] args) {
		
		double somaNotas = 0.0;
		int qtdNotas = 0;
		int i = 1;
		
		while(true) {
			System.out.print("Nota "+ i + ": ");
			double nota = Console.readDouble();
			
			if (nota == -1) {
				break;
			} else if (nota < 0 || nota > 10) {
				System.out.println("Nota inválida!");
				continue;
			}
			somaNotas += nota;
			qtdNotas++;
			i++;
		}
		
		double media = somaNotas / qtdNotas;
		System.out.println("A média das notas do aluno é: " + media);
		
	}

}
