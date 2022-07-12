package julia;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		
	Scanner Sc = new Scanner(System.in);
	
	double num;
	
	System.out.println("Insira um número: ");
	num = Sc.nextInt();
	
	while (num > 0) {
		
		System.out.println("\nNúmero: " + num + "\nQuadrado: " + Math.pow(num, 2) + "\nCubo: " + Math.pow(num, 3) + 
				"\nRaiz quadrada: " + Math.sqrt(num) + "\nInsira outro número ou encerre com um valor menor ou igual a 0: ");
		num = Sc.nextInt();
	}
	
	Sc.close();
	}
	
	}