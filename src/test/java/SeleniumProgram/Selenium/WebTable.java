package SeleniumProgram.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		int Row = driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr")).size();
		System.out.println(Row);

		int Column = driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr/th"))
				.size();
		System.out.println(Column);

		String A = driver.findElement(By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr[6]/td[2]"))
				.getText();
		System.out.println(A);

//		//all the data
//		
//		for(int r=1;r<=Row;r++) {
//			for(int c=1;c<=Column;c++) {
//			String data=driver.findElement(By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr["+r+"]/td["+c+"]")).getText();
//			System.out.println(data); 
//			
//			}
//		//	System.out.println(" "); 
//		}

		/*
		 * for (int r = 1; r <= Row; r++) { // for(int c=1;c<=Column;c++) { String data
		 * = driver .findElement(By.xpath(
		 * "//div[@class='left-align']//table[@id='product']/tbody/tr[" + r + "]"))
		 * .getText(); System.out.println(data);
		 * 
		 * }
		 */
		/*
		 * for (int r = 2; r <= Row; r++) { String name = driver .findElement(By.xpath(
		 * "//div[@class='left-align']//table[@id='product']/tbody/tr[" + r +
		 * "]/td[1]")) .getText(); if (name.equalsIgnoreCase("Rahul Shetty")) { String
		 * course = driver .findElement(
		 * By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr[" + r +
		 * "]/td[2]")) .getText();
		 * 
		 * String price = driver .findElement(
		 * By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr[" + r +
		 * "]/td[3]")) .getText();
		 * 
		 * System.out.println(name + "---" + course + "---" + price);
		 * 
		 * }
		 * 
		 * }
		 */

		for (int r = 2; r <= Row; r++) {
			String course = driver
					.findElement(By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr[" + r + "]/td[2]"))
					.getText();
			if (course.equalsIgnoreCase("Write effective QA Resume that will turn to interview call")) {
				String price = driver
						.findElement(
								By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr[" + r + "]/td[3]"))
						.getText();
				System.out.println(course + "------------" + price);
			}
		}

		driver.quit();
	}
}