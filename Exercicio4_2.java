import java.util.*;

public class Exercicio4_2 {

	public static void main(String[] args) {
		String nomeEmpregado[] = new String[100];
		int codEmpregado;
		int numPecas;
		float salario[] = new float[100];
		float totalSalarios = 0;
		int cont;
		Scanner leia = new Scanner(System.in);
		
		for(cont = 0 ; cont < 100 ; cont++) {
			System.out.print("Nome do empregado (FIM p/ encerrar): ");
			nomeEmpregado[cont] = leia.nextLine();
			if (nomeEmpregado[cont].equalsIgnoreCase("fim")) {
				break;
			}
			
			do {
				System.out.print("Codigo do empregado: ");
				codEmpregado = leia.nextInt();
				if (codEmpregado < 1 || codEmpregado > 999) {
					System.out.println("Codigo invalido, digite de 1 a 999");
				}
			}while(codEmpregado < 1 || codEmpregado > 999);
			
			do {
				System.out.print("Numero de pecas fabricadas: ");
				numPecas = leia.nextInt();
				if (numPecas < 1) {
					System.out.println("valor invalido, digite acima de zero");
				}
			}while(numPecas < 1);
			
			// calculos
			salario[cont] = calcularSalario(numPecas);
			totalSalarios = totalSalarios + salario[cont];
			
			leia.nextLine();
		} // end for

		System.out.println("RELATORIO DE SALARIOS");
		System.out.println("--NOME-- SALARIO");
		for (int x = 0; x < cont ; x++) {
			System.out.println(nomeEmpregado[x] + "    " + salario[x]);
		}
		System.out.println("Total pago com salarios: " + totalSalarios);
		System.out.println("Media dos salarios: " + totalSalarios / cont);
				
	}

	public static float calcularSalario (int pecas) {
		float salario;
		if (pecas <= 200) {
			salario = 2 * pecas;
		}else if (pecas <= 400) {
			salario = 2.30f * pecas;
		} else {
			salario = 2.50f * pecas;
		}
		return salario;
	}
}
