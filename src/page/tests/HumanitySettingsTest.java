package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.HumanityMenu;
import page.objects.HumanitySettings;

public class HumanitySettingsTest {
	public static boolean settingsTest() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		
		HumanityHome.clickLogin(driver);
		HumanityHome.inputEUser(driver, "pibavatog@free-temp.net");
		HumanityHome.inputSifra(driver, "malacoka");
		HumanityHome.clickPritisniLogin(driver);
		
		HumanityMenu.clickSettingsBtn(driver);
		if (driver.getCurrentUrl().contains(HumanitySettings.URL) == false) {
			System.out.println("Add Photo test pao - nije uspelo otvaranje strane Settings");
			return false;
		}
		
		try {
			HumanitySettings.inputCountry(driver, "Norway");
			HumanitySettings.inputLanguage(driver, "Spanish");
			HumanitySettings.inputTime(driver, "12 hour");
			System.out.println("Add Photo test prosao");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Add Photo test pao - nisu uspele izmene dropdown-a za country, language ili vreme");
			return false;
		} finally {
			driver.quit();
		}
	}

}
