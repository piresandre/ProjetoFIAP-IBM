package br.com.studybot.beans;


/**
 *  Classe para objetos do tipo Curso, onde serão contidos,
	 * valores e métodos para o mesmo.
 *
 */


public class Curso {

	
	/**
	 * Atributos com modificadores de acesso privados
	 * 
	 */
	
	private int codigo;
	private String nome;
	private String descricao;
	private double valor;
	
	
	
	/**
	 * Construtores usaddos para passagem de paramento no objeto Curso
	 * 
	 */
	public Curso() {
		super();
	}

	public Curso(int codigo, String nome, String descricao, double valor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}

	
	/**
	 * Metodo que retona o codigo do Curso
	 * @return int Codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**Metodo setter com retorno vazio para passagem de atributo no objeto Curso
	 * 
	 * 
	 * @param codigo
	 */
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	

	/**
	 * Metodo que retorna o nome do aluno
	 * 
	 * @return String nome
	 * 
	 */
	public String getNome() {
		return nome;
	}
	
	/**Metodo setter com retorno vazio para passagem de atributo no objeto Curso
	 * 
	 * 
	 * @param nome
	 */

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	/**
	 * Metodo que retona a descrição da classe curso
	 * @return String descricao;
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * Metodo com retorno vazio para passagem de paramentro 
	 * @param descricao
	 */

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	/**
	 * Metodo que retorna o valor do Curso
	 * @return double valor
	 */
	public double getValor() {
		return valor;
	}

	
	/**
	 * Metodo com retorno vazio para passagem de parametro
	 * @param valor
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	/**
	 * Metodo set all para passagem de todos parametros
	 * @param codigo
	 * @param nome
	 * @param descricao
	 * @param valor
	 */
	public void setAll(int codigo, String nome, String descricao, double valor) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	/**Metodo get all
	 * 
	 * @return String que retorna todos os atributos da classe curso
	 */
	
	public String getAll() {
		return codigo +"\n"+
	           nome +"\n"+
				descricao +"\n"+
	           valor;
	}
	
	
	
	
	
	
	
	
		
}
