package br.com.studyboot.testedisciplina;

import java.util.List;

import br.com.studyboot.bo.AlunoBO;
import br.com.studyboot.bo.DisciplinaBO;
import br.com.studybot.beans.Aluno;
import br.com.studybot.beans.Disciplina;

public class TesteMostrarDisciplina {

	public static void main(String[] args) {
		
		
		try{
			DisciplinaBO bo = new DisciplinaBO();
			
			List<Disciplina> lista = DisciplinaBO.consultarDisciplina("");
			

			for (Disciplina  disciplina : lista) {

				System.out.println(disciplina.getAll());
		}}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}

		
			
		
		
		
		
		
	}
	
}
		
	
