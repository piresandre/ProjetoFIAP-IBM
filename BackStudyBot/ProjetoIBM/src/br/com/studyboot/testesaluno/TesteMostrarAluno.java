package br.com.studyboot.testesaluno;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.studyboot.bo.AlunoBO;
import br.com.studybot.beans.Aluno;
import br.com.studybot.dao.AlunoDAO;

public class TesteMostrarAluno {

	public static void main(String[] args) {


		try {
			AlunoBO bo = new AlunoBO();

			List<Aluno> lista = bo.consultarPorNome("");
			

			for (Aluno aluno1 : lista) {

				System.out.println(aluno1.getAll());
				

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
