package SeleniumProgram.Selenium;

import org.testng.annotations.Test;

public class TestNGQuestions {

	@Test
	public void AddToCart() {

		System.out.println("ADDCART");
		int i = 9 / 0;
	}

	@Test(enabled = true, alwaysRun = true, dependsOnMethods = "AddToCart")
	public void Payment() {

		System.out.println("................Payment");
	}
}
