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
	private static final String SIGNOUT_XPATH="//a[contains(text(),'Sign Out')]";
	private static final String NUMBERVERSION_XPATH="//div[@id='humanityAppVersion']//b";
	
	// Profile Button
	public static WebElement getProfileBtn(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILEBTN_XPATH));
	}
	public static void clickProfileBtn(WebDriver driver) {
		getProfileBtn(driver).click();
	}
	
	// Profile
	public static WebElement getProfil(WebDriver driver) {
		return driver.findElement(By.xpath(PROFIL_XPATH));
	}
	public static void clickProfile(WebDriver driver) {
		getProfil(driver).click();
	}
	
	// Settings
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_XPATH));
	}
	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}
	
	// Availability
	public static WebElement getAvailability(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_XPATH));
	}
	public static void clickAvailability(WebDriver driver) {
		getAvailability(driver).click();
	}
	
	// Sign Out
	public static WebElement getSignOut(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNOUT_XPATH));
	}
	public static void clickSignOut(WebDriver driver) {
		getSignOut(driver).click();
	}
	
	// Version
	public static WebElement getNumberVersion(WebDriver driver) {
		return driver.findElement(By.xpath(NUMBERVERSION_XPATH));
	}
	
}
