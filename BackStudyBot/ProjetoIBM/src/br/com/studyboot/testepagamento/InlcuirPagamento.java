package br.com.studyboot.testepagamento;

import br.com.studyboot.bo.PagamentoBO;
import br.com.studybot.beans.Pagamento;

public class InlcuirPagamento {

	public static void main(String[] args) throws Exception {
	
		try {
			
			Pagamento pag1 =new Pagamento();
			
			pag1.setCodigo(3);
			pag1.setDescricao("debito");
			
			PagamentoBO bo = new PagamentoBO();
			System.out.println(PagamentoBO.entradaPagamento(pag1));

			
		}catch (Exception e ) {
			e .printStackTrace();
			System.out.println(e);
		}
		
	}

}
