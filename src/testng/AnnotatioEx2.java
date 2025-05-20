package testng;
import org.testng.annotations.*;
public class AnnotatioEx2 {

	@BeforeClass
	void login()
	{ System.out.println("This is before the class .. "); 	}

	@Test
	void search()
	{ System.out.println("this is search ... "); 	}

	@Test
	void advacedsearch(){
	System.out.println("this advanced search .... "); 	}

	@AfterClass
	void logout1()
	{ System.out.println("This is before the class .. "); 	}

}
