package ativ_fix_intro_java_01_ChristianoCorreaOrtsen;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//QUESTAO 1
        System.out.println("QUEST�O 1");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.print("Por favor, insira o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Aplicando Orienta��o a objetos no Java");
        System.out.println("Meu nome � " + nome);
        
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("");
		
		//QUESTAO 2
        System.out.println("QUEST�O 2");
        System.out.println("");
        System.out.println("Todos os n�meros de 150 a 250:");
        for(int i = 150; i <= 250; i++) {
            System.out.println(i);
        }
        
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("");        
		
		//QUESTAO 3
        System.out.println("QUEST�O 3");
        System.out.println("");
        System.out.println("Soma de 1 at� 1000:");
        
        int a = 0;

        for(int i = 0; i <= 1000; i++) {
            a += i;
        }
        
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("");
        
		//QUESTAO 4 
        System.out.println("QUEST�O 4");
        System.out.println("");
        System.out.println("Todos os m�ltiplos de 3, entre 1 e 100:");
        for(int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("");
		
		//QUESTAO 5
        System.out.println("QUEST�O 5");
        System.out.println("");
        System.out.println("Todos os n�meros entre 1 e 100, dizendo se � ou nao multiplo de 3:");
		
        for(int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " � m�ltiplo de 3");
            } else {
                System.out.println(i + " n�o � m�ltiplo de 3");
            }
        }
        
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("");
		
		//QUESTAO 6
        System.out.println("QUEST�O 6");
        System.out.println("");
        System.out.println("Todos os multiplos de 3 e 5, entre 1 e 100:");
        
        for(int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
	}

}
