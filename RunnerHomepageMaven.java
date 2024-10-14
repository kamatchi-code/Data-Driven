package runneritlearnMaven.org;

// MavenFramework 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.com.Base_Demo;
import pomitlearn.demo.Coursesmousehover_POM;
import pomitlearn.demo.Logout_POM;
import pomitlearn.demo.Signin_POM;
import pomitlearn.demo.SocialMedia_POM;
import pomitlearn.demo.SoftwareTestingAcademy_POM;
import pomitlearn.demo.Subscribe_POM;

public class RunnerHomepageMaven extends Base_Demo {
	
	public static WebDriver driver=BrowserLaunch();
	
	// Functional Testing Validation & Verification-User Authentication and Authorization and Logout
	// GUI Testing
	// Integration Testing-Using Action class (without using keyboard and mouse)
	// subscription module to test Email Notifications
	//  Social Media Link Testing to check the Link Validation Testing
	// Performance Testing
	
	
	public static void main(String[] args) throws InterruptedException {
		Signin_POM sp= new Signin_POM(driver);//Parameterized Constructor
		Coursesmousehover_POM cm=new Coursesmousehover_POM(driver);
		SoftwareTestingAcademy_POM st = new SoftwareTestingAcademy_POM(driver);
		
		//Sign in module-Functional Testing
		
		Url("https://www.itlearn360.com/");
		Click(sp.getSign());
		Sendkeys(sp.getUser(),"KAMATCHI11");
		Sendkeys(sp.getPass(),"KAMATCHI456$");
		Click(sp.getLogin());
		
		//all courses module using Action - Integration Testing & GUI Testing
		
		Click(cm.getAllCourses());
		Thread.sleep(2000);
		Action(cm.getCloud());
		Thread.sleep(2000);
		Action(cm.getDevops());
		Thread.sleep(2000);
		Action(cm.getSTesting());
		Thread.sleep(2000);
		Action(st.getMasteringSelenium());
		Thread.sleep(2000);
		Action(st.getMasteringManual());
		Thread.sleep(2000);
		Action(st.getAutomationTestNg());
		Thread.sleep(2000);
		Action(st.getGit());
		Thread.sleep(2000);
		Action(st.getDatabase());
		Thread.sleep(2000);
		Action(st.getAgile());
		ImplicitWait();
		Action(st.getMST());
		ImplicitWait();
		Action(st.getMMT());
		ImplicitWait();
		Action(st.getMAT());
		ImplicitWait();
		Action(st.getSDET());
		
		// Javascript Executor
		
		//Scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(3000);
		
		//subscribe module - test Email Notifications
		
		Subscribe_POM sbc =new Subscribe_POM(driver);
		Sendkeys(sbc.getEmail(), "Test@gmail.com");
		Click(sbc.getSubCrib());
		Thread.sleep(5000);
		
		
		//Social Media module - Link Validation Testing
		
		SocialMedia_POM sm =new SocialMedia_POM(driver);
		Click(sm.getFb());
		driver.navigate().back();
		
		Thread.sleep(2000);
		Click(sm.getYoutube());
		driver.navigate().back();
		
		Thread.sleep(2000);
		Click(sm.getLinkedIN());
		driver.navigate().back();
		
		Thread.sleep(2000);
		Click(sm.getInstagram());
		driver.navigate().back();
		
		Thread.sleep(2000);
		Click(sm.getMedium());
		driver.navigate().back();
		
		//Home Scroll up  Javascript Executor
		
		WebElement element2 = driver.findElement(By.xpath("//h2[text()='Home']"));
		element2.click();
		Thread.sleep(3000);
		
		 
		// Logout Module- Functional Testing
		
	    Thread.sleep(2000);	    	    		
		Logout_POM lp= new Logout_POM(driver);
		Click(lp.getLogout());
		
		driver.quit();
	
		
	}
	
	

}
