package ativ_fix_arrays_01_e_02_ChristianoCorrea;

import java.util.Scanner;

public class Arrays01 {
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] temperatura = new int[30];
		
		for(int i = 0; i < temperatura.length; i++) {
			System.out.println("Informe a temperatura do " + (i+1) + " dia: ");
			temperatura[i] = scan.nextInt();
		}
		
		int soma = 0;
		int media = 0;
		
		
		for(int i = 0; i< temperatura.length; i++) {
			soma = soma + temperatura[i]; 		
		}
		media = soma / temperatura.length; 
		
		System.out.println("A média da temperatura do mês é igual a: " + media);
	}

}
