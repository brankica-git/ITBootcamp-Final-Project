package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {
	public static final String URL="https://kompanija54.humanity.com/app/dashboard/";
	private static final String TABLA_XPATH="//a[@id='sn_dashboard']//span[@class='primNavQtip__inner']";
	private static final String PLANNING_XPATH="//a[@id='sn_schedule']//span[@class='primNavQtip__inner']";
	private static final String CLOCK_XPATH="//p[contains(text(),'Time Clock')]";
	private static final String LEAVE_XPATH="//p[@class='primNavQtip__itemName'][contains(text(),'Leave')]";
	private static final String TRAINING_XPATH="//a[@id='sn_training']//span[@class='primNavQtip__inner']";
	private static final String STAFF_XPATH="//a[@id='sn_staff']";
	private static final String PAYROLL_XPATH="//i[@class='primNavQtip__icon icon-payroll']";
	private static final String REPORTS_XPATH="//i[@class='primNavQtip__icon icon-chart']";
	private static final String SETTINGS_BTN_XPATH="//a[@id='sn_admin']";

	
	// Dashboard	
	public static WebElement getTabla(WebDriver driver) {
		return driver.findElement(By.xpath(TABLA_XPATH));
	}	
	public static void clickTabla(WebDriver driver) {
		getTabla(driver).click();	
	}
	
	// Shift Planning
	public static WebElement getPlanning(WebDriver driver) {
		return driver.findElement(By.xpath(PLANNING_XPATH));
	}
	public static void clickPlanning(WebDriver driver) {
		getPlanning(driver).click();	
	}
	
	// Time Clock
	public static WebElement getClock(WebDriver driver) {
		return driver.findElement(By.xpath(CLOCK_XPATH));
	}
	public static void clickClock(WebDriver driver) {
		getClock(driver).click();	
	}
	
	// Leave
	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_XPATH));
	}
	public static void clickLeave(WebDriver driver) {
		getLeave(driver).click();	
	}
	
	// Training
	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_XPATH));
	}
	public static void clickTraining(WebDriver driver) {
		getTraining(driver).click();	
	}
	
	// Staff
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XPATH));
	}
	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();	
	}
	
	// Payroll
	public static WebElement getPayroll(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_XPATH));
	}
	public static void clickPayroll(WebDriver driver) {
		getPayroll(driver).click();	
	}
	
	// Reports
	public static WebElement getReports(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_XPATH));
	}
	public static void clickReports(WebDriver driver) {
		getReports(driver).click();	
	}
	
	// Settings
	public static WebElement getSettingsBtn(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_BTN_XPATH));
	}
	public static void clickSettingsBtn(WebDriver driver) {
		getSettingsBtn(driver).click();
	}
	
	
	
}
