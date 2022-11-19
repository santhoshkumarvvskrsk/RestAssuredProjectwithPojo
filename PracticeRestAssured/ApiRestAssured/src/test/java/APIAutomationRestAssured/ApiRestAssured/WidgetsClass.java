package APIAutomationRestAssured.ApiRestAssured;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WidgetsClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String month ="March 2021";
		String day ="18";
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Santhosh");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("kumar@gmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("8099208034");
//		System.out.println(driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		Thread.sleep(2000);

		while(true) {
		String caldate = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();
			if(caldate.equals(month)) {
				break;
			}else {
//				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
		}
		driver.findElement(By.xpath("//div[contains(text(),'"+day+"')]")).click();
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("English");
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(text(),'Sports')]")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\santhosh\\Desktop\\HCM.xlsx");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("S/O V V Ramana Murthy,Garividi,Vizianagaram");
		driver.findElement(By.xpath("//input[@id='react-select-3-input']")).sendKeys("Haryana");
		driver.findElement(By.xpath("//input[@id='react-select-3-input']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
//		String str = driver.switchTo().alert().getText();
//		System.out.println(str);
		

	}

}
