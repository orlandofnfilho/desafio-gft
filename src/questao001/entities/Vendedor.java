package questao001.entities;

public class Vendedor extends Colaborador {

	public Vendedor() {
		super();
	}

	public Vendedor(String nome, Integer idade, double salario, Integer grauIntrucao) {
		super(nome, idade, salario, grauIntrucao);

	}

	@Override
	public double bonificacao() {
		return (super.bonificacao() + 300.00 * getGrauIntrucao() * 4);
	}

}
