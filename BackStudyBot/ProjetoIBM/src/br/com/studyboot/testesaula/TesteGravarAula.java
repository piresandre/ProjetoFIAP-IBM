package br.com.studyboot.testesaula;

import br.com.studyboot.bo.AulaBO;
import br.com.studybot.beans.Aula;
import br.com.studybot.beans.Curso;
import br.com.studybot.beans.Disciplina;
import br.com.studybot.beans.Professor;

public class TesteGravarAula {

	public static void main(String[] args) {

		try {
			
			Aula a =new Aula();
			a.setCodigo(11);
			a.setNome("SWIFT");
			a.setDescricao("API IOS");
			Disciplina d1=new Disciplina();
			d1.setAll(2, "Celesta", "82,76");
			Curso c1=new Curso();
			c1.setAll(1, "Aline","Josee",22.5);
			Professor prof = new Professor();
			prof.setAllProfessor(1, "LUCIO", "LUCIO", "456789123", "456789123", "lucio@gmail.com", 25368978, "12345698", "M", 52, "FORMADO", "26/06/65");
			
			AulaBO bo =new AulaBO();
			System.out.println(bo.cadastroAula(a));
			
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println(ex);
		
	}
		
			
			
			
		
		

	}

}
