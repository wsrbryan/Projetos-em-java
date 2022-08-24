package br.com.alura;

public class TestaCursoComAluno {

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
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		Aluno bryan = new Aluno("Bryan William", 15654);
		System.out.println("Este Bryan esta matriculado?");
		System.out.println(javaColecoes.estaMatricula(bryan));
		
		System.out.println("O a1 e equals ao Bryan?");
		System.out.println(a1.equals(bryan));
		
		System.out.println(a1.hashCode() == bryan.hashCode());
		
		
	}
	
}
