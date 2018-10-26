package br.com.studyboot.bo;


import java.util.List;

import br.com.studybot.beans.Pagamento;
import br.com.studybot.beans.Pedido;
import br.com.studybot.dao.PagamentoDAO;
import br.com.studybot.dao.PedidoDAO;


/**
 * Classe que manipula os dados da Clase pedido dao passado pelo usuario
 * @author André
 * 
 * Faz a validação dos atributos codigo e data e valor que nao podem ser negativos ou nulos
 *
 */
public class PedidoBO {
	
	public static String entradaPedido(Pedido objPedido) throws Exception{
		
		if(objPedido.getCodigo() < 1) {
			return "Codigo invalido";
		}
		
		if(objPedido.getData().length() < 10  &&  objPedido.getData().length() > 10) {
			return "Data invalida, digite DD/MM/AAAA";
			
		}
		
		
		
		if(objPedido.getValor() < 0) {
			return "Valor invalido";
		}
		PedidoDAO dao = new PedidoDAO();
		String x=dao.adicionar(objPedido);
		dao.fechar();
		
		return x;
	}
	public static int apagarPedido(Pedido n) throws Exception {
		PedidoDAO dao = new PedidoDAO();
		int x = dao.excluirPedido(n);
		dao.fechar();

		return x;

	}
	public static List<Pedido> consultarPedido(int n) throws Exception {
		PedidoDAO dao = new PedidoDAO();
		List<Pedido> ped = dao.mostrarPedido(n);
		dao.fechar();
		return ped;
	}
	
	
	
	

}

