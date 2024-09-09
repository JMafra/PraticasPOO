import java.util.Scanner;

public class Exemplo6 {
	
	public void maiorDeCinco() {
		
		int numero, cont, maior=0;
	
		Scanner input = new Scanner(System.in);	
		
		for (cont = 1; cont <= 5; cont++) {
			System.out.print("Digite um número:");
			numero = input.nextInt();	
			
			if (cont == 1) {
				maior = numero;
			}else {
				if (numero > maior) {
					maior = numero;
				}
			}		
		}
		
		System.out.println("Maior:" + maior);
		
	}
	

}
