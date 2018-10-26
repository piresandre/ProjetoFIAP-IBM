package br.com.studyboot.testepagamento;

import javax.swing.JOptionPane;

import br.com.studyboot.bo.PagamentoBO;
import br.com.studybot.beans.Pagamento;

public class ExcluirPagamento {

	public static void main(String[] args) {
		
		try {
		Pagamento p = new Pagamento();
		p.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da disciplina para ser excluido")));
		PagamentoBO bo = new PagamentoBO();
		System.out.println(bo.apagarPorCodigo(p) +" linhas foram excluidas");
		
	}catch(Exception e ) {
		e.printStackTrace();
		System.out.println(e);
	}


		
		

	}}
	
		
		

	

