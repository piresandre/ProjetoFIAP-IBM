package br.com.studybot.beans;


/**
 * Classe que representa o objeto Pedido dentro da plataforma de estudos StudyBoot;
 *  
 * @author André Pires
 *
 */
public class Pedido {
	/**
	 * Atributos com modificadores de acesso privados
	 * 
	 */
	private int codigo;
	private String data;
	private double valor;
	private Aluno aluno;
	private Pagamento pagamento;
	
	/**
	 * Construtores usaddos para passagem de paramento no objeto Curso
	 * 
	 */
	public Pedido(int codigo, String data, double valor, Aluno aluno, Pagamento pagamento) {
		
		this.codigo = codigo;
		this.data = data;
		this.valor = valor;
		this.aluno = aluno;
		this.pagamento = pagamento;
		
	}
	public Pedido() {
		super();
	}
	public Pedido(int int1, String string, double double1, Aluno aluno2) {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodos getters  usados para mostrar o atributo da classe
	 * 
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * Metodos setters usados para passar os atributos que são privados ao instanciar um objeto
	 * @return void
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	


}
	
	
	
	
	
	