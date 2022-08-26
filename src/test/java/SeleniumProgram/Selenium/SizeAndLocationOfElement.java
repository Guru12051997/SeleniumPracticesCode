package SeleniumProgram.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SizeAndLocationOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		// Location -- Method 1

		System.out.println(logo.getLocation());
		System.out.println("X value is---" + logo.getLocation().getX());
		System.out.println("Y value is---" + logo.getLocation().getY());
		
		// Location -- Method 2
		System.out.println("X value is---" + logo.getRect().getX());
		System.out.println("Y value is---" + logo.getRect().getY());
		
		//SIZE method 1
		
		System.out.println("Size---->" +logo.getSize());
		System.out.println("size (width)----"+logo.getSize().getWidth());
		System.out.println("size (height)----"+logo.getSize().getHeight());
		
		//Size Method 2
		
		System.out.println("size (width)----"+logo.getRect().getDimension().getWidth());
		System.out.println("size (height)----"+logo.getRect().getDimension().getHeight());
		driver.close();
		
		
		
		
		
		driver.close();  
		
		
		
		

		

	}

}
