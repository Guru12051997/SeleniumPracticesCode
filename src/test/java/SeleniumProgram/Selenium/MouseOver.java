package SeleniumProgram.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		WebElement scc = driver.findElement(By.id("mousehover"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		Actions ac = new Actions(driver);
		ac.moveToElement(scc).perform();
		Thread.sleep(3000);

		List<WebElement> a = driver.findElements(By.xpath("/html/body/div[4]/div/fieldset/div/div/a"));
		int totalcount = a.size();

		for (int i = 0; i < totalcount; i++) {
			String value = a.get(i).getText();
			if (value.equalsIgnoreCase("top")) {
				a.get(i).click();

			}
			Thread.sleep(3000);
			driver.quit();
		}

	}
}
