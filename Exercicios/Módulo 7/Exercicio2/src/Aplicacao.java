
public class Aplicacao {
	
	public static void main(String[] args) {
		
		ContaBancaria cc = new ContaCorrente();
		ContaBancaria ci = new ContaInvestimento();
		System.out.println("Saldo da Conta Corrente é de: R$ " + cc.getSaldo());
		System.out.println("Saldo da Conta Investimento é de: R$ " + ci.getSaldo());
		
		cc.depositar(500);
		cc.sacar(200);
		cc.tranferir(50, ci);
		System.out.println("Saldo da Conta Investimento é de: R$ " + ci.getSaldo());
		ci.depositar(350);
		ci.sacar(100);
		ci.tranferir(80, cc);
		System.out.println("Saldo da Conta Corrente é de: R$ " + cc.getSaldo());
		
		cc.calcularSaldo();
		ci.calcularSaldo();
		
	}

}
