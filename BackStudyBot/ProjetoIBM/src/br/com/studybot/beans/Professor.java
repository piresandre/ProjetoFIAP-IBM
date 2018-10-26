package br.com.studybot.beans;
/**
 * Classe que representa o objeto Professor dentro da plataforma de estudos StudyBoot;
 *  
 * @author André Pires
 *
 */
public class Professor {

	private int codigo;
	private String nome;
	private String apelido;
	private String rg;
	private String cpf;
	private String email;
	private String telefone;
	private String senha;
	private String sexo;
	private int idade;
	private String comprovantePagamento;
	private String dataNascimento;
	
	
	
	/**
	 * Construtores usaddos para passagem de paramento no objeto Curso
	 * 
	 */
	public Professor(int codigo, String nome, String apelido, String rg, String cpf, String email, String telefone,
			String senha, String sexo, int idade, String comprovantePagamento, String dataNascimento) {
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
		this.comprovantePagamento = comprovantePagamento;
		this.dataNascimento = dataNascimento;
	}




	
	
	
	
	public Professor() {
		


	}




	public Professor(int int1, String string, String string2, String string3, String string4, String string5,
			String string6, String string7, int int2, String string8, String string9) {
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




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getApelido() {
		return apelido;
	}




	public void setApelido(String apelido) {
		this.apelido = apelido;
	}




	public String getRg() {
		return rg;
	}




	public void setRg(String rg) {
		this.rg = rg;
	}




	public String getCpf() {
		return cpf;
	}




	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getTelefone() {
		return telefone;
	}




	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}




	public String getSenha() {
		return senha;
	}




	public void setSenha(String senha) {
		this.senha = senha;
	}




	public String getSexo() {
		return sexo;
	}




	public void setSexo(String sexo) {
		this.sexo = sexo;
	}




	public int getIdade() {
		return idade;
	}




	public void setIdade(int idade) {
		this.idade = idade;
	}




	public String getComprovantePagamento() {
		return comprovantePagamento;
	}




	public void setComprovantePagamento(String comprovantePagamento) {
		this.comprovantePagamento = comprovantePagamento;
	}




	public String getDataNascimento() {
		return dataNascimento;
	}




	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void  setAllProfessor(int codigo, String nome, String apelido, String rg, String cpf, String email, String string,
			String senha, String sexo, int idade, String comprovantePagamento, String dataNascimento) {
		
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
		this.comprovantePagamento = comprovantePagamento;
		this.dataNascimento = dataNascimento;
	}








	public void setAllProfessor(int codigo2, String nome2, String apelido2, String rg2, String cpf2, String email2,
			int i, String senha2, String sexo2, int idade2, String comprovantePagamento2, String dataNascimento2) {
		// TODO Auto-generated method stub
		
	}
	
	public String getAll() {
		
		return codigo +"\n"+
		       nome +"\n"+
				apelido +"\n"+
				rg+"\n"+
				cpf +"\n"+
				email +"\n"+
				telefone +"\n"+
				senha+"\n"+
				sexo+"\n"+
				idade+"\n"+
				comprovantePagamento +"\n"+
				dataNascimento;
		
	}





		
}
