package bHighlevelbases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class B13_Assert_Verify {
	
	public WebDriver driver;
	
  @Test
  public void funoperation() {
	  
	  String Actualvalue = "$3";
	  String Expectedvalue = driver.findElement(By.xpath("//b[normalize-space()='$398']")).getText();
	  System.out.println(Expectedvalue);
	 
	  try {
		
		  //statement 1
		  System.out.println("Assertion starts here");
		  
		  //statement 2
		  Assert.assertEquals(Actualvalue, Expectedvalue);
		  
		 	} 
	  finally {
		 		 //statement 3
				  System.out.println("Apple");
				  
				  //statement 4
				  System.out.println("A blog for software testers");
				  
	  }

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
