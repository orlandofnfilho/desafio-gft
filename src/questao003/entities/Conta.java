package questao003.entities;

public abstract class Conta {
	private Integer numero;
	private String titular;
	private double saldo;

	public Conta() {

	}

	public Conta(Integer numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract double rendimento(double saldo);
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Numero: %d\n", getNumero()));
		sb.append(String.format("Titular: %s\n", getTitular()));
		sb.append(String.format("Rendimento mensal: R$%.2f\n", rendimento(saldo)));
		sb.append(String.format("Saldo: R$%.2f\n", getSaldo() + rendimento(saldo)));
		
		
		return sb.toString();
		
	}



}
