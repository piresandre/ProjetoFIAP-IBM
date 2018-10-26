package br.com.studyboot.bo;

import java.util.List;

import br.com.studybot.beans.Aluno;
import br.com.studybot.dao.AlunoDAO;

/**Classe que faz a validação dos metodos na classe dao para que os dados passados pelos usuarios sejam dados consistentes.
 * 
 * @author André
 *
 */
public class AlunoBO {
/**
 *Metodo que valida a entrada de dados do aluno na classe dao onde codigo precisa ser positivo e maior que 1
 * @param aluno1
 * 
 * @throws Exception lança uma execção generalizada em caso de erro
 */
	public static String novoAluno(Aluno aluno1) throws Exception {

		if (aluno1.getCodigo() < 1) {
			return "Codigo Invalido";
		}
		if (aluno1.getNome().length() > 50) {
			return "Nome invalido";

		}
		
	
		AlunoDAO dao = new AlunoDAO();
		String msg = dao.addAluno(aluno1);
		dao.fechar();
		return msg;
	}
/**
 * Metodo que faz a validação do metodo dao apagar
 * @param n
 * @return retona a quantidade de linhas excluiddas
 * @throws Exception
 */
	public static int apagarPorCodigo(Aluno n) throws Exception {
		if (n.getCodigo() <= 0) {
			return 0;
		}
		AlunoDAO dao = new AlunoDAO();
		int x = dao.excluirAluno(n);
		dao.fechar();
		return x;
	}
	
	/**
	 * Validação do metdod que retona uma lista de alunos da classe DAO
	 * @param n
	 * @return List
	 * @throws Exception
	 */
	public static List<Aluno>consultarPorNome(String n)throws Exception{
		
		AlunoDAO dao =new AlunoDAO();
		List<Aluno> x=dao.mostrarPorNome(n);
		dao.fechar();
		return x;
		
	}
	
	public static int gerarCodigo(Aluno c)throws Exception {
		AlunoDAO dao = new AlunoDAO();
		int x= dao.geraCodigo(c);
		dao.fechar();
		
		return x;
		
	}

}
