package HelloWorld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {

	String message= "HelloWorld";
	
	DemoClass msg= new DemoClass();
	
	@Test
	public void testMethod()
	{
		assertEquals(message,msg.printMessage());
	}
}
