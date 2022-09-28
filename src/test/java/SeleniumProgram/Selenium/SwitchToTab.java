package SeleniumProgram.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//opentab
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		/*
		 * JavascriptExecutor jse = (JavascriptExecutor)driver;
		 * jse.executeScript("window.open()");
		 */
		//driver.switchTo().newWindow(WindowType.TAB);
		WebElement web = driver.findElement(By.id("opentab"));
	    web.click();
	    
	
		
	}

}
