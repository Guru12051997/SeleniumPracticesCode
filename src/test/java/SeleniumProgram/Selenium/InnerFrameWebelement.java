package SeleniumProgram.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerFrameWebelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		WebElement web = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(web);

		driver.findElement(By.xpath(" //input[@type='text']")).sendKeys("munu automation");

		Thread.sleep(3000);
		driver.quit();
	}

}
