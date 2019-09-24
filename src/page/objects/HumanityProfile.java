package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
	public static final String URL ="https://kompanija54.humanity.com/app/staff/availability/5089168/";
	private static final String PROFILEBTN_XPATH= "//img[@id='tr_avatar']";
	private static final String PROFIL_XPATH="//a[contains(text(),'Profile')]";
	private static final String SETTINGS_XPATH="//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String AVAILABILITY_XPATH="//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String NUMBERVERSION_XPATH="//b[contains(text(),'9.5.5')]";
	
	public static WebElement getProfileBtn(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILEBTN_XPATH));
	}

	public static void clickProfil(WebDriver driver) {
		getProfileBtn(driver).click();
	}
	public static WebElement getProfil(WebDriver driver) {
		return driver.findElement(By.xpath(PROFIL_XPATH));
	}

	public static void clickSettings(WebDriver driver) {
		getProfil(driver).click();
	}
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_XPATH));
	}

	public static void clickProfileBtn(WebDriver driver) {
		getSettings(driver).click();
	}
	public static WebElement getAvailability(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_XPATH));
	}

	public static void clickAvailability(WebDriver driver) {
		getAvailability(driver).click();
	}
	public static WebElement getNumberVersion(WebDriver driver) {
		return driver.findElement(By.xpath(NUMBERVERSION_XPATH));
	}

	public static void clickNumberVersion(WebDriver driver) {
		getNumberVersion(driver).click();
	}
	
	
	
}
