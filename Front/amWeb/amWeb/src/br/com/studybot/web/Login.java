package br.com.studybot.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.studybot.beans.Aluno;
import br.com.studybot.beans.Professor;
import br.com.studybot.dao.AlunoDAO;
import br.com.studybot.dao.ProfessorDAO;
import br.com.studybot.excecao.Excecao;

@WebServlet("/login")
public class Login extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			

			String email = req.getParameter("email");
			String senha = req.getParameter("senha");
			
			Aluno aluno = new AlunoDAO().buscaEmailSenha(email, senha);
			Professor professor = new ProfessorDAO().buscaEmailSenha(email,senha);
			
			
			if(aluno.getNome() != null) {
				HttpSession session = req.getSession();
				session.setAttribute("email", aluno.getNome());
				RequestDispatcher dispatcher = 
				req.getRequestDispatcher("WEB-INF/paginas/meusCursos.jsp");
			dispatcher.forward(req, resp);
				
			}
			else if(professor.getNome()!=null){
				HttpSession session = req.getSession();
				session.setAttribute("email", professor.getNome());
				RequestDispatcher dispatcher = 
				req.getRequestDispatcher("WEB-INF/paginas/admProf.jsp");
				dispatcher.forward(req, resp);
			}  
			else {
				resp.sendRedirect("indexLogin.jsp");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}
		

		
		
	}

}
