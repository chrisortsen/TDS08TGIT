package ativ_fix_hashmap_02_ChristianoCorrea;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		HashMap<String,Integer> Cadastro = new HashMap<String,Integer>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira quantos usuários deseja cadastrar:");
		int Qtd = scan.nextInt();
		
		for(int i=0; i<Qtd; i++) {
			System.out.println("Insira o login e a senha da "+(i+1)+"º pessoa a ser cadastrada:");
			Cadastro.put(scan.next(), scan.nextInt());
		}
		
		System.out.println("");
		
		System.out.println("Insira o seu login:");
		String Login = scan.next();
		System.out.println("Insira a sua senha:");
		int Senha = scan.nextInt();
		if(Cadastro.containsKey(Login) && Cadastro.containsValue(Senha)) {
			System.out.println("Acesso permitido!");
		}else {
				System.out.println("Acesso negado!");
		}	
	}
}