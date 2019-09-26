package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.HumanityMenu;
import utility.ExcelUtils;

public class HumanityLoginTests {
	public static boolean testLogin() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		if (driver.getCurrentUrl().contains(HumanityHome.URL) == false) {
			return false;
		}
		driver.manage().window().maximize();
		
		ExcelUtils.setExcell(HumanityHome.DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);
		
		String email = ExcelUtils.getDataAt(1,0); // prvo red pa kolona
		String password = ExcelUtils.getDataAt(1,1);
		
		HumanityHome.clickLogin(driver);
		HumanityHome.inputEUser(driver, email);
		HumanityHome.inputSifra(driver, password);
		HumanityHome.clickPritisniLogin(driver);
		
		if (driver.getCurrentUrl().contains(HumanityMenu.URL) == false) {
			System.out.println("Login test prosao");
			driver.quit();
			return false;
		} else {
			System.out.println("Login test pao");
			driver.quit();
			return true;
		}
	}
}