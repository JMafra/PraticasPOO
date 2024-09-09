import java.util.Scanner;

public class Exemplo4 {
	public void converteMesExtenso(int mes) {		

		Scanner input = new Scanner(System.in);
		System.out.print("Digite um mês (1-12):");
		mes = input.nextInt();

		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		default:
			System.out.println("Mês inválido");
		}
	}
}
