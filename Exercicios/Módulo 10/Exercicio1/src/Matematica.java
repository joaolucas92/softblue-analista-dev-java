public class Matematica {
	
	public enum TipoAngulo {
		GRAUS,
		RADIANOS;
	}
	
	Double converterAngulo(Double angulo, TipoAngulo tipo) {
		Double resultado;
		
		if (tipo == TipoAngulo.GRAUS) {
			Double rad = Math.toRadians(angulo);
			resultado = rad;
		} else if (tipo == TipoAngulo.RADIANOS) {
			Double graus = Math.toDegrees(angulo);
			resultado = graus;
		} else {
			throw new IllegalArgumentException("Tipo inválido!");
		}
		
		return resultado;
	}
	
	public static Integer somar(Integer n1, Integer n2, Integer n3) {
		return n1 + n2 + n3;
	}
	
	public static Integer converterBinarioParaDecimal(String numBinario) {
		Integer decimal = Integer.valueOf(numBinario, 2);
		return decimal;
	}

}
