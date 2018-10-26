package br.com.studyboot.testeprof;

import java.util.List;

import br.com.studyboot.bo.ProfessorBO;
import br.com.studybot.beans.Aluno;
import br.com.studybot.beans.Professor;

public class MostrarProf {

	public static void main(String[] args) {
		try {
			ProfessorBO bo = new ProfessorBO();

			List<Professor> lista = bo.consultarProfessor("P");
			

			for (Professor prof : lista) {

				System.out.println(prof.getAll());
				

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	}


