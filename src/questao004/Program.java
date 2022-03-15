package questao004;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe seus dados: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.print("Peso: ");
		double peso = sc.nextDouble();
		sc.nextLine();
		System.out.print("Altura em metros ex.: 1.60 ");
		double altura = sc.nextDouble();
		sc.nextLine();

		double imc = peso / (altura * altura);
		String categoria;

		if (imc < 18.5) {
			categoria = "Abaixo do peso";
		} else if (imc < 24.9) {
			categoria = "Peso normal";

		} else if (imc < 29.9) {
			categoria = "Sobrepeso";
		} else if (imc < 34.9) {
			categoria = "Obesidade Grau I";
		} else if (imc < 39.9) {
			categoria = "Obesidade Grau II";

		} else {
			categoria = "Obesidade Grau III";
		}

		System.out.println();
		System.out.println(categoria);

		sc.close();
	}

}
