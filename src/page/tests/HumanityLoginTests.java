package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;

public class HumanityLoginTests {

	public static void main(String[] args) {
		public static boolean testLogin() {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get(HumanityHome.URL);
			if (driver.getCurrentUrl().contains(HumanityHome.URL) == false) {

			}
		
	}

}
