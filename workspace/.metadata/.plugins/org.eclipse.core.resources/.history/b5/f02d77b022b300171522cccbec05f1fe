package chrome;


import java.util.concurrent.TimeUnit;
import java.util.logging.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Test {

	static WebDriver driver;
	static String url;
	static long start;
	static long finish;

	public static void open(String url) {
	//	String USERAGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:55.0) Gecko/20100101 Firefox/55.0";
		Logger.getLogger("").setLevel(Level.OFF);
		
		String driverPath = "";
		String browser = "Chrome";
		if (System.getProperty("os.name").toUpperCase().contains("MAC")) driverPath = "./resources/webdrivers/mac/chromedriver";
		else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) driverPath = "./resources/webdrivers/pc/chromedriver.exe";
		else throw new IllegalArgumentException("Unknown OS");

		System.setProperty("webdriver.chrome.driver", driverPath);
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-infobars");
		option.addArguments("--disable-notifications");
		if (System.getProperty("os.name").toUpperCase().contains("MAC")) option.addArguments("-start-fullscreen");
		else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) option.addArguments("--start-maximized");
		else throw new IllegalArgumentException("Unknown OS");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get(url);
		System.out.println("Page URL: " + driver.getCurrentUrl());
//		System.out.println(
//				"UserAgent: " + USERAGENT);
	}

	public static boolean isPresent(By by) {
		if (driver.findElements(by).size()>0)
			return true;
		else
			return false;
	}

	
	static By item_01 = By.xpath("//tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]"); // sgnup
																									// area
	

	public static void main(String[] args) {
		System.out.println("Browser: Chrome TEST");

		start = System.currentTimeMillis();

		url = "http://alex.academy/exe/signup/v1/index.php";
		open(url);

		System.out.println("01. UI element [Sign Up area]: " + (isPresent(item_01) ? "Exists" : "Not exist")); // signup
		

		driver.quit();

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		url = "http://alex.academy/exe/signup/v1/confirmation.php";
		System.out.printf("\n\nConfirmation page:\n");

		open(url);

		System.out.println("01. UI element [Sign Up area]: " + (isPresent(item_01) ? "Exists" : "Not exist")); // signup
	

		driver.quit();

		finish = System.currentTimeMillis();
		System.out.println("Response time: " + (finish - start) + " ms");
	}
}