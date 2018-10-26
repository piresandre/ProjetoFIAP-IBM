package br.com.studyboot.testedisciplina;

import javax.swing.JOptionPane;

import br.com.studyboot.bo.DisciplinaBO;
import br.com.studybot.beans.Disciplina;

public class TesteInlcuirDisciplina {

	public static void main(String[] args) {
		
		try {
		
		Disciplina dis =new Disciplina();
		
		dis.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo")));
		dis.setNome(JOptionPane.showInputDialog("Digite o nome"));
		dis.setDescricao(JOptionPane.showInputDialog("Digite a descricao"));
		
		DisciplinaBO bo=new DisciplinaBO();
		System.out.println(bo.tipoDisciplina(dis));
		
		}catch(Exception e ) {
			e.printStackTrace();
			System.out.println(e);
		
		
			
			
		}
		

	}

}
