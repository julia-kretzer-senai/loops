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
            
        	System.out.println("Insira o sal�rio m�nimo: ");
        	double minSal = Sc.nextDouble();
        	
            for (int emp = 1; emp <= 2; emp++) {
    
                double sal;
                
            	System.out.println("Insira o n�mero do oper�rio: ");
            	int num = Sc.nextInt();
            	
            	System.out.println("Insira o n�mero de pe�as fabricadas pelo oper�rio no m�s: ");
            	int pieces = Sc.nextInt();
            	
            	System.out.println("Insira o sexo do oper�rio: \n1- Feminino\n2- Masculino");
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
            	 
            	 System.out.println("N�mero do funcion�rio: " + num + "\nSal�rio: " + sal);
            	 
            	
            }
            
            mediaPiecesF = piecesF / totalF;
       	 	mediaPiecesM = piecesM / totalM;
       	 
            
            System.out.println("Total da folha: R$" + totalSal + "\nTotal de pe�as: " + totalP + "\nM�dia de pe�as por homem: "
            					+ mediaPiecesM + "\nM�dia de pe�as por mulher: " + mediaPiecesF + "\nMaior sal�rio: " + topSal);
            
            Sc.close();
        
        }

    }