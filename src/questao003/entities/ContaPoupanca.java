package questao003.entities;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();

	}

	public ContaPoupanca(Integer numero, String titular, double saldo) {
		super(numero, titular, saldo);

	}

	@Override
	public double rendimento(double saldo) {
		return saldo * 0.07;
	}

}
