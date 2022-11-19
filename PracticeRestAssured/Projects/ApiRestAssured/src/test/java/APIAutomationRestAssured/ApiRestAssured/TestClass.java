package APIAutomationRestAssured.ApiRestAssured;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class TestClass {
	//First of all,create WebDriver reference
	WebDriver driver;
  @Test
  public void f() {
	  String getTitle = driver.getTitle(); 
	  System.out.println("Title of web page: " +getTitle);
  }
  @BeforeSuite
  public void beforeSuite() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  @BeforeTest
  public void beforeTest() {
	  String URL = "https://www.google.com";  
	   driver.get(URL); 
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
  }
  @AfterTest
  public void afterTest() throws IOException {
	  System.out.println("After Test Method");
	  
	  File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(file, new File("E:\\Projects\\ApiRestAssured\\src\\test\\java\\APIAutomationRestAssured\\ApiRestAssured\\Test.jpg"));
  }

}
