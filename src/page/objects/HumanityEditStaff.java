package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	public static final String URL="https://kompanija54.humanity.com/app/staff/edit/5094701/";
	private static final String EDITDETAILS_XPATH="private static final String";
	private static final String PICTURE_XPATH="//input[@id='fileupload']";
	private static final String NIKNAME_XPATH="//input[@id='nick_name']";
	
	public static WebElement getEditDetails(WebDriver driver) {
		return driver.findElement(By.xpath(EDITDETAILS_XPATH));
	}

	public static void clickEditDetails(WebDriver driver) {
		getEditDetails(driver).click();
	}
	public static WebElement getPicture(WebDriver driver) {
		return driver.findElement(By.xpath(PICTURE_XPATH));
	}

	public static void clickPicture(WebDriver driver) {
		getPicture(driver).click();
	}
	public static WebElement getNikname(WebDriver driver) {
		return driver.findElement(By.xpath(PICTURE_XPATH));
	}

	public static void clickNikname(WebDriver driver) {
		getNikname(driver).click();
	}
	public static void inputNikname(WebDriver driver, String data) {
		getNikname(driver).sendKeys(data);
	}
	
}
