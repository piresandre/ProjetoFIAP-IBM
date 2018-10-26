package br.com.studyboot.testePedido;

import br.com.studyboot.bo.PedidoBO;
import br.com.studybot.beans.Aluno;
import br.com.studybot.beans.Pagamento;
import br.com.studybot.beans.Pedido;

public class TestaIncluirPedido {

	public static void main(String[] args) {
		
		
try {
			
			
			Pedido pedido1 = new Pedido();
			pedido1.setCodigo(1);
			pedido1.setData("12/11/2017");
			pedido1.setValor(450);
			
			Aluno aluno1 =new Aluno();
			aluno1.setCodigo(9);
			aluno1.setHistorico("muito bom");
			aluno1.setGrauEscolaridade("superior");
			aluno1.setDataFormacao("12/12/1990");
			aluno1.setNome("Wilson pereira");
			aluno1.setApelido("Willi");
			aluno1.setRg("987625384949");
			aluno1.setCpf("39240888888");
			aluno1.setData("12/12/79");
			aluno1.setEmail("wquei@hotmail.com");
			aluno1.setTelefone(99876543);
			aluno1.setSenha("9559987799");
			aluno1.setSexo("M");
			aluno1.setIdade(27);
			
			
			
			Pagamento p1=new Pagamento();
			p1.setCodigo(3);
			p1.setDescricao("debito");
			
			
			PedidoBO bo = new PedidoBO();
			
			
			System.out.println(bo.entradaPedido(pedido1));

		} catch (Exception e) {
			

			e.printStackTrace();
			System.out.println(e);
		}
	
		

	}

}
