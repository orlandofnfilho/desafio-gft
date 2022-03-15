package questao001;

import questao001.entities.Colaborador;
import questao001.entities.Gerente;
import questao001.entities.Supervisor;
import questao001.entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		Colaborador gerente = new Gerente("João", 40, 7000.00, 5);
		Colaborador supervisor = new Supervisor("Ricardo", 35, 5000.00, 3);
		Colaborador vendedor = new Vendedor("Ricardo", 35, 3500.00, 2);
	
		
		System.out.println(gerente.toString());
		System.out.println(supervisor.toString());
		System.out.println(vendedor.toString());

	}

}
