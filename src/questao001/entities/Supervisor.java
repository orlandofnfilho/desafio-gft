package questao001.entities;

public class Supervisor extends Colaborador {

	public Supervisor() {
		super();
	}

	public Supervisor(String nome, Integer idade, double salario, Integer grauIntrucao) {
		super(nome, idade, salario, grauIntrucao);
	}

	@Override
	public double bonificacao() {
		return (super.bonificacao() + 500.00 * getGrauIntrucao() * 3);
	}

}
