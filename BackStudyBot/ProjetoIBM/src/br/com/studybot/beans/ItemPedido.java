package br.com.studybot.beans;


/**
* Classe para objetos do Classe para objetos do tipo Aula, onde serão contidos,
*   valores e métodos para o mesmo.
*   @author André Pires
*
*/

public class ItemPedido {
	
	
	/**
	 * Atributos com modificadores de acesso privados
	 * 
	 */

	private int codigo;
	private double valor;
	private int numero;
	private int qtVendida;
	private Pedido pedido;
	private Curso curso;
	
	/**
	 * Construtores usados para passagem de paramento no objeto Curso
	 * 
	 */
	
	public ItemPedido(int i, double d, int j, int k, Pedido pedido2, Pagamento pagamento2) {
		super();
	}
	public ItemPedido(int codigo, double valor, int numero, int qtVendida, Pedido pedido, Curso curso) {
		super();
		this.codigo = codigo;
		this.valor = valor;
		this.numero = numero;
		this.qtVendida = qtVendida;
		this.pedido = pedido;
		this.curso = curso;
	}
	
	/**
	 * Metodo que retorna o codigo  da Item Pedido
	 * @return int codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * Metodo setter com retorno vazio para passagem de atributo no objeto item pedido
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Metodo que retorna o valor  da Item Pedido
	 * @return double valor
	 */
	public double getValor() {
		return valor;
	}
	/**
	 * Metodo setter com retorno vazio para passagem de atributo no objeto item pedido
	 * @param valor
	 */
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	/**
	 * Metodo que retorna o numero  do Item Pedido
	 * @return int numero
	 */
	
	
	
	public int getNumero() {
		return numero;
	}
	/**
	 * Metodo setter com retorno vazio para passagem de atributo no objeto item pedido
	 * @param numero
	 */
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * Metodo que retona a quantidade vendida
	 * @return int qtVendida
	 */
	public int getQtVendida() {
		return qtVendida;
	}
	/**
	 * Metodo setter com retorno vazio para passagem de atributo no objeto item pedido
	 * @param qtVendida
	 */
	
	public void setQtVendida(int qtVendida) {
		this.qtVendida = qtVendida;
	}
	/**Metodo que retorna um atributo de referencia da classe pedido
	 * 
	 * @return Pedido pedido
	 */
	public Pedido getPedido() {
		return pedido;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	/**
	 * Metodo que retorna um atributo de referencia da classe curso
	 * @return
	 */
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
	
	
	
	
	