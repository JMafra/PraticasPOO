import java.util.Scanner;

public class Exemplo3 {	   
	  
	public void verificarMaiorDeTres() {
		 int num1,num2,num3;
		
		  Scanner input = new Scanner(System.in);
		  System.out.print("Digite o primeiro numero:");
		  num1 = input.nextInt();
		  
		  System.out.print("Digite o segundo numero:");
		  num2 = input.nextInt();  
		 		  
		  System.out.print("Digite o terceiro numero:");
		  num3 = input.nextInt(); 
		  
		  if ((num1 > num2) && (num1 > num3)) {
			  System.out.println("Maior:" + num1);
		  }else {
			  if (num2 > num3) {
				  System.out.println("Maior:" + num2); 
			  }else {
				  System.out.println("Maior:" + num3); 
			  }		
		  }
	}
	
}
