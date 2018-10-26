package br.com.studybot.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	public Connection getConexao() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		// return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","login","senha");
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","login","senha");
	}

}