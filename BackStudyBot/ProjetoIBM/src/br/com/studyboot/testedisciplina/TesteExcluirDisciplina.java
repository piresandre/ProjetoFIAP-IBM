package br.com.studyboot.testedisciplina;

import javax.swing.JOptionPane;

import br.com.studyboot.bo.DisciplinaBO;
import br.com.studybot.beans.Disciplina;

public class TesteExcluirDisciplina {

	public static void main(String[] args) {
		
		try {
			
			Disciplina dis = new Disciplina();
			dis.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da disciplina para ser excluido")));
			DisciplinaBO bo = new DisciplinaBO();
			System.out.println(bo.apagarPorNome(dis) +" linhas foram excluidas");
			
		}catch(Exception e ) {
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
