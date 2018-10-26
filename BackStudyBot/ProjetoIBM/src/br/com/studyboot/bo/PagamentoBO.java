package br.com.studyboot.bo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import br.com.studybot.beans.Pagamento;
import br.com.studybot.dao.PagamentoDAO;

/**
 * @author André
 * @version 1.0
 * @see PagamentoBO, Pagamento
 * 
 */

public class PagamentoBO {
	
	
	/*
	 * Classe responsavel por manipular as regras relacionadas ao cadastro de
	 * pagamento
	 * 
	 * codigo pagamento não pode ser < 1 descrição pode ter no máximo 20 caracteres
	 * 
	 */
	

	public static String entradaPagamento(Pagamento objPagamento) throws Exception {

		if (objPagamento.getCodigo() < 1) {
			return "Codigo invalido";
		}

		if (objPagamento.getDescricao().length() > 20) {
			return "A descrição deve ter no máximo 20 caracteres";
		}

		PagamentoDAO dao = new PagamentoDAO();
		dao.adicionar(objPagamento);
		return "Gravado com sucesso";
	}

	public static int apagarPorCodigo(Pagamento n) throws Exception {
		PagamentoDAO dao = new PagamentoDAO();
		int x = dao.excluirPagamento(n);

		return x;

	}

	public static List<Pagamento> consultarPorNome(int n) throws Exception {
		PagamentoDAO dao = new PagamentoDAO();
		List<Pagamento> pagamento = dao.mostrarPagamentos(n);
		dao.fechar();
		return pagamento;
	}
	

}
