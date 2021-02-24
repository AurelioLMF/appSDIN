package br.edu.infnet.aula01;

import java.util.HashMap;
import java.util.Map;

public class AlunoMapa {

	public static void main(String[] args) {
		
		Map<Integer, String> mapaAluno = new HashMap<Integer, String>();
		
		mapaAluno.put(1, "Aurelio");
		mapaAluno.put(2, "Maria");
		mapaAluno.put(3, "Joao");

		mapaAluno.remove(2);

		System.out.println(mapaAluno);
	}

}
