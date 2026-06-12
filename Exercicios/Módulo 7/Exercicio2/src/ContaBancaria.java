public abstract class ContaBancaria {
	
	protected double saldo;
	
	void depositar(double valor) {
		saldo += valor;
		System.out.println("Deposito realizado!");
		System.out.println("Novo saldo: R$ " + saldo);
	}
	
	void sacar(double valor) {
		if (saldo < valor) {
			System.out.println("Saldo insuficiente!");
		} else {
			saldo -= valor;
			System.out.println("Saque realizado!");
			System.out.println("Novo saldo: R$ " + saldo);
		}
	}
	
	void tranferir(double valor, ContaBancaria conta) {
		if (saldo < valor) {
			System.out.println("Saldo insuficiente!");
		} else {
			saldo -= valor;
			conta.saldo += valor;
			System.out.println("Tranferencia realizada!");
			System.out.println("Novo saldo: R$ " + saldo);
		}
	}
	
	abstract void calcularSaldo();
	
	public double getSaldo() {
		return saldo;
	}

}
