
public class Aplicacao {
	
	public static void main(String[] args) throws ValorInvalidoException, SaldoInsuficienteException {
		
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		
		try {
			c1.depositar(1000);
			System.out.println("Depósito realizado com sucesso!");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() +  "Valor inválido: " + e.getValorInvalido());
		}
		try {
			c1.depositar(-500);
			System.out.println("Depósito realizado com sucesso!");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() +  "Valor inválido: " + e.getValorInvalido());
		}

		try {
			c1.sacar(300);
			System.out.println("Saque realizado com sucesso!");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() +  "Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() +  "Saldo insuficiente: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.sacar(-300);
			System.out.println("Saque realizado com sucesso!");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() +  "Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() +  "Saldo insuficiente: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.sacar(3000);
			System.out.println("Saque realizado com sucesso!");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() +  "Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() +  "Saldo insuficiente: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.transferir(200, c2);
			System.out.println("Tranferência realizada com sucesso!");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() +  "Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() +  "Saldo insuficiente: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.transferir(-100, c2);
			System.out.println("Tranferência realizada com sucesso!");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() +  "Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() +  "Saldo insuficiente: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.transferir(2000, c2);
			System.out.println("Tranferência realizada com sucesso!");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() +  "Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() +  "Saldo insuficiente: " + e.getSaldoDisponivel());
		}
		
		c1.imprimirSaldo();
		c2.imprimirSaldo();
		
	}

}
