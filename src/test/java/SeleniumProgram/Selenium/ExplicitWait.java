package SeleniumProgram.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.com/");
		driver.manage().window().maximize();

		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.findElement(By.name("q")).sendKeys("selenium");
		// driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		WebElement element = mywait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")));
		element.click();
		driver.close();
	}

}
