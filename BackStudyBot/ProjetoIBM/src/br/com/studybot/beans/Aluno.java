package br.com.studybot.beans;

public class Aluno {
	
	
	/**Classe para objetos do Classe para objetos do tipo Alunos, onde ser�o contidos, valores e m�todos para o mesmo.
	 * @author Andr� Pires
	 * @version 1.0
	
	 */
	private int codigo;
	private String nome;
	private String apelido;
	private String rg;
	private String cpf;
	private String email;
	private int telefone;
	private String senha;
	private String sexo;
	private int idade;
	private String data;
	private String historico;
	private String grauEscolaridade;
	private String dataFormacao;
	
	
	
	/**
	 * Metodo construtor cheio  para instanciar o aluno atraves do construtor
	 * @param codigo
	 * @param nome
	 * @param apelido
	 * @param rg
	 * @param cpf
	 * @param email
	 * @param telefone
	 * @param senha
	 * @param sexo
	 * @param idade
	 * @param data
	 * @param historico
	 * @param grauEscolaridade
	 * @param dataFormacao
	 */
	
	
	public Aluno(int codigo, String nome, String apelido, String rg, String cpf, String email, int telefone,
			String senha, String sexo, int idade, String data, String historico, String grauEscolaridade,
			String dataFormacao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.apelido = apelido;
		this.rg = rg;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.sexo = sexo;
		this.idade = idade;
		this.data = data;
		this.historico = historico;
		this.grauEscolaridade = grauEscolaridade;
		this.dataFormacao = dataFormacao;
	}
	
	

	public Aluno(){
		super();
	}
	
	public Aluno(int int1, String string, String string2, String string3, String string4, String string5, int int2,
			String string6, String string7, int int3, String string8, String string9, String string10, String string11,
			Pagamento pagamento) {
		// TODO Auto-generated constructor stub
	}
	
	 /** M�todo para retorno da codigo do aluno

     *   @return int -codigo
     *   */
	
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Metodo setter com retorno void do codigo para passagem de paramento no bjeto aluno
	 * @param codigo
	 */

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	 /** M�todo para retorno do nome do aluno

     *   @return String -nome
     *   */
	

	public String getNome() {
		return nome;
	}
	
	/**
	 * Metodo setter com retorno void do nome para passagem de paramento no objeto aluno
	 * @param nome
	 */

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/** M�todo para retorno do apelido do aluno

     *   @return String -apelido
     *   
     *   */
	

	public String getApelido() {
		return apelido;
	}
	
	/**
	 * Metodo setter com retorno void do apelido para passagem de paramento no objeto aluno
	 * @param apelido
	 */

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	/** M�todo para retorno do rg do aluno

     *   @return String -rg
     *   
     *   */

	
	
	public String getRg() {
		return rg;
	}
	
	/**
	 * Metodo setter com retorno void do rg para passagem de paramento no objeto aluno
	 * @param rg
	 */

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	/**M�todo para retorno do cpf do aluno
	 * 
	 * @return String cpf
	 */

	public String getCpf() {
		return cpf;
	}

	/**
	 * Metodo setter com retorno void do cpf  para passagem de paramento no objeto aluno
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * M�todo para retorno do email do aluno
	 * @return String email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Metodo setter com retorno void do email  para passagem de paramento no objeto aluno
	 * @param email
	 */

	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * M�todo para retorno do telefone do aluno
	 * @return int-Telefone
	 */

	public int getTelefone() {
		return telefone;
	}
	
	/**
	 * Metodo setter com retorno void do telefone  para passagem de paramento no objeto aluno
	 * @param telefone
	 */

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	/**
	 * M�todo para retorno da senha do aluno
	 * @return String senha
	 */

	public String getSenha() {
		return senha;
	}
	
	/**
	 * Metodo setter com retorno void do senha  para passagem de paramento no objeto aluno
	 
	 * @param senha
	 */

	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * Metodo para retorno do sexo do aluno.
	 * @return String sexo
	 */
	public String getSexo() {
		return sexo;
	}
	
	/** Metodo setter com retorno void do sexo  para passagem de paramento no objeto aluno
	 
	 * 
	 * @param sexo
	 */

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	/**
	 * Metodo para retorno da idade do aluno.
	 *
	 * @return int idade
	 */

	public int getIdade() {
		return idade;
	}
	
	/**
	 *  Metodo setter com retorno void da idade  para passagem de paramento no objeto aluno
	 
	 * @param idade
	 */

	public void setIdade(int idade) {
		this.idade = idade;
	}
	/**
	 *  Metodo para retorno da data de nascimento do aluno.
	 *
	 * @return String data
	 */

	public String getData() {
		return data;
	}
	
	/**
	 *  Metodo setter com retorno void da data de nascimento  para passagem de paramento no objeto aluno
	 
	 * @param data
	 */

	public void setData(String data) {
		this.data = data;
	}

	/**Metodo para retorno de historico do aluno
	 * 
	 * @return String Historico
	 */
	public String getHistorico() {
		return historico;
	}
	
	/**
	 *Metodo setter com retorno void do historico   para passagem de paramento no objeto aluno
	  
	 *  
	 * @param historico
	 */

	public void setHistorico(String historico) {
		this.historico = historico;
	}
	
/**Metodo para retorno do grau de escolaridade do aluno.
 * 
 * @return String Grau de Escolaridade
 */
	public String getGrauEscolaridade() {
		return grauEscolaridade;
	}
	
	/**
	 * Metodo setter com retorno void do graud de escolaridade   para passagem de paramento no objeto aluno
	 * @param grauEscolaridade
	 */

	public void setGrauEscolaridade(String grauEscolaridade) {
		this.grauEscolaridade = grauEscolaridade;
	}

	/**Metodo para retorno da data de forma��o.
	 * 
	 * @return Strind Data de Forma��o 
	 */
	public String getDataFormacao() {
		return dataFormacao;
	}

	public void setDataFormacao(String dataFormacao) {
		this.dataFormacao = dataFormacao;
	}
	
	/**
	 * Metodo que usado para atribur ao objeto aluno atributos com  modificadores de acesso privado
	 * 
	 * @return String
	 */
	
	public String getAll() {
		return codigo+ "\n" +
	           nome+ "\n" +
			  apelido+ "\n" +
	           rg+ "\n" +
			  cpf+ "\n" +
	           email+ "\n" +
			  telefone+ "\n" +
	           senha+ "\n" +
			  sexo+ "\n" +
	           idade+ "\n" +
			  data+ "\n" +
	           historico+ "\n" +
			  grauEscolaridade+ "\n" +
	           dataFormacao;
	           
	           
	}
	
	public void setaAllAluno(int codigo, String nome, String apelido, String rg, String cpf, String email, int telefone,
			String senha, String sexo, int idade, String data, String historico, String grauEscolaridade,
			String dataFormacao) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.apelido = apelido;
		this.rg = rg;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.sexo = sexo;
		this.idade = idade;
		this.data = data;
		this.historico = historico;
		this.grauEscolaridade = grauEscolaridade;
		this.dataFormacao = dataFormacao;
	}

	


}
	

	
	
