package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		
		Aluno a1 = new Aluno("Bryan William", 15654);
		Aluno a2 = new Aluno("Rosangela Sansao", 456465);
		Aluno a3 = new Aluno("Jose sansao", 656545);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem e o aluno com a matricula 456465?");
		Aluno aluno = javaColecoes.buscaMAtricula(4645);
		System.out.println("Aluno : " + aluno);
		
	}
	
}
