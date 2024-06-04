package aQA_Class;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A9_Enhancing_StudentQA_Form {
	
	public WebDriver driver;

  @Test
  public void improvement() throws Exception {
	  
	  //Enter FirstName
	  driver.findElement(By.id("firstName")).sendKeys("Sailu");
	  Thread.sleep(1000);
	  
	  //Enter LastName
	  driver.findElement(By.id("lastName")).sendKeys("Vanga");
	  Thread.sleep(1000);
	  
	  //Enter Email
	  driver.findElement(By.id("userEmail")).sendKeys("sailu35@gmail.com");
	  Thread.sleep(1000);
	  
	  //Gender
	  driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
	  Thread.sleep(1000);
	  
	  //Enter Mobile Number
	  driver.findElement(By.id("userNumber")).sendKeys("9392809507");
	  Thread.sleep(1000);
	  
	  //DOJ 4 operations
	  driver.findElement(By.id("dateOfBirthInput")).click();
	  Thread.sleep(1000);
	  
	  //Month
	  new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByVisibleText("April");
	  Thread.sleep(1000);
	  
	  //Year
	  new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByVisibleText("2002");
	  Thread.sleep(1000);
	  
	  //Day
	  driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[3]")).click();
	  Thread.sleep(1000);
	  
	  //Subject
	  driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
	  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  
	  //Hobies
	  driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
	  Thread.sleep(1000);
	  
	  //Choose File
	  driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\saiva\\OneDrive\\Desktop\\A.P.J Abdul Kalam.jpg");
	  Thread.sleep(1000);
	  
	  //Current Address
	  driver.findElement(By.id("currentAddress")).sendKeys("Bhimavaram");
	  Thread.sleep(3000);
	  
	  //state
	  driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).sendKeys("Rajasthan");
	  driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  
	  //City
	  driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]")).sendKeys("Jaipur");
	  driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  
	  //Submit
	  driver.findElement(By.id("submit")).click();	
	  Thread.sleep(3000);
	  Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	 
	  File scrfiFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(scrfiFile, new File("C:\\Users\\saiva\\OneDrive\\Desktop\\HPK\\+Sai.png"));
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
