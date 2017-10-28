package firefox;


import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Common {

	static WebDriver driver;

	public static void open(String url) {
		String USERAGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:55.0) Gecko/20100101 Firefox/55.0";
		Logger.getLogger("").setLevel(Level.OFF);
		
		String driverPath = "./resources/webdrivers/mac/geckodriver.sh";
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get(url);
		
		
		System.out.println("\nUserAgent: " + USERAGENT);
		System.out.println("Page URL: " + driver.getCurrentUrl());
	}
	
	public static void quite() {
		driver.quit();
	}

	public static boolean isPresent(By by) {
		if (driver.findElements(by).size() > 0) return true;
		else return false;
	}

	public static boolean isVisible(By by) {
		if ((driver.findElements(by).size() > 0) && driver.findElement(by).isDisplayed()) return true;
		else return false;
	}
	
public static void pageValidation(String test_case, By el) {
		System.out.println(test_case +	(Common.isPresent(el) ? "Exists" : "Not exist")); 
}


static By item_01 = By.xpath("//tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]"); // sgnup
// area
static By item_02 = By.xpath("//*[@id=\"id_f_title\"]"); // signup title
static By item_03 = By.xpath("//*[@id=\"id_f_label_fn\"]"); // first name
// title
static By item_04 = By.xpath("//*[@id=\"id_fname\"]"); // first name field
static By item_05 = By.xpath("//*[@id=\"id_f_label_ea\"]"); // email title
static By item_06 = By.xpath("//*[@id=\"id_email\"]"); // email field
static By item_07 = By.xpath("//*[@id=\"id_rb_label_g\"]"); // gender
// title
static By item_08 = By.xpath("//tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[2]"); // gender
// area
// male
static By item_09 = By.xpath("//*[@id=\"id_rb_label_m\"]"); // gender text
// male
static By item_10 = By.xpath("//*[@id=\"id_gender_male\"]"); // check
// button
// male
static By item_11 = By.xpath("//table/tbody/tr/td[1]/table[2]/tbody/tr/td[4]"); // gender
// text
// female
static By item_12 = By.xpath("//*[@id=\"id_rb_label_f\"]"); // signup &
// confirmation
static By item_13 = By.xpath("//*[@id=\"id_gender_female\"]"); // check
// button
// mfeale
static By item_14 = By.xpath("//*[@id=\"id_cb_label_t\"]"); // I agree
// text
static By item_15 = By.xpath("//*[@id=\"id_terms\"]"); // I agree check
// button
static By item_16 = By.xpath("//*[@id=\"id_img_facebook\"]"); // facebook
static By item_17 = By.xpath("//*[@id=\"id_img_twitter\"]"); // twitter
static By item_18 = By.xpath("//*[@id=\"id_img_flickr\"]"); // flickr
static By item_19 = By.xpath("//*[@id=\"id_img_youtube\"]"); // youtube
static By item_20 = By.xpath("//*[@id=\"id_reset_button\"]"); // reset
// button
static By item_21 = By.xpath("//*[@id=\"id_submit_button\"]"); // submit
// button
static By item_22 = By.xpath("//*[@id=\"id_current_location\"]"); // current
// location
static By item_23 = By.xpath("//*[@id=\"id_temperature\"]"); // current
// temperature
static By item_24 = By.xpath("//*[@id=\"id_weather_icon\"]"); // weather
// icon
static By item_25 = By.xpath("//*[@id=\"id_f_label_ln\"]"); // last name
// text
static By item_26 = By.xpath("//*[@id=\"id_lname\"]"); // last name field
static By item_27 = By.xpath("//*[@id=\"id_f_label_pn\"]"); // phone
// number
// name
static By item_28 = By.xpath("//*[@id=\"id_phone\"]"); // phone number
// field
static By item_29 = By.xpath("//*[@id=\"id_f_label_s\"]"); // stste name
static By item_30 = By.xpath("//*[@id=\"id_state\"]"); // state field
// dropdown
static By item_31 = By.xpath("//*[@id=\"os_browser\"]"); // OS and browser
static By item_32 = By.xpath("//*[@id=\"copyright\"]"); // copyrights
static By item_33 = By.xpath("//*[@id=\"timestamp\"]"); // current date
static By item_34 = By.xpath("//*[@id=\"fname_error\"]/img"); // error
// arrow
// first
// name
static By item_35 = By.xpath("//*[@id=\"ErrorLine\"]"); // error text
// description
static By item_36 = By.xpath("//*[@id=\"lname_error\"]/img"); // error
// arrow
// last name
static By item_37 = By.xpath("//*[@id=\"email_error\"]/img"); // error
// arrow
// email
static By item_38 = By.xpath("//*[@id=\"phone_error\"]/img"); // error
// arrow
// phone
// number
static By item_39 = By.xpath("//tr[1]/td[1]/table[1]/tbody[1]/tr[5]/td[5]"); // error
// massage
// area
static By item_40 = By.xpath("//tr/td/table/tbody/tr[1]/td[5]"); // web
// servises
// area
static By item_41 = By.xpath("//*[@id=\"id_quotes\"]"); // header
static By item_42 = By.xpath("//form[1]/table[1]/tbody[1]/tr[3]/td[1]"); // view
// pain
// area
static By item_43 = By.xpath("//form[1]/table[1]/tbody[1]/tr[4]/td[1]"); // footer
// line
	
}