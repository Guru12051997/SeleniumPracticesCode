package SeleniumProgram.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExceptionPart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement Link = driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a"));

		Link.click();
		driver.navigate().back();
		Thread.sleep(5000);

		try {
			Link.click();

		} catch (StaleElementReferenceException e) {
			WebElement Link1 = driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a"));

			Link1.click();

		}
		Thread.sleep(2000);

		driver.close();

	}

}
