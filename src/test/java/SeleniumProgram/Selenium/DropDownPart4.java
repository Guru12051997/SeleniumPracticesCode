package SeleniumProgram.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPart4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		// driver.manage().window().maximize();

		List<WebElement> datelist = driver.findElements(By.xpath("//select[@id='day']/option"));
		List<WebElement> monthlist = driver.findElements(By.xpath("//select[@id='month']/option"));
		List<WebElement> yearlist = driver.findElements(By.xpath("//select[@id='year']/option"));

		System.out.println(datelist.size());
		System.out.println(monthlist.size());
		System.out.println(yearlist.size());

		for (int i = 0; i < datelist.size(); i++) {
			System.out.println(datelist.get(i).getText());
			if (datelist.get(i).getText().equals("12")) {
				datelist.get(i).click();
			}
		}
		for (int j = 0; j < monthlist.size(); j++) {
			System.out.println(monthlist.get(j).getText());
			if (monthlist.get(j).getText().equals("May")) {
				monthlist.get(j).click();
			}
		}
		for (int k = 0; k < yearlist.size(); k++) {
			System.out.println(yearlist.get(k).getText());
			if (yearlist.get(k).getText().equals("1997")) {
				yearlist.get(k).click();
				break;
			}
		
		}
		Thread.sleep(3000);
		driver.quit();

	}

}