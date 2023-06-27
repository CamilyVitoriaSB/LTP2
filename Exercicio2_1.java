import java.util.*;
public class Exercicio2_1 {

	public static void main(String[] args) {
		// 1 - Declaracao de variaveis
		String nome;
		float salario;
		byte numDependentes;
		float novoSal;
		float somaNovoSal = 0;
		byte contSalAcima1700 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (byte x = 1 ; x <= 3 ; x++) {
			// 2 - Entrada de dados
			System.out.print("Digite o nome do empregado: ");
			nome = leia.nextLine();
			System.out.print("Digite o salario: ");
			salario = leia.nextFloat();
			System.out.print("Digite o numero de dependentes: ");
			numDependentes = leia.nextByte();
			
			// 3 - Calculos
			if (salario < 1000) {
				novoSal = salario + salario * (float)0.30;
			}else if (salario <= 2000) {
				novoSal = salario + salario * (float)0.20;
			}else {
				novoSal = salario + salario * (float)0.10;
			}
			
			novoSal = novoSal + 50 * numDependentes;
			System.out.println("Novo salario: " + novoSal);
			
			somaNovoSal = somaNovoSal + novoSal;
			if (novoSal > 1700) {
				contSalAcima1700 ++;
			}
			leia.nextLine();
			
		} // end for

		System.out.println("Soma dos novos salarios: " + somaNovoSal);
		System.out.println("Media dos novos salarios: " + somaNovoSal / 3);
		System.out.println("Num empregados com novo salario acima R$1700: " + contSalAcima1700);
	}

}
