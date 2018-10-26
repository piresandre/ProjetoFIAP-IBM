package br.com.studybot.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.studybot.beans.Aluno;
import br.com.studybot.dao.AlunoDAO;

/**
 * Servlet implementation class ConsultaAlunos
 */
@WebServlet("/ConsultaAlunos")
public class ConsultaAlunos extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			AlunoDAO aluno = new AlunoDAO();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
