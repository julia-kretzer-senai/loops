package julia;

import java.util.Scanner;

public class doWhile1 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Insira o n�mero: ");
		int num = Sc.nextInt();
		
		int j = 2;
		
			do {
				
			int prime = num % j;
			
			int last = num - 1;
			
			if (prime == 0) {
				System.out.println("N�mero n�o primo");
				break;
				
			} else if (last % j != 0 || num == 3) {
				System.out.println("N�mero primo");
				break;
			} 
			
			j++;
			
		} while (j < num);	
		
		 Sc.close();
		 
	}

}
