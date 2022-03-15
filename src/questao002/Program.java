package questao002;

import java.util.LinkedList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> stack = new LinkedList<Integer>();
		do {
			System.out.print("Entre o valor a ser analizado: ");
			int number = sc.nextInt();
			sc.nextLine();

			if (number >= 350 && number <= 8750) {

				while (number > 0) {
					stack.push(number % 10);
					number = number / 10;
				}
				int cont = 0;
				for (int i = 0; i < stack.size(); i++) {

					if (stack.get(i) % 2 != 0) {
						cont++;
					}

				}

				System.out.println(cont);

			}
			if (number < 350 || number > 8750) {
				System.out.println("Valor fora da escala para analizar");
			}

			if (stack.size() < 3) {
				System.out.println("O valor deve conter 3 digitos!");

			}

		} while (stack.size() < 3);

		sc.close();

	}

}
