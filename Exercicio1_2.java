import java.util.*;
public class Exercicio1_2 {

	public static void main(String[] args) {
		// 1 - variaveis
		int lado1, lado2, lado3;
		Scanner leia = new Scanner(System.in);
		
		// 2 - Entrada de dados
		System.out.print("Digite o lado 1: ");
		lado1 = leia.nextInt();
		System.out.print("Digite o lado 2: ");
		lado2 = leia.nextInt();
		System.out.print("Digite o lado 3: ");
		lado3 = leia.nextInt();
		
		// 3 - calculos
		if ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2)){
			if ((lado1 == lado2) && (lado2 == lado3)){
				System.out.println("triangulo EQUILATERO");
			}else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)){
				System.out.println("triangulo ISOCELES");
			}else{
				System.out.println("triangulo ESCALENO");
			}
		}else{
			System.out.println("os 3 lados nao formam um triangulo");
		}
	}

}
