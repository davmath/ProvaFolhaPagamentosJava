  
package models;

public class Funcionario {
	public Funcionario() {
		setData(new String());
	}
	//Características, atributos ou propriedades
	private String nome;
	private String cpf;
	private String data;
	
	//Getter and Setters
	public void setNome(String nome) {	
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " | CPF: " + getCpf() + " | Data: " + getData();
	}
	
}