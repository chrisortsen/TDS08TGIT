package ativ_fix_hashmap__loadfactor_ChristianoCorrea;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		HashMap<String,Integer> Cadastro = new HashMap<String,Integer>();
		Scanner scan = new Scanner(System.in);
		
		//Cadastro dados
		
		int QtdInicial = 16;
		for(int i=0; i<QtdInicial; i++) {
			System.out.println("Insira o login e a senha do "+(i+1)+"º cadastro:");
			Cadastro.put(scan.next(), scan.nextInt());
			
			double loadFactor = 0.75;
			double QtdAumentada = QtdInicial*loadFactor;
			QtdInicial = (int)QtdAumentada;
			
			System.out.println("Deseja parar o cadastro?(1=SIM/2=NÃO)");
			int decisao = scan.nextInt();
			if(decisao == 1) {
				i = QtdInicial;
			}
		}
		
		//Exibição dados
		
		System.out.println("");
		System.out.println("Cadastros realizados com sucesso");
		for(String i : Cadastro.keySet()) {
			System.out.println(i+", "+Cadastro.get(i));
		}
	}

}