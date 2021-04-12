package toUpperCasetoLowerCase;

public class UpperLowerCase{

	public static void main(String[] args){
		String txt = new String("eu estou estudando muito");
		
		String upper = txt.toUpperCase(); //armazenando em outra variavel
		String lower = txt.toLowerCase();
		
		System.out.println("Texto normal: " + txt);
		System.out.println("Texto em Upper Case: " + upper);
		System.out.println("Texto em Lower Case: " + lower);
		
		//ou
		
		//utilizando somente uma variavel
		
		System.out.println("Texto normal: " + txt);
		System.out.println("Texto em Lower Case: " + txt.toUpperCase());
		System.out.println("Texto em Lower Case: " + txt.toLowerCase());		
	}
}	