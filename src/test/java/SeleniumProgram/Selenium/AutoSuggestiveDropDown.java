package SeleniumProgram.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement web = driver.findElement(By.id("autocomplete"));
		// -----------/Doubt/List<WebElement> w =
		// driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li[2]/div"));
		// System.out.println(w.size());

		web.sendKeys("ind");

		web.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		web.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		web.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);

		web.sendKeys(Keys.ARROW_DOWN + "" + Keys.ENTER);

		Thread.sleep(1000);
		System.out.println("SuccessFully Executed");
		driver.quit();

	}

}
