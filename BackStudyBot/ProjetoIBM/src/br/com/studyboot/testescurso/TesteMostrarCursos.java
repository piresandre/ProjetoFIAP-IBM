package br.com.studyboot.testescurso;

import java.util.List;

import br.com.studyboot.bo.CursoBO;
import br.com.studybot.beans.Curso;
import br.com.studybot.beans.Disciplina;

public class TesteMostrarCursos {

	public static void main(String[] args) {
		
		
		try{
			CursoBO bo = new CursoBO();
			
			List<Curso> lista = CursoBO.consultarPornOme("");
			

			for (Curso  cursos : lista) {

				System.out.println(cursos.getAll());
		}}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}


	}

}
