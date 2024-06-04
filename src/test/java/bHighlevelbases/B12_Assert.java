package bHighlevelbases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class B12_Assert {
	
	public WebDriver driver;
	
	
  @Test
  public void funoperation() {
	  
	  //Correct title is "Welcome: Mercury Tours"
	  
	  //We taking title as "Mercury Tours" to make the test fail
	  
	  
		
		  String Actualtitle = "Mercury Tours";
		  String Expectedtitle = driver.getTitle(); 
		  System.out.println(Expectedtitle);
			/*
			 * String Actualtitle = "Register"; String Expectedtitle =
			 * driver.findElement(By.linkText("SIGN-ON")).getText();
			 * System.out.println(Expectedtitle);
			 * 
			 */
	  //1st statement
	  System.out.println("Welcome to Selenium");
	  
	  //2nd statement
	  Assert.assertEquals(Actualtitle, Expectedtitle);
	  
	  //3rd statement
	  System.out.println("Assertion starts here...");
	  
	  //4th statement
	  System.out.println("A blog for software Testers");
	  
	  driver.quit();
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
