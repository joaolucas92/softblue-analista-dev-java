public class Aplicacao {
	
	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		
		double angulo1 = 15;
		double ac1 = m.converterAngulo(angulo1, Matematica.TipoAngulo.GRAUS);
		System.out.println(angulo1 + "º: " + ac1 + " radianos");
		
		double angulo2 = 90;
		double ac2 = m.converterAngulo(angulo2, Matematica.TipoAngulo.GRAUS);
		System.out.println(angulo2 + "º: " + ac2 + " radianos");
		
		double angulo3 = 180;
		double ac3 = m.converterAngulo(angulo3, Matematica.TipoAngulo.GRAUS);
		System.out.println(angulo3 + "º: " + ac3 + " radianos");
		
		double angulo4 = m.converterAngulo(ac1, Matematica.TipoAngulo.RADIANOS);
		System.out.println(ac1 + " radianos: " + angulo4 + " º");
		
		double angulo5 = m.converterAngulo(ac2, Matematica.TipoAngulo.RADIANOS);
		System.out.println(ac2 + " radianos: " + angulo5 + " º");
		
		double angulo6 = m.converterAngulo(ac3, Matematica.TipoAngulo.RADIANOS);
		System.out.println(ac3 + " radianos: " + angulo6 + " º");
		
		double angulo7 = m.converterAngulo(Math.PI/2, Matematica.TipoAngulo.RADIANOS);
		System.out.println(Math.PI/2 + " radianos: " + angulo7 + " º");
		
		int soma = m.somar(10, 21, 30);
		System.out.println(soma);
		
		int dec = m.converterBinarioParaDecimal("101101011101");
		System.out.println(dec);
		
	}

}
