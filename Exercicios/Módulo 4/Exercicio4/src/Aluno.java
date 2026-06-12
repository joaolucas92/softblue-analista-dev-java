public class Aluno {
	
	Prova prova1;
	Prova prova2;
	
	double calcularMedia() {
		double mediaAluno = (prova1.calcularNotaTotal() + prova2.calcularNotaTotal()) / 2;
		return mediaAluno;
	}

}
