package questao003;

import java.util.Scanner;

import questao003.entities.Conta;
import questao003.entities.ContaCorrente;
import questao003.entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Conta contaC = new ContaCorrente(12234, "Orlando", 500.00);
		Conta contaP = new ContaPoupanca(45612, "José", 1000.00);

		System.out.println(contaC.toString());
		System.out.println(contaP.toString());

		sc.close();

	}

}
