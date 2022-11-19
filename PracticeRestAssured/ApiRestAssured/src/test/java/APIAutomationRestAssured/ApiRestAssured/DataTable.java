package APIAutomationRestAssured.ApiRestAssured;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DataTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
//		dr.get("http://demo.automationtesting.in/Register.html");
		dr.get("https://demoqa.com/automation-practice-form");
		WebElement data = dr.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		System.out.println(data.getAttribute("value"));
//		dr.findElement(By.linkText("WebTable")).click();
//		dr.navigate().refresh();
//	    dr.findElement(By.tagName("Body")).sendKeys(Keys.CONTROL + "t");
//		String selectLinkOpen = Keys.chord(Keys.CONTROL,Keys.RETURN);
//		dr.findElement(By.linkText("WebTable")).sendKeys(selectLinkOpen);
//		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		dr.manage().timeouts().wait(10);
		

//	   ArrayList <String> tabs = new ArrayList<>(dr.getWindowHandles());
//	   dr.switchTo().window(tabs.get(1));
//	   Thread.sleep(10000);
//	    dr.quit();


	}

}
