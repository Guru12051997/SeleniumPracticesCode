package SeleniumProgram.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions c1 = new ChromeOptions();
		c1.setHeadless(true);
//not open chrome
		WebDriver driver = WebDriverManager.chromedriver().capabilities(c1).create();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.2.1");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		

	}

}
