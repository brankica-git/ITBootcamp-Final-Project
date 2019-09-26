package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {
	public static final String DATA_SOURCE="Data.xls";
	public static final String URL = "https://www.humanity.com/";
	private static final String NAME_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String EMAIL_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String STARTBUTTON_XPATH = "//input[@id='free-trial-link-01']";
	private static final String ABOUTAS_XPATH = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static final String LOGIN_XPATH = "//p[contains(text(),'LOGIN')]";
	private static final String EUSER_XPATH = "//input[@id='email']";
	private static final String SIFRA_XPATH = "//input[@id='password']";
	private static final String PRITISNILOGIN = "//button[contains(text(),'Log in')]";

	private static final String FREE_XPATH = "//a[@class='button pale']";
//Name

	public static WebElement getName(WebDriver driver) {
		return driver.findElement(By.xpath(NAME_XPATH));
	}

	public static void clickName(WebDriver driver) {
		getName(driver).click();
	}

	public static void inputName(WebDriver driver, String data) {
		getName(driver).sendKeys(data);
	}

//email

	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void inputEmail(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}

//button start
	public static WebElement getStartButton(WebDriver driver) {
		return driver.findElement(By.xpath(STARTBUTTON_XPATH));
	}

	public static void clickStartButton(WebDriver driver) {
		getStartButton(driver).click();
	}

//about as

	public static WebElement getSAboutAs(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUTAS_XPATH));
	}

	public static void clickAboutAs(WebDriver driver) {
		getSAboutAs(driver).click();

	}
//Login

	public static WebElement getLogin(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_XPATH));
	}

	public static void clickLogin(WebDriver driver) {
		getLogin(driver).click();
	}

	public static WebElement getEUser(WebDriver driver) {
		return driver.findElement(By.xpath(EUSER_XPATH));
	}

	public static void clickEUser(WebDriver driver) {
		getEUser(driver).click();
	}

	public static void inputEUser(WebDriver driver, String data) {
		getEUser(driver).sendKeys(data);

	}

	public static WebElement getSifra(WebDriver driver) {
		return driver.findElement(By.xpath(SIFRA_XPATH));
	}

	public static void clickSifra(WebDriver driver) {
		getSifra(driver).click();
	}

	public static void inputSifra(WebDriver driver, String data) {
		getSifra(driver).sendKeys(data);

	}

	public static WebElement getPritisniLogin(WebDriver driver) {
		return driver.findElement(By.xpath(PRITISNILOGIN));
	}

	public static void clickPritisniLogin(WebDriver driver) {
		getPritisniLogin(driver).click();
	}

	public static void inputLogin(WebDriver driver, String data) {
		getLogin(driver).sendKeys(data);

	}

//my free
	public static WebElement getFree(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_XPATH));
	}

	public static void clickFree(WebDriver driver) {
		getFree(driver).click();
	}

}
