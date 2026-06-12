//Escreva uma aplicação que efetua o cálculo do fatorial utilizando a forma iterativa (usando
//estruturas de repetição) e outra que efetua o mesmo cálculo, mas de forma recursiva (o
//método de cálculo do fatorial chama ele mesmo).

public class Aplicacao {

	public static void main(String[] args) {
		
		int valor = 4;
		//esta variável acumula o resultado
		long resposta = 1;
		//no bloco for, o valor já calculado (variável resposta) é multiplicado com o valor de i,
		//que é o número corrente da iteração.
		for (int i = 2; i <= valor; i++) {
			resposta *= i;
		}

		System.out.println("O fatorial de " + valor + " é igual a " + resposta);
		
		
		int valor2 = 5;
		//calcula o fatorial do valor
		int resp = calcularFatorial(valor2);

		System.out.println("O fatorial de " + valor2 + " é igual a " + resp);
	}
	/*
	 * Uma das formas de implementar o cálculo do fatorial é utilizar uma chamada recursiva, isto é,
	 * a função chama ela mesma.
	 */
	static int calcularFatorial(int num) {
		if (num == 0) {
			//para num == 0, o fatorial é 1
			return 1;
		}	
		//caso contrário, o fatorial é o número multiplicado pelo fatorial do seu antecessor
		return num * calcularFatorial(num - 1);
	}

}
