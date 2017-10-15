package core;

import org.openqa.selenium.WebDriver;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver = FirefoxDriver();   
	
	// String url = "http://www.learn2test.net";
				// String title_expected = "learn2test.net";
		for (int i = 0; i < args.length; i++) {
			String text_case_id = "TC-001.01"	+ (i + 1);
		String param[] = args[0].split("\\|");
		
		String url = param[0];
		String title_expected = param[1];
		
		driver.get(url);
		
		String title_actual = driver.getTitle();
		
		if (title_expected.equals(title_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("URL: \t\t\t" + url);
			System.out.println("Title Expected: \t" + title_expected);
			System.out.println("Title Actual: \t\t" + title_actual);
			System.out.println("Test Case Result: \t" + "PASSED");
			
		} else {
		
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("URL: \t\t\t" + url);
			System.out.println("Title Expected: \t" + title_expected);
			System.out.println("Title Actual: \t\t" + title_actual);
			System.out.println("Test Case Result: \t" + "FAILED");
		}
		
		driver.wait(); }
		}

	private static WebDriver FirefoxDriver() {
	
		return null;
	}}