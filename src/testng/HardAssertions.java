package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test() {
		
	//Assert.assertEquals("xyz","xyzd");
	
	//Assert.assertNotEquals(123,1234); 
	
		
		//Assert.assertTrue(false); 
		
		
		//Assert.assertFalse(1 == 1); 
		
		Assert.fail();
		
		System.out.println("Thi is FTRE THE ASSERT");
		
	}
}
