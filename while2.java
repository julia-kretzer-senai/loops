package julia;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		
	Scanner Sc = new Scanner(System.in);
	
	double num;
	
	System.out.println("Insira um n�mero: ");
	num = Sc.nextInt();
	
	while (num > 0) {
		
		System.out.println("\nN�mero: " + num + "\nQuadrado: " + Math.pow(num, 2) + "\nCubo: " + Math.pow(num, 3) + 
				"\nRaiz quadrada: " + Math.sqrt(num) + "\nInsira outro n�mero ou encerre com um valor menor ou igual a 0: ");
		num = Sc.nextInt();
	}
	
	Sc.close();
	}
	
	}