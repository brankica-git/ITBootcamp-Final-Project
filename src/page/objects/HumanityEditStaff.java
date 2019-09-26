package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	public static final String URL="https://kompanija54.humanity.com/app/staff/edit/5094701/";
	private static final String ONE_EMPLOYEE_XPATH="//a[contains(text(),'Milos Obrovac')]";
	private static final String EDITDETAILS_XPATH="//a[contains(text(),'Edit Details')]";
	private static final String PICTURE_XPATH="//input[@id='fileupload']";
	private static final String PROFILE_PICTURE_XPATH="//img[@id='userAvatar5100195']";
	private static final String NIKNAME_XPATH="//input[@id='nick_name']";
	private static final String SAVE_EMPLOYEE_BTN_XPATH="//button[@id='act_primary']";
	
	// One Employee
	public static WebElement getOneEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(ONE_EMPLOYEE_XPATH));
	}	
	public static void clickOneEmployee(WebDriver driver) {
		getOneEmployee(driver).click();
	}
	
	// Edit Details
	public static WebElement getEditDetails(WebDriver driver) {
		return driver.findElement(By.xpath(EDITDETAILS_XPATH));
	}
	public static void clickEditDetails(WebDriver driver) {
		getEditDetails(driver).click();
	}
	
	// Picture
	public static WebElement getPicture(WebDriver driver) {
		return driver.findElement(By.xpath(PICTURE_XPATH));
	}
	public static void setPicture(WebDriver driver, String picturePath) {
		getPicture(driver).sendKeys(picturePath);
	}
	
	// Profile Picture
	public static WebElement getProfilePicture(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_PICTURE_XPATH));
	}
	
	// Nickname
	public static WebElement getNikname(WebDriver driver) {
		return driver.findElement(By.xpath(NIKNAME_XPATH));
	}
	public static void inputNikname(WebDriver driver, String data) {
		getNikname(driver).sendKeys(data);
	}
	
	// Save Employee
	public static WebElement getSaveEmployeeBtn(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE_BTN_XPATH));
	}
	public static void clickSaveEmployeeBtn(WebDriver driver) {
		getSaveEmployeeBtn(driver).click();
	}
}
