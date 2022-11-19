package APIAutomationRestAssured.ApiRestAssured;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchTo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://demo.automationtesting.in/Register.html");
		dr.findElement(By.linkText("WebTable")).click();
		dr.navigate().refresh();
		Actions actions = new Actions(dr);
		WebElement target = dr.findElement(By.linkText("SwitchTo"));
		actions.moveToElement(target).perform();
		dr.findElement(By.linkText("Alerts")).click();
//		dr.findElement(By.xpath("//button[contains(text(),'click the button to display an ')]")).click();
//		dr.switchTo().alert().accept();
//		dr.findElement(By.linkText("Alert with OK & Cancel")).click();
//		dr.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
//		dr.switchTo().alert().dismiss();
		dr.findElement(By.linkText("Alert with Textbox")).click();
		dr.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		dr.switchTo().alert().sendKeys("Santhosh All The Vert Best");
		dr.switchTo().alert().accept();

	}
}
