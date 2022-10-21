package SeleniumProgram.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/ ");
		driver.manage().window().maximize();

		// Check if the title is displayed as `Your Store
		System.out.println("Homepage title-->" + driver.getTitle());

		// Navigate to “Components’ Menu and select “Monitors” submenu option
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement com = driver.findElement(By.xpath("//a[normalize-space()='Components']"));

		action.moveToElement(com).build().perform();
	
		/*
		 * List<WebElement> value =
		 * driver.findElements(By.xpath("li[class='dropdown open'] div"));
		 * 
		 * for (WebElement value1 : value) { if
		 * (value1.getText().equalsIgnoreCase("Monitors")) { value1.click(); } }
		 */

		driver.findElement(By.xpath("/a[normalize-space()='Apple Cinema 30\"']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='price-new']")).getText());

		 driver.quit();
	}

}
