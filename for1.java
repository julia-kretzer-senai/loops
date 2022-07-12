package julia;

import java.util.Scanner;

public class for1 {
	
	 public static void main(String[] args) {

			Scanner Sc = new Scanner(System.in);
			
			System.out.println("Insira um número: ");
			int num = Sc.nextInt();
			
			for (int i = 1; i <= 10; i++) {
				int tabuada = num * i;
				System.out.println(num + " x " + i + " = " + tabuada);
			}
			
			Sc.close();
			
	 }
}
