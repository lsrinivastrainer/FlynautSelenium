package grouping;

import org.testng.annotations.Test;

public class PaymentTests {
	
	
	@Test(priority=1, groups= {"regression", "sanity","functional"})
	void paymentinRupees() {
	
		System.out.println("payment in rupees .... ");
	
	}
	
	@Test(priority=2, groups= {"regression", "sanity","functional"})
	void paymentinDollars() {
	
		System.out.println("payment in dollars .... ");
	
	}

	
}
