package ativ_fix_01_autotest_ChristianoCorrea;

import junit.framework.TestCase;

public class TesteJUnitTest extends TestCase {
	
	public void testExecutableTesteJUnit() {
		String StringEsperada = "Hello, World!";
		
		String StringRetorno = "HelloWorld.say()";
		
		assertEquals(StringEsperada, StringRetorno);
	}

}
