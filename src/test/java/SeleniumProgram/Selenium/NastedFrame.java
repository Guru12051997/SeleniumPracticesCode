package SeleniumProgram.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NastedFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

		WebElement ele = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(ele);

		WebElement ele1 = driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']"));
		driver.switchTo().frame(ele1);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("MUNU automation");

		Thread.sleep(3000);
		driver.quit();

	}

}
