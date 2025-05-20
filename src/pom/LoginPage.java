package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
	//Constructor
	WebDriver driver;
	
	LoginPage(WebDriver driver){
		this.driver=driver;		
	}
	
	//locators
	
	By txt_username_loc=By.xpath("//input[@placeholder='Username']");
	By txt_password_loc=By.xpath("//input[@placeholder='Password']");
	By btn_login_loc=By.xpath("//button[normalize-space()='Login']");


	//actionMethods
	
	public void setUserName(String username) {
		driver.findElement(txt_username_loc).sendKeys(username);
	}

	public void setPassword(String pwd) {
	driver.findElement(txt_password_loc).sendKeys(pwd);
	}
	
	public void clickLogin() {
	driver.findElement(btn_login_loc).click();
	}


}
