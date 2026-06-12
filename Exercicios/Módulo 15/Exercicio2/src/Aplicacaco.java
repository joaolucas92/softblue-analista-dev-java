public class Aplicacaco {
	
	public static void main(String[] args) {
		
		Validador v = new Validador();
		
		System.out.println(v.validarCpf("009.645.999-96"));
		System.out.println(v.validarCpf("00964599996"));
		System.out.println(v.validarCpf("009 645 999 96"));
		System.out.println(v.validarCpf("009645 999 96"));
		System.out.println(v.validarCpf("00964599996123"));
		
		System.out.println(v.validarTelefone("(43)9611-0098"));
		System.out.println(v.validarTelefone("(43)    9611-0098"));
		System.out.println(v.validarTelefone("9611-0098"));
		System.out.println(v.validarTelefone("9611 0098"));
		System.out.println(v.validarTelefone("96110098"));
	}

}
