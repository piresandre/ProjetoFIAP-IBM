package br.com.studyboot.testesaluno;

import javax.swing.JOptionPane;

import br.com.studyboot.bo.AlunoBO;
import br.com.studybot.beans.Aluno;
import br.com.studybot.dao.AlunoDAO;

public class TesteAlunoGravar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			
			Aluno aluno1 = new Aluno();
			aluno1.setCodigo(8);
			aluno1.setHistorico("muito bom");
			aluno1.setGrauEscolaridade("superior");
			aluno1.setDataFormacao("12/12/1990");
			aluno1.setNome("Wilson pereira");
			aluno1.setApelido("Willi");
			aluno1.setRg("776777709");
			aluno1.setCpf("3924088809");
			aluno1.setData("12/12/79");
			aluno1.setEmail("wquei@hotmail.com");
			aluno1.setTelefone(99869999);
			aluno1.setSenha("9559988799");
			aluno1.setSexo("M");
			aluno1.setIdade(27);
			
			
			
			AlunoBO bo = new AlunoBO();
			System.out.println(bo.novoAluno(aluno1));

		} catch (Exception e) {
			

			e.printStackTrace();
			System.out.println(e);
		}
	}

}
