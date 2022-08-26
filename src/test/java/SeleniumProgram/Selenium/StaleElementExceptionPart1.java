package SeleniumProgram.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExceptionPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("gurupdas");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("122432eqw");

		driver.navigate().refresh();

		// username.sendKeys("Swetadas");

		try {
			username.sendKeys("BEAN");
			password.sendKeys("MUNU");
		} catch (StaleElementReferenceException e) {

			WebElement username1 = driver.findElement(By.id("email"));
			username1.sendKeys("BEAN");

			WebElement password1 = driver.findElement(By.id("pass"));
			password1.sendKeys("MUNU");

		}
		driver.close();
	}

}
