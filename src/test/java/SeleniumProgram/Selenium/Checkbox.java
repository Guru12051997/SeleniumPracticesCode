package SeleniumProgram.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement BOX1 = driver.findElement(By.id("checkBoxOption1"));
		WebElement BOX2 = driver.findElement(By.id("checkBoxOption2"));
		WebElement BOX3 = driver.findElement(By.id("checkBoxOption3"));

		BOX1.click();
		BOX2.click();
		BOX3.click();

		Thread.sleep(3000);

		BOX1.click();
		BOX2.click();
		BOX3.click();

		Thread.sleep(3000);
		driver.quit();

	}

}
