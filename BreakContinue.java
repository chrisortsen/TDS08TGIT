package Test01;
import java.util.Scanner;

public class BreakContinue{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//faz leitura do teclado
		
		System.out.println("Entre com um número!");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite!");
		int max = scan.nextInt();
		
		for(int i = num; i<=max; 1++){
			if(i % 7 == 0){
				System.out.println("O valor de i é: " +i);
				break;
	}
}