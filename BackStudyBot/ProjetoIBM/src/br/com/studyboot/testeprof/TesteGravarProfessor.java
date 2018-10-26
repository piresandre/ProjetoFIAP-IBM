package br.com.studyboot.testeprof;

import br.com.studyboot.bo.ProfessorBO;
import br.com.studybot.beans.Professor;

public class TesteGravarProfessor {

	public static void main(String[] args) {

		try {

			Professor prof = new Professor();
			
			prof.setAllProfessor(11, "Moscow", "Professor", "98877668854", "87542245666", "w7queiroz@hotmail.com", "997850530000", "minhasenha123", "M", 25, "ok", "12/12/1990");

			ProfessorBO bo = new ProfessorBO();
			System.out.println(bo.novoProfessor(prof));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);

		}

	}

}
