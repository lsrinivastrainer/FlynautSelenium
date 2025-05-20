package testng;

import org.testng.annotations.Test;

public class FirstTestCase {
	/*
	1) Open app
	2) Login
	3) Logout
	*/
	

	@Test(priority=1)
		void logout(){
		System.out.println("Logout from application ..... ");
		}
	
	@Test(priority=14)
		void openapp(){
		System.out.println("opening application ... ");
		}
	
	@Test(priority=2)
		void login(){
		System.out.println("Login to application ..... ");
		}
	

}
