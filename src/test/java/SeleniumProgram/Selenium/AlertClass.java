package SeleniumProgram.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		WebElement web = driver.findElement(By.id("name"));
		web.sendKeys("MUNUUU");
		
		// driver.findElement(By.id("confirmbtn")).click();
		driver.findElement(By.id("alertbtn")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();

		driver.quit();
	}

}
