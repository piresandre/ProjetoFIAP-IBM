package br.com.studybot.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.studybot.beans.Aluno;
import br.com.studybot.bo.AlunoBO;
import br.com.studybot.dao.AlunoDAO;
import br.com.studybot.excecao.Excecao;

/**
 * Servlet implementation class cadastraAluno
 */
@WebServlet("/cadastraAluno")
public class cadastraAluno extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
		String nome = req.getParameter("nome");
		String apelido = req.getParameter("apelido");
		String rg = req.getParameter("rg");
		String cpf = req.getParameter("cpf");
		String email = req.getParameter("email");
		int telefone = Integer.parseInt(req.getParameter("telefone"));
		String senha = req.getParameter("senha");
		String sexo = req.getParameter("sexo");
		int idade = Integer.parseInt(req.getParameter("idade"));
		String descHistorico = req.getParameter("descHistorico");
		String grauEscolaridade = req.getParameter("grauEscolaridade");
		String dataFormacao = req.getParameter("dataFormacao");
		String dataNascimento = req.getParameter("dataNascimento");




		 
			String aluno = AlunoBO.novoAluno(new Aluno(descHistorico,grauEscolaridade,dataFormacao,
					 AlunoBO.gerarCodigo(),nome,apelido,rg,cpf,dataNascimento,email,telefone,senha,sexo,idade));
			
		if(aluno.length()>0) {
			resp.sendRedirect("indexLogin.jsp");
		}else {
			resp.sendRedirect("index.jsp");
		}
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}  
		 
		
		
		
		/*			stmt.setString(1, aluno.getHistorico());
		stmt.setString(2, aluno.getGrauEscolaridade());
		stmt.setString(3, aluno.getDataFormacao());
		stmt.setInt(4, aluno.getCodigo());
		stmt.setString(5, aluno.getNome());
		stmt.setString(6, aluno.getApelido());
		stmt.setString(7, aluno.getRg());
		stmt.setString(8, aluno.getCpf());
		stmt.setString(9,aluno.getData());
		stmt.setString(10, aluno.getEmail());
		stmt.setInt(11,aluno.getTelefone());
		stmt.setString(12, aluno.getSenha());
		stmt.setString(13,String.valueOf(aluno.getSexo()));
		stmt.setInt(14, aluno.getIdade());
 */
		

	}

}
