
public class ContaCorrente extends ContaBancaria {

	@Override
	void calcularSaldo() {
		double saldoFinal = saldo - (saldo * 0.1);
		System.out.println("Saldo final da Conta Corrente é: R$ " + saldoFinal);
	}

}
