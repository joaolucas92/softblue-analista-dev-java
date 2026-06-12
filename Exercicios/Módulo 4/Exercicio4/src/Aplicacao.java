public class Aplicacao {

	public static void main(String[] args) {
		
		Turma turma = new Turma();
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		turma.aluno1 = aluno1;
		turma.aluno2 = aluno2;
		turma.aluno3 = aluno3;
		
		Prova aluno1Prova1 = new Prova();		
		aluno1Prova1.notaParte1 = 4.0;
		aluno1Prova1.notaParte2 = 2.5;
		Prova aluno1Prova2  = new Prova();
		aluno1Prova2.notaParte1 = 1.0;
		aluno1Prova2.notaParte2 = 7.0;
		aluno1.prova1 = aluno1Prova1;
		aluno1.prova2 = aluno1Prova2;
		
		Prova aluno2Prova1 = new Prova();
		aluno2Prova1.notaParte1 = 6.5;
		aluno2Prova1.notaParte2 = 3.5;
		Prova aluno2Prova2  = new Prova();
		aluno2Prova2.notaParte1 = 0.0;
		aluno2Prova2.notaParte2 = 3.0;
		aluno2.prova1 = aluno2Prova1;
		aluno2.prova2 = aluno2Prova2;
		
		Prova aluno3Prova1 = new Prova();
		aluno3Prova1.notaParte1 = 5.0;
		aluno3Prova1.notaParte2 = 4.0;
		Prova aluno3Prova2  = new Prova();
		aluno3Prova2.notaParte1 = 6.0;
		aluno3Prova2.notaParte2 = 1.5;
		aluno3.prova1 = aluno3Prova1;
		aluno3.prova2 = aluno3Prova2;
		
		System.out.println("Aluno 1 - Prova 1: " + aluno1Prova1.calcularNotaTotal());
		System.out.println("Aluno 1 - Prova 2: " + aluno1Prova2.calcularNotaTotal());
		System.out.println("Aluno 2 - Prova 1: " + aluno2Prova1.calcularNotaTotal());
		System.out.println("Aluno 2 - Prova 2: " + aluno2Prova2.calcularNotaTotal());
		System.out.println("Aluno 3 - Prova 1: " + aluno3Prova1.calcularNotaTotal());
		System.out.println("Aluno 3 - Prova 2: " + aluno3Prova2.calcularNotaTotal());
		System.out.println(" - ");
		System.out.println("Média aluno 1: " + aluno1.calcularMedia());
		System.out.println("Média aluno 2: " + aluno2.calcularMedia());
		System.out.println("Média aluno 3: " + aluno3.calcularMedia());
		System.out.println(" - ");
		System.out.println("Média da Turma: " + turma.calcularMedia());
	}
}
