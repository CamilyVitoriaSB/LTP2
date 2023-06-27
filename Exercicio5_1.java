import java.util.*;
public class Exercicio5_1 {

	public static void main(String[] args) {
		
		String dataHoje, dataNasc;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a data de Nascimento: ");
		dataNasc = leia.next();
		
		System.out.println("Digite a data de Hoje: ");
		dataHoje = leia.next();
		
		System.out.println("Idade: " + calcularIdade(dataHoje, dataNasc) );

	}

	public static int calcularIdade (String dtHoje, String dtNasc) {
		int diaHoje, mesHoje, anoHoje;
		int diaNasc, mesNasc, anoNasc;
		int idade;	
		
		diaHoje = Integer.parseInt(dtHoje.substring(0,2));
		mesHoje = Integer.parseInt(dtHoje.substring(3,5));
		anoHoje = Integer.parseInt(dtHoje.substring(6));
		
		diaNasc = Integer.parseInt(dtNasc.substring(0,2));
		mesNasc = Integer.parseInt(dtNasc.substring(3,5));
		anoNasc = Integer.parseInt(dtNasc.substring(6));
		
		idade = anoHoje - anoNasc;
		
		if (mesHoje < mesNasc || mesHoje == mesNasc && diaNasc > diaHoje) {
			idade --;
		}
		
		return idade;
		
	}
}
