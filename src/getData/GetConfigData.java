package getData;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class GetConfigData {
   @Test
  
  public void printValues(){
	  
	   Properties pro= new Properties();
	   InputStream input;
	   try { 
		   input = new FileInputStream("C:\\Users\\User\\Desktop\\Nahla_automation\\vjezba\\TestNG\\config\\conf.properties");   
	       pro.load(input);
	   } catch (Exception e) {  
		   e.printStackTrace();
	   }
	  String user= pro.getProperty("username");
	  System.out.println("Print username: " + user); 
	  String pass =pro.getProperty("password");
	  System.out.println("Print password: " + pass);
	  String url= pro.getProperty("url");
	  System.out.println("Print Url: " + url); 
  }
}
