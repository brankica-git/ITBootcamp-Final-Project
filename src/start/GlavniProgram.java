package start;

import java.util.Scanner;

import page.tests.HumanityAddNewEmployeeTests;
import page.tests.HumanityAddPhotoTest;
import page.tests.HumanityLoginTests;
import page.tests.HumanitySettingsTest;

public class GlavniProgram {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner in = new Scanner(System.in); 
		int izbor;	
		
		do {
			System.out.println("Unesi 1 za test login-a");
			System.out.println("Unesi 2 za test dodavanja zaposlenog");
			System.out.println("Unesi 3 za test dodavanja slike");
			System.out.println("Unesi 4 za test settingsa");
			System.out.println("Unesi 0 za izlaz");
			
			izbor = in.nextInt(); 
			
			switch (izbor) {
				case 1:
					HumanityLoginTests.testLogin();
					break;
				case 2:
					HumanityAddNewEmployeeTests.dodajZaposlenog();
					break;
				case 3:
					HumanityAddPhotoTest.addPhoto();
					break;
				case 4:
					HumanitySettingsTest.settingsTest();
					break;
				case 0: 
					System.out.println("Izlaz");
					break;
				default:
					System.out.println("Nevalidan unos");
					break;
			}			
		} while (izbor != 0);
		
		System.out.println("Kraj");
	}

}
