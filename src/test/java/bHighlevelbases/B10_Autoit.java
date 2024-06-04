package bHighlevelbases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class B10_Autoit {
	
	public WebDriver driver;
	
  @Test
  public void operation() throws Exception {
	  
	  //driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("\"C:\\Users\\saiva\\OneDrive\\Desktop\\Chinni.exe\"");
	  
	  WebElement ele1 = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	  
	  ele1.sendKeys("C:\\Users\\saiva\\OneDrive\\Desktop\\Chinni.exe");
	  Thread.sleep(3000);
	  
		/*
		 * //clicks on choose file
		 * driver.findElement(By.xpath("//input[@id='uploadPicture']")).click();
		 * 
		 * //Auto it command
		 * Runtime.getRuntime().exec("C:\\Users\\saiva\\OneDrive\\Desktop\\Chinni.exe");
		 */
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
