package julia;

import java.util.Scanner;

public class while4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salarioMinimo;
        double quilowatts;
        
        System.out.println("Tipo   | % DE ACRÉSCIMO SOBRE O VALOR GASTO\n1      |               5%\n2      |              10%\n3      |              15%");

            System.out.println("Digite o salario:");
            salarioMinimo = sc.nextInt();
            
            quilowatts = salarioMinimo/8;
            
            System.out.println("O valor do quilowatt:R$"+quilowatts);
            
            double residencial = salarioMinimo*0.05;
            System.out.println("O valor de acrescimo e:R$"+residencial);
            
            double comercial = salarioMinimo*0.10;
            System.out.println("O valor de acrescimo do comercial é:R$"+comercial);
            
            double industrial = salarioMinimo*0.15;
            System.out.println("O valor de acrescimo do industrial é:R$"+industrial);
            
            double fatGeral = residencial + comercial + industrial;
            System.out.println("Faturamento geral da empresa:R$"+fatGeral);
            
            sc.close();
    }

}