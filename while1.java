package julia;

import java.util.Scanner;

public class while1 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        int i = 1;
        
        System.out.println("Informe o salário do Carlos: ");
        double salCarlos = Sc.nextDouble();
        
        double salJoao = salCarlos/3;
        
        System.out.println("Salário do João é igual a: " + salJoao);
        
        double rendCarlos = (salCarlos*0.02+salCarlos);
        double rendJoao =(salJoao*0.05+salJoao);
        
    
        while (rendJoao<rendCarlos) {
            rendJoao =(rendJoao*0.05+rendJoao);
            rendCarlos = (rendCarlos*0.02+rendCarlos);
            i++;
        }
        
        System.out.println("Meses: " + i);
        
        Sc.close();
    }

}