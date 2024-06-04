package aQA_Class;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A6_FirstSelectedOption {
	
	public WebDriver driver;
  @Test
  public void options() {
	  
	 WebElement ele = new Select(driver.findElement(By.id("day"))).getFirstSelectedOption();
	 System.out.println(ele.getText());
		
		
		  if (ele.getText().equalsIgnoreCase("23"))
		  {
			  System.out.println("pass"); 
		  }
		  else { 
			  System.out.println("Fail");
		  
		  }
		 
		 
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/reg/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
