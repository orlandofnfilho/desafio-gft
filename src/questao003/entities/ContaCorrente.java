package questao003.entities;

public class ContaCorrente extends Conta {

	public ContaCorrente() {
		super();

	}

	public ContaCorrente(Integer numero, String titular, double saldo) {
		super(numero, titular, saldo);
	}

	@Override
	public double rendimento(double saldo) {
		return (saldo * 0.05) - 0.75;
	}

}
