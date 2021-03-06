package br.com.studybot.excecao;

import java.sql.SQLException;

/**Classe responsavel por tratar exce��es 
 * @author Andr�
 *
 */
public class Excecao extends Exception{
	
	
	/**
	 * Metodo estatico que recebe uma Exception e retorna algum tipo de erro.
	 * @param e
	 * 
	 * @return String 
	 */

	
	public static String tratarExcecao(Exception e) {
		
		if(e instanceof SQLException) {
			
			return "Erro no banco de dados";	
		}else if(e instanceof NumberFormatException) {
			return "Falha ao converter um numero";
		}else {
			return"Erro desconhecido";
			
		}
		
		
		
		
		
		
		
	}
}
