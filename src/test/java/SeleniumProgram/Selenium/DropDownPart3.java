package SeleniumProgram.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPart3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		// driver.manage().window().maximize();

		WebElement Date = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select select = new Select(Date);
		Select select1 = new Select(month);
		Select select2 = new Select(year);

		System.out.println(select.isMultiple());
		System.out.println(select1.isMultiple());
		System.out.println(select2.isMultiple());

		List<WebElement> listdays = select.getOptions();
		System.out.println(listdays.size());

		List<WebElement> listMonth = select1.getOptions();
		System.out.println(listMonth.size());

		List<WebElement> listYear = select2.getOptions();
		System.out.println(listYear.size());

		for (int i = 0; i < listdays.size(); i++) {
			String dayval = listdays.get(i).getText();
			System.out.println(dayval);

			if (dayval.equals("12")) {
				listdays.get(i).click();
				break;
			}

		}
		for (int j = 0; j < listMonth.size(); j++) {
			String dayval1 = listMonth.get(j).getText();
			System.out.println(dayval1);

			if (dayval1.equals("May")) {
				listMonth.get(j).click();
			
			}
		}
			for (int k = 0; k < listYear.size(); k++) {
				String dayval2 = listYear.get(k).getText();
				System.out.println(dayval2);

				if (dayval2.equals("1997")) {
					listYear.get(k).click();
					break;
				}
			}

			Thread.sleep(1000);
			driver.quit();
		}

	
}
