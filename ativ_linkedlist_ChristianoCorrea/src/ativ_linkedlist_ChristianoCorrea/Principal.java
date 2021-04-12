package ativ_linkedlist_ChristianoCorrea;

import java.util.Arrays;
import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
	
		LinkedList<String>carros = new LinkedList<String>();
		
		// Inserindo valores
		carros.add("Volkwagem");
		carros.add("Toyota");
		carros.add("Ford");
		carros.add("Honda");
		carros.addFirst("Porsche");
		
		System.out.println("Imprimindo lista: "); 	
		System.out.println(Arrays.toString(carros.toArray()));
		
		
		System.out.println(); 
		System.out.println("Inserindo 'Fiat' na primeira posicao da lista:  "); 	
		carros.addFirst("Fiat"); 
		
		System.out.println(); 
		System.out.println("Inserindo 'Ferrari' na primeira posicao da lista:  "); 	
		carros.addLast("Ferrari");
		
		System.out.println(); 
		System.out.println("Imprimindo lista com alterações: "); 	
		System.out.println(Arrays.toString(carros.toArray()));		
		
		System.out.println(); 
		System.out.println("Removendo item na primeira posicão: "); 	
		carros.removeFirst();
		
		System.out.println(); 
		System.out.println("Removendo item da ultima posição da lista: "); 	
		carros.removeLast(); 
		
		System.out.println(); 
		System.out.println("Imprimindo lista: "); 	
		System.out.println(Arrays.toString(carros.toArray()));
		
		System.out.println(); 
		System.out.println("Imprimindo somente o primeiro valor da lista: "); 	
		System.out.println(carros.getFirst()); 
		
		System.out.println(); 
		System.out.println("Imprimindo somente o ultimo valor da lista: "); 	
		System.out.println(carros.getLast()); 

	}

}
