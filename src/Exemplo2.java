import java.util.Scanner;

public class Exemplo2 {	   
	  
	public void exibeNomeCompleto() {
		String nome, sobrenome;
		
		  Scanner input = new Scanner(System.in);
		  System.out.print("Digite o seu nome:");
		  nome = input.next();
		  
		  System.out.print("Digite o seu sobrenome:");
		  sobrenome = input.next();  
		  
		  System.out.print("Nome Completo:" + nome + " " + sobrenome);		 	  
		  
	}
	
}
