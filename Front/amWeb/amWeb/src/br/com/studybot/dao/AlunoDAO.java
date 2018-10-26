package br.com.studybot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.studybot.beans.Aluno;
import br.com.studybot.conexao.Conexao;

public class AlunoDAO {

	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public AlunoDAO()throws Exception {
		con = new Conexao().getConexao();
	}
	
	
		public String addAluno(Aluno aluno)throws Exception {
		 stmt = con.prepareStatement("INSERT INTO T_STB_ALUNO VALUES (?,?,to_date(?,'dd/mm/yyyy'),?,?,?,?,?,to_date(?,'dd/mm/yyyy'),?,?,?,?,?)"); //INSERIR OS NOMES
		 //DAS COLUNAS ANTES ENTRE () E DEPOIS O VALUES
		stmt.setString(1, aluno.getHistorico());
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

		stmt.executeUpdate();
		return "Adicionado"; 
		}	
		
		
		public int excluirAluno(Aluno aluno)throws Exception {
			stmt = con.prepareStatement("DELETE FROM T_STB_ALUNO WHERE CD_ALUNO=?");
			stmt.setInt(1, aluno.getCodigo());
			return stmt.executeUpdate();
		}
		
		public void fechar()throws Exception{
			con.close();
		}
		
		
		public List<Aluno> mostrarPorNome(String nome)throws Exception{
			List<Aluno>lista=new ArrayList<Aluno>();
			
			stmt=con.prepareStatement("SELECT * FROM T_STB_ALUNO WHERE NM_ALUNO LIKE ?");
			stmt.setString(1, nome + "%");
			rs=stmt.executeQuery();
			while(rs.next()) {
				lista.add(new Aluno(
						rs.getInt("CD_ALUNO"),
						rs.getString("NM_ALUNO"),
						rs.getString("NM_APELIDO"),
						rs.getString("NR_RG"),
						rs.getString("NR_CPF"),
						rs.getString("DS_EMAIL"),
						rs.getInt("NR_TELEFONE"),
						rs.getString("NR_SENHA"),
						rs.getString("DS_SEXO"),
						rs.getInt("NR_IDADE"),
						rs.getString("DT_NASCIMENTO"),
						rs.getString("DS_HISTORICO"),
						rs.getString("DS_GRAU_ESCOLARIDADE"),
						rs.getString("DT_ANO_FORMACAO")));
			}
			
			rs.close();
			
			
			return lista;
			
		}
		
		public Aluno buscaEmailSenha(String email, String senha)throws Exception {
			
			stmt=con.prepareStatement("SELECT * FROM T_STB_ALUNO WHERE DS_EMAIL=? AND NR_SENHA=?");
			stmt.setString(1, email);
			stmt.setString(2, senha);
			rs=stmt.executeQuery();
			if(rs.next()) {
				
				return new Aluno(
						rs.getInt("CD_ALUNO"),
						rs.getString("NM_ALUNO"),
						rs.getString("NM_APELIDO"),
						rs.getString("NR_RG"),
						rs.getString("NR_CPF"),
						rs.getString("DS_EMAIL"),
						rs.getInt("NR_TELEFONE"),
						rs.getString("NR_SENHA"),
						rs.getString("DS_SEXO"),
						rs.getInt("NR_IDADE"),
						rs.getString("DT_NASCIMENTO"),
						rs.getString("DS_HISTORICO"),
						rs.getString("DS_GRAU_ESCOLARIDADE"),
						rs.getString("DT_ANO_FORMACAO"));
			}else {
		
			return new Aluno();
		}
			
		
	}
		
		public int geraCodigo()throws Exception {
			stmt= con.prepareStatement("SELECT MAX (CD_ALUNO)+1 AS CD_ALUNO FROM T_STB_ALUNO");
			rs=stmt.executeQuery();
			rs.next();
			int resultado= rs.getInt("cd_aluno");
			return resultado;
		}
}
		
