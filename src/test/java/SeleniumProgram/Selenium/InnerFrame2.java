package SeleniumProgram.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerFrame2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.cssSelector("body h1")).getText());

		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.cssSelector("body p")).getText());

		Thread.sleep(3000);
		driver.quit();

	}

}
