package aQA_Class;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class A5_Screenshot {
	
	public WebDriver driver;

  @Test
  public void alertscreen() throws Exception {
	  
	  //click on click me button
	  driver.findElement(By.id("alertButton")).click();
	  Thread.sleep(3000);
	  
	 String str =  driver.switchTo().alert().getText();
	 System.out.println(str);
	 
	 Thread.sleep(3000);
	 driver.switchTo().alert().accept();
	 
	 String Images = "alert";
	 File scrfiFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 org.openqa.selenium.io.FileHandler.copy(scrfiFile, new File("C:\\Users\\saiva\\OneDrive\\Desktop\\HPK\\"+Images+".png"));
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.manage().window().maximize();
	  
	  String Images = "openurl";
	  File scrfiFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  org.openqa.selenium.io.FileHandler.copy(scrfiFile, new File("C:\\Users\\saiva\\OneDrive\\Desktop\\HPK\\"+Images+".png"));
	  
	 
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	 
	  
  }

}
