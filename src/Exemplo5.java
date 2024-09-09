import java.util.Scanner;

public class Exemplo5 {
	
	public void converteMesExtenso() {
		int mes = 0;		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um mes (1-12):");
		mes = input.nextInt();
		
		switch (mes) {
			case 1: System.out.println("Janeiro");
			        break;
			case 2: System.out.println("Feveiro");
	        		break;
			case 3: System.out.println("Marco");
    				break;    	
			case 4: System.out.println("Abril");
    				break;
			case 5: System.out.println("Maio");
    				break;	
    		default: System.out.println("Mês Invalido!");
    			
		}	
		
	}
	

}
