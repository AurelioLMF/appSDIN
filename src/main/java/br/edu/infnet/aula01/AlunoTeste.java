package br.edu.infnet.aula01;

import java.util.ArrayList;
import java.util.List;

public class AlunoTeste {

	public static void main(String[] args) {
		
		String[] nomes = {"Aurelio", "Maria", "Joao", "Davi"};
		
		String[] emails = {"aureliolmf@hotmail.com", "maria@hotmail.com", "joao@hotmail.com", "d@vi"};
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for(int i = 0; i < nomes.length; i++) {
			Aluno aluno = new Aluno();
			aluno.setId(i+1);
			aluno.setNome(nomes[i]);
			aluno.setEmail(emails[i]);
			
			alunos.add(aluno);
		}
		
		for (Aluno item : alunos) {
			System.out.println(item);
		}//fim do for each
	}

}
