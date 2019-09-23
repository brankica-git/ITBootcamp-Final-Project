package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	public static final String URL="https://kompanija54.humanity.com/app/staff/list/load/true/";
	private static final String EMPLOYESS_XPATH="//button[@id='act_primary']";
	private static final String IME_XPATH="//input[@id='_asf1']";
	private static final String PREZIME_XPATH="//input[@id='_asl1']";
	private static final String MEJL_XPATH="//input[@id='_ase1']";
	
	//employees
	
	public static WebElement getEmployees(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYESS_XPATH));
	}

	public static void clickEmployees(WebDriver driver) {
		getEmployees(driver).click();	
	}
	
	//ime zaposlenog
	public static WebElement getIme(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYESS_XPATH));
	}
	public static void inputIme(WebDriver driver,String data) {
		getIme(driver).sendKeys(data);
		
	}

	public static void clickIme(WebDriver driver) {
		getIme(driver).click();	
	}
	//prezime zaposlenog
	public static WebElement getPrezime(WebDriver driver) {
		return driver.findElement(By.xpath(PREZIME_XPATH));
	}
	public static void inputPrezime(WebDriver driver,String data) {
		getPrezime(driver).sendKeys(data);
		
	}

	public static void clickPrezime(WebDriver driver) {
		getPrezime(driver).click();	
	}
	//mejl
	public static WebElement getMejl(WebDriver driver) {
		return driver.findElement(By.xpath(MEJL_XPATH));
	}
	public static void inputMejl(WebDriver driver,String data) {
		getMejl(driver).sendKeys(data);
		
	}

	public static void clickMejl(WebDriver driver) {
		getMejl(driver).click();	
	}
	
	
		
	
}
