package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {

	public static final String URL="https://kompanija54.humanity.com/app/admin/settings/";
	private static final String SELECT_COUNTRY_XPATH="//select[@id='country']";
	private static final String SELECT_LANGUAGE_XPATH="//td[@class='nowrap']//select[@name='language']";
	private static final String SELECT_TIME_XPATH="//select[@name='pref_24hr']";
	
	// Select Country	
	public static Select getCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_COUNTRY_XPATH)));
	}
	public static void inputCountry(WebDriver driver, String data ) {
		getCountry(driver).selectByVisibleText(data);
	}
	
	// Default Language
	public static Select getLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_LANGUAGE_XPATH)));
	}
	public static void inputLanguage(WebDriver driver, String data ) {
		getLanguage(driver).selectByVisibleText(data);
	}
	
	// Time Format
	public static Select getTime(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_TIME_XPATH)));
	}
	public static void inputTime(WebDriver driver, String data ) {
		getTime(driver).selectByVisibleText(data);
	}
	
}
