package SeleniumProgram.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPart1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();

		driver.findElement(By.name("firstname")).sendKeys("Prateek");
		driver.findElement(By.name("lastname")).sendKeys("Pattanaik");
		driver.findElement(By.name("reg_email__")).sendKeys("PrateekPattanaik@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("PrateekPattanaik@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456");

		WebElement Date = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select select = new Select(Date);
		select.selectByVisibleText("12");

		Select select1 = new Select(month);
		select1.selectByVisibleText("May");

		Select select2 = new Select(year);
		select2.selectByVisibleText("1997");
		WebElement radio = driver.findElement(By.xpath("//input[@value='2']"));
		radio.click();

		Thread.sleep(5000);
		driver.quit();
	}

}
