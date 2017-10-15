package core;

//BEGIN
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_csv_try {
	public static void main(String[] args) {

		String csvFile = "./src/main/resources/Test.csv";
		BufferedReader br = null;
		String line = null;
		String SplitBy = ",";
		String text_case_id = null;
		String url = null;
		String title_expected = null;

		try {
			br = new BufferedReader(new FileReader(csvFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		FirefoxDriver driver = new FirefoxDriver();

		try {
			while ((line = br.readLine()) != null) {

				String[] csv = line.split(SplitBy);

				text_case_id = csv[0];
				url = csv[1];
				title_expected = csv[2];

				driver.get(url);
			
				String title_actual = driver.getTitle();
				System.out.println("");
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

			}
			
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}
}
// END