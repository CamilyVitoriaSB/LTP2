import java.util.*;
public class Exercicio1_3 {

	public static void main(String[] args) {
		// 1 - variaveis
		byte tempoCasa;
		float salario;
		float bonus;
		float valeTransp;
		Scanner leia = new Scanner(System.in);
		
		// 2 - Entrada de dados
		System.out.print("Digite o Tempo de casa: ");
		tempoCasa = leia.nextByte();
		System.out.print("Digite o salario: ");
		salario = leia.nextFloat();
		
		// 3 - Calculos
		if (tempoCasa <= 5){
			if (salario <= 300){
				bonus = 50;
				valeTransp = (float) (0.05 * salario);
			}else{    // salario > 300
				bonus = 80;
				valeTransp = (float) (0.06 * salario);
			}
		}else if (tempoCasa <= 10){   // tempoCasa de 6 a 10 anos
			if (salario <= 500){
				bonus = (float) (0.15 * salario);
				valeTransp = 70;
			}else if (salario <= 2000){   // salarios acima de 500 ate 2000
				bonus = (float) (0.13 * salario);
				valeTransp = 90;
			}else{    // salarios acima de 2000
				bonus = (float) (0.12 * salario);
				valeTransp = (float) (0.08 * salario);
			}
		}else{   // tempo casa acima de 10
			bonus = 300;
		    valeTransp = (float) (0.04 * salario);
		}
		
		// 4 - saidas
		System.out.println("O bonus do empregado eh: " + bonus);
		System.out.println("O desconto de vale transporte eh: " + valeTransp);

	}

}
