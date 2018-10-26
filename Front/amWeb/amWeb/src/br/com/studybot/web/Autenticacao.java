package br.com.studybot.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class Autentificacao
 */
@WebServlet("/Autentificacao")
public class Autenticacao extends HttpServlet {
	/*
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session == null) {
		resp.sendRedirect("indexLogin.jsp");
		}else {
		RequestDispatcher dispatcher = 
			req.getRequestDispatcher("WEB-INF/paginas/meusCursos.jsp");
			dispatcher.forward(req, resp);
			
			}

		}  */

}