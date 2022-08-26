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

public class JavaScriptsExecutor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement Logo = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div[1]/img"));
     //ScreenShot
		JavaScriptsutil.drawBordor(Logo, driver);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tre = new File(".\\Screenshots\\logo.png");
		FileUtils.copyFile(src, tre);
     //Title
		String title = JavaScriptsutil.getTitleByjs(driver);
		System.out.println(title);

		// driver.close();

	}

}
