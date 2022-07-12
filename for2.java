package julia;

import java.util.Scanner;

public class for2 {

	public static void main(String[] args) {
		 Scanner Sc = new Scanner(System.in);
		 
		 int player, age, height, weight, totalH, totalW, amt, amt2;
		 
		 amt = 0; 
		 amt2 = 0;
		 totalH = 0;
		 totalW = 0;
		 
		 for (player = 1; player <= 2; player++) {
			 
			 System.out.println("Insira a idade em anos: ");
			 age = Sc.nextInt();
			 
			 if (age < 18) {
				
				 amt += 1;
			 }

			 System.out.println("Insira a altura em centímetros: ");
			 height = Sc.nextInt();
			 
			 totalH += height; 
			 
			 System.out.println("Insira o peso em quilos: ");
			 weight = Sc.nextInt();
			 
			 totalW += weight;
			 
			 if (weight > 80) {
				 
				 amt2 += 1;
				 
			 }
			 
		 }
		 
		 int percentage = amt2 * 100 / 2;
		 
		 double mediaH = totalH / 2;
		 
		 double mediaW = totalW / 2;
		 
		 System.out.println("Quantidade de jogadores com menos de 18 anos: " + amt
				 			+ "\nMédia da altura dos jogadores: " + mediaH
				 			+ "\nMédia do peso dos jogadores: " + mediaW
				 			+ "\nPorcentagem de jogadores com mais de 80 kg: " + percentage + "%");
		 
		 Sc.close();
		 
	}
	
}
