package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.HumanityMenu;

public class HumanityLoginTests {
	public static boolean testLogin() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		if (driver.getCurrentUrl().contains(HumanityHome.URL) == false) {
			return false;
		}
		driver.manage().window().maximize();
		
		HumanityHome.clickLogin(driver);
		HumanityHome.inputEUser(driver, "pibavatog@free-temp.net");
		HumanityHome.inputSifra(driver, "malacoka");
		HumanityHome.clickPritisniLogin(driver);
		if (driver.getCurrentUrl().contains(HumanityMenu.URL) == false) {
			driver.quit();
			return false;
		} else {
			driver.quit();
			return true;
		}
	}
}