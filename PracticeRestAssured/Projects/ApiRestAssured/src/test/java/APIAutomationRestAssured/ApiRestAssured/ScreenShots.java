package APIAutomationRestAssured.ApiRestAssured;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

//import org.apache.commons.io.FileUtils;
//import org.apache.commons.*;

public class ScreenShots {
 static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		takeScreenshot("Test_login");
	}
	public static void takeScreenshot(String fileName)throws IOException {
		//1. Take Screenshot and store it as file format.
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//2. Copy Screenshot to desired location using copyfile method.
		FileUtils.copyFile(file,new File("E:\\Projects\\ApiRestAssured"+fileName+".jpg"));
		
	}
}
