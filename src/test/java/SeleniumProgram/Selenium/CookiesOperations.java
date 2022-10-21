//package SeleniumProgram.Selenium;
//
//import java.util.Set;
//
//import org.apache.hc.client5.http.cookie.Cookie;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CookiesOperations {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.opencart.com/");
//		driver.manage().window().maximize();
//
//		Set<Cookie> cookies = driver.manage().getCookies();
//		System.out.println("Size of cookies--->" + cookies.size());
//
//		for (Cookie a : cookies) {
//			System.out.println(a.getName() + " :" + a.getValue());
//		}
//		// add cookies
//		Cookie ckobj = new Cookie("mycookie222", "2244232");
//		driver.manage().addCookie(ckobj);
//		Set<Cookie> cookies1 = driver.manage().getCookies();
//		System.out.println("Size of cookies--->" + cookies1.size());// 6
//
//		// delete cookies by name
//		// driver.manage().deleteCookie(ckobj);
//		// Set<Cookie> cookies2 = driver.manage().getCookies();
//		// System.out.println("Size of cookies after delection--->" +
//		// cookies2.size());//5
//
//		// driver.manage().deleteCookieNamed("mycookie222");
//		// Set<Cookie> cookies3 = driver.manage().getCookies();
//		// System.out.println("Size of cookies after delection--->" +
//		// cookies3.size());//5
//
//		// All the cookies delete
//		driver.manage().deleteAllCookies();
//		Set<Cookie> cookies4 = driver.manage().getCookies();
//		System.out.println("Size of cookies after delection--->" + cookies4.size());// 5
//
//		driver.close();
//
//	}
//
//}
