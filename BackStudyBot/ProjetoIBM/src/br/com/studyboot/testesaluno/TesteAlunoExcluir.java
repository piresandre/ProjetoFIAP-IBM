package br.com.studyboot.testesaluno;

import javax.swing.JOptionPane;

import br.com.studyboot.bo.AlunoBO;
import br.com.studybot.beans.Aluno;
import br.com.studybot.dao.AlunoDAO;

public class TesteAlunoExcluir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Aluno a = new Aluno();
			a.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do aluno para ser excluido")));
			AlunoBO bo = new AlunoBO();
			System.out.println(bo.apagarPorCodigo(a));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
