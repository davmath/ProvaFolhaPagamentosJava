package models;

public class Folha {

	//Características, atributos ou propriedades
	private int mes;
	private int ano;
	private int horasT;
	private double valor;
	
	//Getter and Setters
	public void setMes(int mes) {	
		this.mes = mes;
	}
	public int getMes() {
		return this.mes;
	}	
	public int getAno() {
		return ano;
	}
	public void setHorasT(int horasT) {
		this.horasT = horasT;
	}	
	public int getHorasT() {
		return horasT;
	}
	public void setData(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Mês: " + getMes() + " | Ano: " + getAno() + " | Horas Trabalhadas: " + getHorasT() + " | Valor da Hora: " + getValor();
	}
	
}