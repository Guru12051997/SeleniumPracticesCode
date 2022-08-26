package SeleniumProgram.Selenium;

import java.util.HashMap;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadWordFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String locations = System.getProperty("user.dir") + "\\Downloads\\";
		HashMap perferences = new HashMap();
		perferences.put("download.default_directory", locations);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", perferences);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://filesamples.com/formats/docx");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		

		driver.findElement(By.xpath("//*[@id=\"output\"]/div[1]/a")).click();

		driver.switchTo().alert().dismiss();
	}

}
