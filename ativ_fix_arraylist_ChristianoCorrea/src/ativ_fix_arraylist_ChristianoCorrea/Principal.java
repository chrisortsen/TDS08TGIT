package ativ_fix_arraylist_ChristianoCorrea;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<String> tds08 = new ArrayList<String>();
		
		
		tds08.add("André");
		tds08.add("Samuel");
		tds08.add("Christiano");
		tds08.add("Lucas");
		tds08.add("Daniel");
		tds08.add("Carlos");
		tds08.add("Thiago");
		tds08.add("Bárbara");
		tds08.add("João Marcos");
		tds08.add("Phillipe");
		tds08.add("Lucas");
		tds08.add("João Paulo");
		tds08.add("Yan");		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Listando todos alunos TDS08:");
		System.out.println("");	
		
		for (int i = 0; i < tds08.size(); i ++) {
			System.out.println(tds08.get(i));
		}
			
		System.out.println();
		System.out.println("Adicionar aluno a TDS08. Insira o nome do novo Aluno: ");
		String aluno = scan.nextLine();
		tds08.add(aluno);	
		
		
		System.out.println("Quantidade de Alunos na turma TDS08: ");
		System.out.println(tds08.size());
		
		System.out.println("Buscar aluno na TDS08: ");
		String achado = scan.next();
		if(tds08.contains(achado)) {
		    System.out.println(achado + " está na turma TDS08");
		}
		else {
		    System.out.println(achado + " não está na turma TDS08");
		}		
		
	}

}
