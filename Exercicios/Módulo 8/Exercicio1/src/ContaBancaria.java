
public class ContaBancaria {

	private double saldo;
	
	public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido para saque!", valor);
		}
		
		if (saldo - valor < 0) {
			throw new SaldoInsuficienteException("Saldo insuficiente para saque!", saldo);
		}
		
		this.saldo -= valor;
	}
	
	public void depositar(double valor) throws ValorInvalidoException {
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido para depósito!", valor);
		}
		
		this.saldo += valor;
	}
	
	public void transferir(double valor, ContaBancaria conta) throws ValorInvalidoException, SaldoInsuficienteException {
			sacar(valor);
			conta.depositar(valor);
	}
	
	public void imprimirSaldo() {
		System.out.println("Saldo: " + saldo);
	}

	public double getSaldo() {
		return saldo;
	}
}
