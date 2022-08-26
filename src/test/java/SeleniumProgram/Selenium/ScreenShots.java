package SeleniumProgram.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		// full page Screenshot

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshots\\Homepage.png");
		FileUtils.copyFile(src, trg);

		// portion the page

		/*
		 * WebElement section = driver.findElement(By.xpath("/html/body/" +
		 * "div[6]/div[3]/div/div/div/div/div[4]")); File src =
		 * section.getScreenshotAs(OutputType.FILE); File trg = new
		 * File(".\\Screenshots\\portion.png"); FileUtils.copyFile(src, trg);
		 */

	/*	WebElement section = driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[1]"));
		File src = section.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshots\\Logophoto11.png");
		FileUtils.copyFile(src, trg);

		driver.close();*/

	}
}
