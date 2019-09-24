package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.HumanityMenu;
import page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTests {
	public static boolean dodajZaposlenog() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);

		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		
		HumanityHome.clickLogin(driver);
		HumanityHome.inputEUser(driver, "pibavatog@free-temp.net");
		HumanityHome.inputSifra(driver, "malacoka");
		HumanityHome.clickPritisniLogin(driver);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		HumanityMenu.clickStaff(driver);
		
	
		
		HumanityStaff.clickEmployees(driver);
		
		HumanityStaff.inputIme(driver, "Kosta");
		HumanityStaff.inputPrezime(driver, "Maric");
		HumanityStaff.inputMejl(driver, "kosta.kole@gmail.com");
		HumanityStaff.clickSave(driver);
		
		HumanityMenu.clickStaff(driver);
		
		if (HumanityStaff.newlyCreatedEmployeeExist(driver, "Kosta Maric")) {
			driver.quit();
			System.out.println("Test add employee prosao");
			return true;
		} else {
			driver.quit();
			System.out.println("Test add employee pao");
			return false;
		}		
	}		
	
}
