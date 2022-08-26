package SeleniumProgram.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement min_slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		// System.out.println(min_slider.getLocation());
		// System.out.println(min_slider.getSize());
		Actions act = new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 0).perform();

	}

}
