
public class ContaInvestimento extends ContaBancaria {

	@Override
	void calcularSaldo() {
		double saldoFinal = saldo + (saldo * 0.05);
		System.out.println("Saldo final da Conta Investimento é: R$ " + saldoFinal);
	}

}
