package questao001.entities;

public class Colaborador {

	private String nome;
	private Integer idade;
	private double salario;
	private Integer grauIntrucao;

	public Colaborador() {

	}

	public Colaborador(String nome, Integer idade, double salario, Integer grauIntrucao) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.grauIntrucao = grauIntrucao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Integer getGrauIntrucao() {
		return grauIntrucao;
	}

	public void setGrauIntrucao(Integer grauIntrucao) {
		this.grauIntrucao = grauIntrucao;
	}

	public double bonificacao() {
		return salario;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Nome: %s, ", getNome()));
		sb.append(String.format("Idade: %d, ", getIdade()));
		sb.append(String.format("Grau de Intrução: %d ", getGrauIntrucao()));
		sb.append(String.format("Salário: %.2f\n", bonificacao()));

		return sb.toString();
	}

}
