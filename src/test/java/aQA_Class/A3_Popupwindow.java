package aQA_Class;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class A3_Popupwindow {
	
	public WebDriver driver;
	
  @Test
  public void popwindow() throws Exception {
	  
	  //click on separate window
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(3000);
	  
	  //click on click_button
	  driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
	  Thread.sleep(3000);
	  
	  //come back to parent window handle
	  String backtoparentwindow = driver.getWindowHandle();
	  
	  //handling child window
	  for(String childwindowhandle : driver.getWindowHandles())
	  {
		  
		  //switch to child window
		  driver.switchTo().window(childwindowhandle);
		  
	  }
	
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  //click on Blog_button
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[6]/a/span")).click();
	  Thread.sleep(3000);
	  
	  //child window closed
	  driver.close();
	  Thread.sleep(3000);
	  
	  //Again switch focus back to parent window
	  driver.switchTo().window(backtoparentwindow);
	  Thread.sleep(3000);
	  
	  //clicks on Home_button
	  driver.findElement(By.linkText("Home")).click();
	  Thread.sleep(3000);
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
