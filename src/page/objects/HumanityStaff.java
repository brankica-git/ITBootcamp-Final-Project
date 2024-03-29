package page.objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	public static final String URL="https://kompanija54.humanity.com/app/staff/list/load/true/";
	public static final String STAFF_XPATH="//a[@id='sn_staff']//span[@class='primNavQtip__inner']";
	private static final String ADD_EMPLOYEE_BTN_XPATH="//button[@id='act_primary']";
	private static final String IME_XPATH="//input[@id='_asf";
	private static final String PREZIME_XPATH="//input[@id='_asl";
	private static final String MEJL_XPATH="//input[@id='_ase";
	private static final String INPUT_END_XPATH="']";
	private static final String NEW_EMPLOYEE="//a[contains(text(),'";
	private static final String NEW_EMPLOYEE_END="')]";
	private static final String EMPLOYEES_TABLE_XPATH = "//table[contains(@class,'employeesList')]//tbody";
	private static final String SAVE_BTN_XPATH = "//button[@id='_as_save_multiple']";
	
	
	
	//check if employee is added to the list
	public static List<String> allEmployeesList(WebDriver driver) {
		List<WebElement> webList = driver.findElement(By.xpath(EMPLOYEES_TABLE_XPATH)).findElements(By.className("staff-employee"));
		List<String> strList = new ArrayList<String>();
		for(WebElement e:webList) {
			strList.add(e.getAttribute("innerHTML"));
		}
		return strList;
	}

	public static boolean newlyCreatedEmployeeExist(WebDriver driver, String name) {
		return allEmployeesList(driver).contains(name + " ");
	}
	
	//employees	
	public static WebElement getEmployees(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEE_BTN_XPATH));
	}

	public static void clickEmployees(WebDriver driver) {
		getEmployees(driver).click();	
	}
	
	//ime zaposlenog
	public static WebElement getIme(WebDriver driver, int index) {
		String xpath = IME_XPATH + Integer.toString(index) + INPUT_END_XPATH;
		return driver.findElement(By.xpath(xpath));
	}
	
	public static void inputIme(WebDriver driver, String data, int index) {
		getIme(driver, index).sendKeys(data);
		
	}

	public static void clickIme(WebDriver driver, int index) {
		getIme(driver, index).click();	
	}
	
	//prezime zaposlenog
	public static WebElement getPrezime(WebDriver driver, int index) {
		String xpath = PREZIME_XPATH + Integer.toString(index) + INPUT_END_XPATH;
		return driver.findElement(By.xpath(xpath));
	}
	
	public static void inputPrezime(WebDriver driver, String data, int index) {
		getPrezime(driver, index).sendKeys(data);
		
	}

	public static void clickPrezime(WebDriver driver, int index) {
		getPrezime(driver, index).click();	
	}
	
	//mejl
	public static WebElement getMejl(WebDriver driver, int index) {
		String xpath = MEJL_XPATH + Integer.toString(index) + INPUT_END_XPATH;
		return driver.findElement(By.xpath(xpath));
	}
	
	public static void inputMejl(WebDriver driver, String data, int index) {
		getMejl(driver, index).sendKeys(data);
		
	}

	public static void clickMejl(WebDriver driver, int index) {
		getMejl(driver, index).click();	
	}
	
	//save
	public static WebElement getSave(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_BTN_XPATH));
	}

	public static void clickSave(WebDriver driver) {
		getSave(driver).click();	
	}		
	
}