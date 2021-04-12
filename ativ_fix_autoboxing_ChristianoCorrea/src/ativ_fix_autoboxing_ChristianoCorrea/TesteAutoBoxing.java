package ativ_fix_autoboxing_ChristianoCorrea;

public class TesteAutoBoxing {

	public static void main(String[] args) {
		//DADOS PRIMITIVOS
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 1001;
		float num5 = 3.5f;
		double num6 = 3.5555;
		boolean flag = true;
		char a = 'a';
		
		//conversao dados primitivos para objetos
		/* Short num7 = new Short((short)1);
		Byte num8 = new Byte ((byte)10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(1001);
		Float num11 = new Float(3.5f);
		Double num12 = new Double (3.5555);
		Boolean flag2 = new Boolean (true);
		Character b = new Character ('b'); */
				
		//AutoBoxing
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 =  10001;
		Float num11 = 3.5f;
		Double num12 =  3.5555;
		Boolean flag2 = true;
		Character b = 'b';
				
		//Auto unboxing
		int num13 = num9;
				
		System.out.println(num13);
				
		//Auto unboxing em expressoes
		num9++;
		System.out.println(num9);
				
		//Auto unboxing num9 -> Auto Boxing num14
		Integer num14 = num13/num9;
				
		System.out.println(num14);				

	}

}
