package br.com.alura;

import java.util.*;

public class ImprimindoAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Bryan");    
        alunos.add("Rosangela");
        alunos.add("Israel");
        alunos.add("Carlos");
        
        System.out.println(alunos.size());
        
        for (String aluno : alunos) {
			System.out.println(aluno);
		}
        
        alunos.add("Bryan");
        
        System.out.println(alunos.size());
        
        
       //tente imprimir os alunos usando foreach
    }
}


