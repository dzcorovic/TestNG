package login;

import org.testng.annotations.Test;

public class LoginNormalTest {
     
	@Test(groups = {"smoke"})
	 public void logIn() { 
		 
		 System.out.println("Log In method - class Normal");
	 }
	
	@Test
	 public void getUrl() { 
		 
		 System.out.println("Get Url method - class Normal");
		 
	 }
	@Test(groups = {"smoke"})
	public void clickButton() { 
		 
		 System.out.println("clickButton method - class Normal");
	 }
}
