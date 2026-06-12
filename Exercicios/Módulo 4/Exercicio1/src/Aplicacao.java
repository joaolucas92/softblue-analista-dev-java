
public class Aplicacao {

	public static void main(String[] args) {

		Relogio r1 = new Relogio();

		r1.acertaRelogio(22, 30, 10);

		System.out.println("Posição da hora: " + r1.ponteiroHora.posicao);
		System.out.println("Posição do minuto: " + r1.ponteiroMinuto.posicao);
		System.out.println("Posição do segundo: " + r1.ponteiroSegundo.posicao);

		int hora = r1.lerHora();
		int minuto = r1.lerMinuto();
		int segundo = r1.lerSegundo();

		System.out.println("Hora: " + hora);
		System.out.println("Minuto: " + minuto);
		System.out.println("Segundo: " + segundo);

	}

}
