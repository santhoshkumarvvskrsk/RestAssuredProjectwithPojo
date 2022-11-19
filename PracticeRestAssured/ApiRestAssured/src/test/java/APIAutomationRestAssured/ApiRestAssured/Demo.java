package APIAutomationRestAssured.ApiRestAssured;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
//		dr.get("http://the-internet.herokuapp.com/");
//		dr.findElement(By.xpath("//a[@href ='/add_remove_elements/']")).click();
//		dr.findElement(By.tagName("button")).click();
//		for(int i=0;i<5;i++) {
//			dr.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
//		}
//		List<WebElement> listOfElements=dr.findElements(By.xpath("//button[contains(text(),'Delete')]"));
//		
//		for(WebElement ele:listOfElements) {
//			dr.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
//		}
//		dr.close();
		dr.get("http://demo.automationtesting.in/Register.html");
		dr.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("santhosh");
		dr.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kumar");
		dr.findElement(By.xpath("//textarea")).sendKeys("Garivid,Vizianagaram,pincode-535101");
		dr.findElement(By.xpath("//input[@type='email']")).sendKeys("santosh@gmail.com");
		dr.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\santhosh\\Desktop\\response_1592121806644.json");
		dr.findElement(By.xpath("//input[@type='tel']")).sendKeys("8099208034");
		dr.findElement(By.xpath("//input[@value='Male']")).click();
//		dr.findElement(By.id("checkbox2")).click();
		dr.findElement(By.xpath("//input[@value='Movies']")).click();
		dr.findElement(By.xpath("//multi-select//div")).click();
		dr.findElement(By.xpath("//a[contains(text(),'English')]")).click();
		dr.findElement(By.xpath("//a[contains(text(),'Korean')]")).click();
		
		Select skills = new Select(dr.findElement(By.id("Skills")));
		skills.selectByValue("Java");
		Select country = new Select(dr.findElement(By.id("countries")));
		country.selectByValue("India");
		Select year = new Select(dr.findElement(By.id("yearbox")));
		year.selectByValue("1991");
		Select month = new Select(dr.findElement(By.xpath("//select[@placeholder='Month']")));
		month.selectByValue("December");
		Select currentday = new Select(dr.findElement(By.id("daybox")));
		currentday.selectByValue("22");
		
		dr.findElement(By.id("firstpassword")).sendKeys("Santhosh537");
		dr.findElement(By.id("secondpassword")).sendKeys("Santhosh537");
		dr.findElement(By.id("submitbtn")).click();
		dr.findElement(By.id("Button1")).click();
		dr.findElement(By.linkText("WebTable")).click();
		
		
	}

}
