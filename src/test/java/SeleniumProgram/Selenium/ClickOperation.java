package SeleniumProgram.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOperation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
//----------Normal click----------
		System.out.println(driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).isEnabled());
		
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).isEnabled());;

		List<WebElement> a=driver.findElements(By.name("radioButton"));
		System.out.println(a.size());
		
		//----------Action Class-----------	

		//WebElement w = driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input"));
//		Actions a = new Actions(driver);
//		a.moveToElement(w).click().perform();
//		Thread.sleep(3000);

//		// ----------By JavaScripts-----------
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", w);
//		w.click();
//		Thread.sleep(3000);
		driver.quit();
//	}

	}
}
