package bHighlevelbases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class B14_FlipkartGeneric {
	
	public WebDriver driver;
	public Actions action;
	
	public void generic(String str) throws Exception {
		
		action = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath(str));
		action.moveToElement(element1).build().perform();
		Thread.sleep(3000);
		
		
		
	}
	
  @Test
  public void clickable() throws Exception {
	  
	  for (int i = 1; i <= 7; i++) {
		  
		  generic("//*[@id=\"container\"]/div/div[2]/div/div/span["+i+"]");
		  
	}
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/account/login?ret=/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
}

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
