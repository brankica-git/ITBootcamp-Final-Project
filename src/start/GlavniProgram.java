package start;

import page.tests.HumanityAddNewEmployeeTests;
import page.tests.HumanityLoginTests;

public class GlavniProgram {

	public static void main(String[] args) {		
		try {
			HumanityLoginTests.testLogin();
			HumanityAddNewEmployeeTests.dodajZaposlenog();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Kraj");
		}
	}

}
