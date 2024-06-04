package bHighlevelbases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class B20_ScrollBar_Element {
	
	public WebDriver driver;
	
  @Test
  public void Scrollflow() {
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  
	  //Find element by link text and store in variable "Element" webelement
	  WebElement Element = driver.findElement(By.linkText("Linux"));
	  
	  //This will scroll the page till the element is found
	  js.executeScript("arguments[0].scrollIntoView();", Element);
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/guru99home/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
