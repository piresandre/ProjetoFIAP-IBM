package br.com.studyboot.testeprof;

import javax.swing.JOptionPane;

import br.com.studyboot.bo.ProfessorBO;
import br.com.studybot.beans.Professor;

public class TesteExcluirProf {

	public static void main(String[] args) {
		
		try {
			Professor prof  = new Professor();
			prof.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do professor para ser excluido")));
			ProfessorBO bo = new ProfessorBO();
			System.out.println(bo.apagarProfessor(prof));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
		}
	}


	}


