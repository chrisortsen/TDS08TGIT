package ativ_fix_arrays_01_e_02_ChristianoCorrea;

import java.util.Scanner;

public class Arrays02 {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);

	 int[] elemento = new int[10];
	 

			for(int i = 0; i < elemento.length; i++) {
				System.out.println("Informe o " + (i + 1) + " numero inteiro: ");
				elemento[i] = scan.nextInt();
			}	
			
            System.out.println();
            System.out.println("Rela��o de todos os divisores do respectivo elemento: ");

	        for (int i = 0; i < elemento.length; i++) {
	            System.out.println();
	            System.out.println("N�meros divisores de " + elemento[i] + ": ");
	            for (int j = 1; j <= elemento[i]; j++) {
	                if (elemento[i] % j == 0) {
	                    System.out.println(j);
	                }
	            }
	        }
	}

}
