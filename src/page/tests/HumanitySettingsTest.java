package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.HumanityMenu;
import page.objects.HumanitySettings;

public class HumanitySettingsTest {
	public static boolean settingsTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		
		HumanityHome.clickLogin(driver);
		HumanityHome.inputEUser(driver, "pibavatog@free-temp.net");
		HumanityHome.inputSifra(driver, "malacoka");
		HumanityHome.clickPritisniLogin(driver);
		
		Thread.sleep(5000);
		
		HumanityMenu.clickSettingsBtn(driver);
		
		if (driver.getCurrentUrl().contains(HumanitySettings.URL) == false) {
			System.out.println("Odaberi padajuci meni test pao - nije uspelo otvaranje strane Settings");
			return false;
		}
		
		Thread.sleep(2000);
		
		try {
			HumanitySettings.inputCountry(driver, "India");
			HumanitySettings.inputLanguage(driver, "Spanish");
			HumanitySettings.inputTime(driver, "12 hour");
			System.out.println("Padajuci meni- test prosao");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Padajuci meni - nisu uspele izmene dropdown-a za country, language ili vreme");
			return false;
		} finally {
			Thread.sleep(6000);
			driver.quit();
		}
	}

}
