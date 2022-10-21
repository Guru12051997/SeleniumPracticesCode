package SeleniumProgram.Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowsHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		// driver.manage().window().maximize();
		// driver.switchTo().newWindow(WindowType.TAB);
		driver.findElement(By.xpath(" //*[@id=\"tabButton\"]")).click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
        String parentWindowID = it.next();
		System.out.println("parentid is --->" + parentWindowID);
		String ChildWindowID = it.next(); 
		System.out.println("childid is---> " + ChildWindowID);

		driver.switchTo().window(ChildWindowID);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
