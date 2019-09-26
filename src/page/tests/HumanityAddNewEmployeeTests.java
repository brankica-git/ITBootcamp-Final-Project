package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.HumanityMenu;
import page.objects.HumanityStaff;
import utility.ExcelUtils;

public class HumanityAddNewEmployeeTests {
	public static boolean dodajZaposlenog() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		
		ExcelUtils.setExcell(HumanityHome.DATA_SOURCE);
		ExcelUtils.setWorkSheet(1);
		
		HumanityHome.clickLogin(driver);
		HumanityHome.inputEUser(driver, "pibavatog@free-temp.net");
		HumanityHome.inputSifra(driver, "malacoka");
		HumanityHome.clickPritisniLogin(driver);
		
		Thread.sleep(2000);
		
		HumanityMenu.clickStaff(driver);
		
		Thread.sleep(2000);
		
		HumanityStaff.clickEmployees(driver);
		
		Thread.sleep(2000);
		
		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
			HumanityStaff.inputIme(driver, ExcelUtils.getDataAt(i,0), i);
			HumanityStaff.inputPrezime(driver, ExcelUtils.getDataAt(i,1), i);
			HumanityStaff.inputMejl(driver, ExcelUtils.getDataAt(i,2), i);
		}
		
		HumanityStaff.clickSave(driver);
		
		Thread.sleep(2000);
		
		HumanityMenu.clickStaff(driver);
		
		Thread.sleep(2000);
		
		Boolean isError = false;
		
		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
			String ime = ExcelUtils.getDataAt(i,0);
			String prezime = ExcelUtils.getDataAt(i,1);
			String imeIprezime = ime + " " + prezime;
			
			if (HumanityStaff.newlyCreatedEmployeeExist(driver, imeIprezime)) {
				isError = false;
			} else {
				isError = true;
				break;
			}
		}
		
		if (isError) {
			driver.quit();
			System.out.println("Test add employee pao");
			return false;
		} else {
			// driver.quit();
			System.out.println("Test add employee prosao");
			return true;
		}
	}		
	
}
