package julia;

import java.util.Scanner;

    public class for3 {
 
        public static void main(String[] args) {
            Scanner Sc = new Scanner(System.in);
            
            int totalF, totalM, totalP, piecesF, piecesM, mediaPiecesF, mediaPiecesM, totalSal, topSal;
            
            totalF = 0;
        	totalM = 0;
        	totalP = 0;
        	piecesF = 0;
        	piecesM = 0;
        	topSal = 0;
            totalSal = 0;
            mediaPiecesF = 0;
            mediaPiecesM = 0;
            
        	System.out.println("Insira o salário mínimo: ");
        	double minSal = Sc.nextDouble();
        	
            for (int emp = 1; emp <= 2; emp++) {
    
                double sal;
                
            	System.out.println("Insira o número do operário: ");
            	int num = Sc.nextInt();
            	
            	System.out.println("Insira o número de peças fabricadas pelo operário no mês: ");
            	int pieces = Sc.nextInt();
            	
            	System.out.println("Insira o sexo do operário: \n1- Feminino\n2- Masculino");
            	int sex = Sc.nextInt();
            	
            	if (sex == 1) {
            		
            		totalF += 1;
            		piecesF += pieces;
            		
            	} else {
            		
            		totalM += 1;
            		piecesM += pieces;
            		
            	}
            	
            	if (pieces <= 30) {
            		
            		sal = minSal;
            		
            	} else if (pieces > 30 && pieces <= 50) {
            		
            		sal = minSal + minSal*0.03*pieces;
            		
            	} else {
            		
            		sal = minSal + minSal*0.05*pieces;
            		
            	}
            	
            	
            	
            	if (sal > topSal) {
            		topSal = num;
            	}
            	
            	 totalSal += sal;
            	 totalP += pieces;
            	 
            	 System.out.println("Número do funcionário: " + num + "\nSalário: " + sal);
            	 
            	
            }
            
            mediaPiecesF = piecesF / totalF;
       	 	mediaPiecesM = piecesM / totalM;
       	 
            
            System.out.println("Total da folha: R$" + totalSal + "\nTotal de peças: " + totalP + "\nMédia de peças por homem: "
            					+ mediaPiecesM + "\nMédia de peças por mulher: " + mediaPiecesF + "\nMaior salário: " + topSal);
            
            Sc.close();
        
        }

    }