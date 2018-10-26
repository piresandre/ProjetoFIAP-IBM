package br.com.studybot.beans;


/**
 * Classe para objetos do Classe para objetos do tipo Aula, onde ser�o contidos,
 *  valores e m�todos para o mesmo.
 *  
 * @author Andr� Pires
 *
 */


public class Disciplina {
	
	/**
	 * Atributos com modificadores de acesso privados
	 * 
	 */

	private int codigo;
	private String nome;
	private String descricao;
	/**
	 * Construtores usaddos para passagem de paramento no objeto Curso
	 * 
	 */
	public Disciplina() {

	}

	public Disciplina(int codigo, String nome, String descricao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	/**
	 * Metodo que retorna o codigo  da disciplina
	 * @return codigo
	 */
	
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Metodo setter com retorno vazio para passagem de atributo no objeto disciplina
	 * @param codigo
	 */

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Metodo que retorna o nome  da disciplina
	 * @return nome
	 */
	
	public String getNome() {
		return nome;
	}

	/**
	 * Metodo setter com retorno vazio para passagem de atributo no objeto disciplina
	 * @param nome
	 */

	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Metodo que retorna a descricao   da disciplina
	 * @return descricao
	 */

	public String getDescricao() {
		return descricao;
	}
	/**
	 * Metodo setter com retorno vazio para passagem de atributo no objeto disciplina
	 * @param descricao
	 */
	

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/**
	 * Metdod setAll da classe disciplina
	 * @param codigo
	 * @param nome
	 * @param descricao
	 */

	public void setAll(int codigo, String nome, String descricao) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
	
	
}
	/**Metodo que retorna todos os atributos 
	 * 
	 * @return String
	 */
	public String getAll() {
		return codigo+ "\n" +
	           nome + "\n" +
				descricao;
	}
	
}
