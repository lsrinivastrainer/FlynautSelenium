package testng;

import org.testng.annotations.*;

public class AnnotatinsEx1 {
	@BeforeMethod
	void login()
	{ System.out.println("This is login .. "); 	}

	@Test (priority=1)
	void search()
	{ System.out.println("this is search ... "); 	}

	@Test (priority=2)
	void advacedsearch(){
		System.out.println("this advanced search .... "); 	}

	@AfterMethod
	void logout1(){
		System.out.println("this is logout ... "); 	}
	
	@BeforeClass
	void login1()
	{ System.out.println("This is before the class .. "); 	}
	
	
	@AfterClass
	void logout(){
	System.out.println("this is after the class ... "); 	}

	
}
