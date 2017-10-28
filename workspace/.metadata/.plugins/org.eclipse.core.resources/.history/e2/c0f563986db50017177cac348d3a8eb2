package core;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.logging.*;

public class ChromeAl {
	WebDriver driver;
	By by;
	public static boolean isPresent(final By by) {
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     if (!driver.findElements(by).isEmpty()) return true;
	     else return false;
	}
	 
	brandNameLink = By.id("//*[@id="productHeaderBox"]/div[1]/div/div/div/div/a");
	brandbrandName = By.id("//*[@id="productHeaderBox"]/div[1]/div/div/div/div/h1");
	singlePrice = By.id("//*[@id="productHeaderBox"]/section[2]/div/div[1]/span");
	 
	System.out.println("01. Element [brandNameLink]": " + (isPresent(brandNameLink) ? "Exists":" Not exist"));
	System.out.println("01. Element [brandbrandName]": " + (isPresent(brandNameLink) ? "Exists":" Not exist"));
	System.out.println("01. Element [singlePrice]": " + (isPresent(brandNameLink) ? "Exists":" Not exist"));
}