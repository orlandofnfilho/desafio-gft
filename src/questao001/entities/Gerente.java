package questao001.entities;

public class Gerente extends Colaborador {

	public Gerente() {
		super();
	}

	public Gerente(String nome, Integer idade, double salario, Integer grauIntrucao) {
		super(nome, idade, salario, grauIntrucao);
	}

	@Override
	public double bonificacao() {
		return (super.bonificacao() + 1000.00 * getGrauIntrucao() * 2);
	}

}
