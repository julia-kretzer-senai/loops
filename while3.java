package julia;

import java.util.Scanner;

public class while3 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        int num, i =0, par=0, mediaPar = 0, soma = 0;
    
        int numMaior = 0;
        int numMenor = 0;

        do {
            System.out.println("Informe um n�mero: ");
            num = Sc.nextInt();
            
            soma = soma + num;
            i = i + 1;
            
            if (num % 2 == 0) {
                mediaPar = mediaPar +num;
                par++;
            }
            
            if (num < numMenor && num != 0) {
                numMenor = num;
            }
            
            if (num > numMaior) {
                numMaior = num;
            }
            
            if (num == 0) {
                i--;
                par--;
            }
            
        } while (num < 30.000);
        
        int media = soma / i;
        mediaPar = mediaPar / par;
        
        System.out.println("Soma: " + soma + "\nQuantidade de n�meros digitados: " + i + "\nMaior n�mero digitado: " + numMaior + "\nMenor n�mero digitado: " + numMenor + "\nM�dia dos n�meros pares: " + media);
        
        Sc.close();
    }

}