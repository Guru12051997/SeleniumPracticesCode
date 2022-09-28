package SeleniumProgram.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownGenericPart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();

		driver.findElement(By.name("firstname")).sendKeys("Guru");
		driver.findElement(By.name("lastname")).sendKeys("Prasad");
		driver.findElement(By.name("reg_email__")).sendKeys("guru@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("guru@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456");

		WebElement Date = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		String dob = "12-May-1997";
		String dobarr[] = dob.split("-");

		SelectValueFromDropDown(Date, dobarr[0]);
		SelectValueFromDropDown(month, dobarr[1]);
		SelectValueFromDropDown(year, dobarr[2]);

		WebElement radio = driver.findElement(By.xpath("//input[@value='2']"));
		radio.click();

		Thread.sleep(5000);
		driver.quit();

	}

	public static void SelectValueFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);

	}

}
