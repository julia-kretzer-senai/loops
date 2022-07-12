package julia;

import java.util.Scanner;

public class doWhile2 {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);

		int city = 1;
		int highest = 0;
		int highestCode = 0;
		int smallCity = 0;
		
		System.out.println("Insira o c�digo da cidade: ");
		int lowestCode = Sc.nextInt();
		
		System.out.println("Insira o n�mero de carros de passeio: ");
		int cars = Sc.nextInt();
		
		System.out.println("Insira o n�mero de acidentes: ");
		int lowest = Sc.nextInt();	
		
		int totalCars = cars;
		int totalSmallAcc = 0;
		
		if (cars < 2000) {
			smallCity = 1;
			totalSmallAcc = lowest;
		}
			
		
		do {
			
			System.out.println("Insira o c�digo da cidade: ");
			int newCode = Sc.nextInt();
			
			System.out.println("Insira o n�mero de carros de passeio: ");
			int newCars = Sc.nextInt();
			
			System.out.println("Insira o n�mero de acidentes: ");
			int acc = Sc.nextInt();	
			
			if (acc < lowest) {
				lowest = acc;
				lowestCode = newCode;
			}
			
			if (acc > highest) {
				highest = acc;
				highestCode = newCode;
			}
			
			if (newCars < 2000) {
				smallCity += 1;
				totalSmallAcc += acc;
			}
			
			totalCars += newCars;
			
			city++;
			
		} while (city < 5);
		
		double media = totalCars / 5;
		
		double smallMedia = totalSmallAcc/smallCity;
		
		System.out.println("Menor �nidice: Cidade " + lowestCode + " - " + lowest + " acidentes"
							+ "\nMaior �ndice: Cidade " + highestCode + " - " + highest + " acidentes"
							+ "\nM�dia de carros: " + media
							+ "\nM�dia de acidesntes nas cidades com menos de 2000 carros: " + smallMedia);
	
		Sc.close();
	
	}

}
