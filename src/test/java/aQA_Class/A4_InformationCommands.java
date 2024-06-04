package aQA_Class;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class A4_InformationCommands {
	
	public WebDriver driver;
	
  @Test(priority = 1)
  public void gmail()  {
	  String str1 = driver.findElement(By.linkText("Gmail")).getText();
	  System.out.println(str1);
  }
	  
  @Test(priority = 2)
  public void google_image() {
	  String str2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).getAttribute("alt");
	  System.out.println(str2);
	 
  }
  
  @Test(priority = 3)
  public void searchbutton() 
  {
	  String str3 = driver.findElement(By.name("btnk")).getAttribute("value");
	  System.out.println(str3);

}
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
