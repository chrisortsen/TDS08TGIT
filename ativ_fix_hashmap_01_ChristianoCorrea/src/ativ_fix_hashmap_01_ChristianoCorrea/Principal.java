package ativ_fix_hashmap_01_ChristianoCorrea;

import java.util.HashMap;


public class Principal {
	public static void main(String[] args) {
		
		HashMap<String,String> roupas = new HashMap<String,String>();
		
		roupas.put("Camisa", "Preta");
		roupas.put("Calça", "Azul");
		roupas.put("Bermuda", "Laranja");
		roupas.put("Boné", "Vermelho");

		// Get()
		roupas.get("Camisa");

	
		// Remove()
		roupas.remove("Bermuda");

			
				
		// Tamanho HashMap = Size()
		System.out.println("Numero de valores no hashmap : " + roupas.size());
		
				
		// Imprimindo chaves - key.Set()
		System.out.println();
		System.out.println("Chaves: ");
		for(String i : roupas.keySet()) {
			System.out.println(i);
		}
				
		// Imprimir valores values()
		System.out.println();
		System.out.println("Valores: ");
		for(String i : roupas.values()) {
			System.out.println(i);
		}
		
		// Imprimindo chaves e Valores
		System.out.println();
		System.out.println("Chaves e Valores: ");
		for (String i : roupas.keySet()){
			System.out.println("Chaves: " + i + " / Valores: " + roupas.get(i));
		}		
		
		// Limpeza de dados - Clear()
		System.out.println();
		roupas.clear();
	}
}
