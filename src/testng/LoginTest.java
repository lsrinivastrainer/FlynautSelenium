package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	
	@Test
	void testTitle() {

	String exp_title="Opencart";
	String act_title="Opencarting";

	
	
	Assert.assertEquals(exp_title, act_title);

	System.out.println("test passed");

	System.out.println("test passed");

	System.out.println("test passed");
	
	
	/*
		if(exp_title.equals(act_title)) {
	
		System.out.println("test passed");
		Assert.assertTrue(true);
		}

		else {
	
		System.out.println("test failed");
		Assert.assertTrue(false);
	
		}*/

}
}
