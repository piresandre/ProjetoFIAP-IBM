package br.com.studybot.beans;

public class Aula {

	/**
	 * Classe para objetos do Classe para objetos do tipo Aula, onde serão contidos,
	 * valores e métodos para o mesmo.
	 * 
	 * @author André Pires
	 * @version 1.0
	 * 
	 */

	/**
	 * Atributos com modificadores de acesso privado so podem ser chamados através
	 * de getters e setters
	 * 
	 */
	private int codigo;
	private String nome;
	private String descricao;
	private Disciplina disciplina;
	private Curso curso;
	private Professor professor;

	/**
	 * Metodos construtores usado para passagem de parametro no obejto Aula
	 */

	public Aula() {
		disciplina = new Disciplina();
		curso = new Curso();
		professor = new Professor();
	}

	public Aula(int codigo, String nome, String descricao, Disciplina disciplina, Curso curso, Professor professor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.disciplina = disciplina;
		this.curso = curso;
		this.professor = professor;
	}

	/**
	 * Metodo para retorno do codigo da aula
	 * 
	 * @return int Codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Metodo setter com retorno vazio para passagem de atributo no objeto aula
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
	 */

	public String getNome() {
		return nome;
	}

	/**
	 * Metodo setter com retorno vazio para passagem de atributo no objeto aula
	 * 
	 * @param nome
	 */

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**Metodo que retorna a descricao da aula
	 * 
	 * @return descricao;
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**Metodo com retorno vazio para passagem de atributo no obejto aula
	 * 
	 * @param descricao
	 */

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**Metodo que retorna um atributo de referencia da classe professor
	 * 
	 * @return Professor professor
	 */
	public Professor getProfessor() {
		return professor;
	}

	
	/**
	 * Metodo sem retorno do atributo de referencia da classe professor
	 * @param professor
	 */
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	
	/**
	 * Metodo que retorna um atributo de referencia do tipo Curso
	 * @return Curso curso
	 */
	public Curso getCurso() {
		return curso;
	}
	
	/**
	 * Metodo sem retorno do atributo de referencia da classe Curso
	 * @param curso
	 */

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	
	/**
	 * Metodo que retonra ym atribudo de referencia do tipo Disciplina
	 * @return
	 */
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

}
