package APIAutomationRestAssured.ApiRestAssured;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://demo.automationtesting.in/Register.html");
		
//		dr.findElement(By.linkText("WebTable")).click();
//		dr.navigate().refresh();
//		Actions actions = new Actions(dr);
//		WebElement target = dr.findElement(By.linkText("SwitchTo"));
//		actions.moveToElement(target).perform();
//		String parent = dr.getWindowHandle();
//		System.out.println("Parent Window id is "+parent);
//		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//		dr.findElement(By.linkText("WebTable")).click();
//		dr.navigate().refresh();
//		Actions actions = new Actions(dr);
//		WebElement target = dr.findElement(By.linkText("Widgets"));
//		actions.moveToElement(target).perform();
//		dr.findElement(By.linkText("Accordion")).click();
//		dr.findElement(By.linkText("Collapsible Group 1 - Readability")).sendKeys(selectLinkOpeninNewTab);
//		dr.findElement(By.linkText("https://www.browserstack.com/guide/handle-multiple-windows-in-selenium")).sendKeys(selectLinkOpeninNewTab);
//		Set<String> allwindows = dr.getWindowHandles();
//		int count = allwindows.size();
//		System.out.println("Total Windows are "+ count);
//		
//		for (String child: allwindows) {
//			if(!parent.equals(child)) {
//				dr.switchTo().window(child);
//			}
//		}
		
		
		
	}

}
