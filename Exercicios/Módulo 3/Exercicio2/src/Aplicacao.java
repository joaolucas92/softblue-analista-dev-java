//Neste exercício, você deve completar 4 tarefas: 

public class Aplicacao {
	
	public static void main(String[] args) {
		
//1. Imprima todos os números inteiros de 10 a 25 utilizando uma estrutura de repetição.		
		int num = 10;
		while (num <= 25) {
			System.out.println(num);
			num++;
		}

//2. Imprima a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.).
		int soma = 0;
		for (int num2 = 1; num2 <= 100; num2 += 2) {
			soma = soma + num2;
		}
		System.out.println(soma);
		
//3. Começando em 0, imprima os números seguintes, enquanto a soma dos números já
//impressos for menor que 100.		
		int soma2 = 0;
		int i = 0;
		do {
			System.out.println(i);
			i++;
			soma2 = soma2 + i;
		} while (soma2 < 100);
		
//4. Imprima a tabuada do 9 (até o décimo valor).
		int x = 1;
		int res = 0;
		while (x <= 10) {
			res = 9 * x;
			System.out.println(res);
			x++;
		}
		
	}

}
