package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityEditStaff;
import page.objects.HumanityHome;
import page.objects.HumanityMenu;

public class HumanityAddPhotoTest {
	public static boolean addPhoto() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		
		try {
			HumanityHome.clickLogin(driver);
			Thread.sleep(1000);
			HumanityHome.inputEUser(driver, "pibavatog@free-temp.net");
			HumanityHome.inputSifra(driver, "malacoka");
			HumanityHome.clickPritisniLogin(driver);			
			Thread.sleep(3000);
			HumanityMenu.clickStaff(driver);
			Thread.sleep(2000);
			HumanityEditStaff.clickOneEmployee(driver);
			Thread.sleep(2000);
			HumanityEditStaff.clickEditDetails(driver);
			Thread.sleep(2000);
			HumanityEditStaff.setPicture(driver, "D:\\kosta-maric.jpg");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		if (HumanityEditStaff.getProfilePicture(driver).getAttribute("src").contains("https://s3.amazonaws.com/uf.shiftplanning.com/avatars/small_")) {
			driver.quit();
			System.out.println("Test add photo prosao");
			return true;
		} else {
			driver.quit();
			System.out.println("Test add photo pao");
			return false;
		}		
	}

}
