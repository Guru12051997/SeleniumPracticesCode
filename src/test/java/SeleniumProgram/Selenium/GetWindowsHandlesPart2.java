package SeleniumProgram.Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowsHandlesPart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Google window--->" + driver.getTitle());

		driver.switchTo().newWindow(WindowType.WINDOW);
		// driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles = driver.getWindowHandles();
		List<String> ls = new ArrayList<String>(handles);
		String ParentWindowID = ls.get(0);
		String ChildWindowID = ls.get(1);
		
		System.out.println(ParentWindowID);
		System.out.println(ChildWindowID);

		driver.get("https://www.facebook.com/");
		System.out.println("Facebook window--->" + driver.getTitle());
		driver.close();

		driver.switchTo().window(ParentWindowID);
		System.out.println("Google window--->" + driver.getTitle());

		Thread.sleep(3000);
		driver.quit();
	}

}
