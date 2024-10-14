package runneritlearnMaven.org;

	// Maven Framework
	

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import base.com.Base_Demo;
import pomitlearn.demo.Header_POM;
import pomitlearn.demo.Logout_POM;
import pomitlearn.demo.Signin_POM;

public class RunnerHeader2DataDriven extends Base_Demo {
	
	public static WebDriver driver=BrowserLaunch();
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
			
		// Concept used is Data Driven Test to read data i.e fetch the user and password from external File 
		
		Signin_POM sp= new Signin_POM(driver);//Parameterized Constructor
		
		Url("https://www.itlearn360.com/");
		Click(sp.getSign());
		Sendkeys(sp.getUser(),readValueFromExcel(0, 1));
		Sendkeys(sp.getPass(),readValueFromExcel(0, 2));
		Click(sp.getLogin());
		
		// write data to destination to external file
		
		String title = driver.getTitle();
		WriteValueInExcel(5, 2, title);
		
		Header_POM hp = new Header_POM(driver);
		Thread.sleep(2000);
		Click(hp.getBlog());
		
		 Thread.sleep(2000);
		 Click(hp.getEvents());
	    
	    Thread.sleep(2000);
	    Click(hp.getContact());
	    
	    Thread.sleep(2000);
	    Click(hp.getDashboard());
	    
	    Thread.sleep(2000);	    	    		
		Logout_POM lp= new Logout_POM(driver);
		Click(lp.getLogout());
		
		driver.quit();
		
		
		
		
	}
}
