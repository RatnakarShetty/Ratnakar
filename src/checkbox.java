import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox {

	public static void main(String[] args) {
		/*
		 * for (int i = 1; i <= 5; i++) { for (int j = 1; j <= i - 1; j++) {
		 * System.out.print(" "); } for (int k = 0; k >= i; k++) {
		 * System.out.print("*"); } System.out.println(); }
		 */

		/*
		 * for (int i = 1; i <= 5; i++) {
		 * 
		 * for (int j = 4; j >= i; j--) { System.out.print(""); }
		 * 
		 * for (int k = 1; k <= i; k++) { System.out.print("*"+""); }
		 * 
		 * System.out.println(); }
		 */

		/*
		 * for (int i = 5; i >= 1; i--) { for (int j = 1; j <= i - 1; j++) {
		 * System.out.println(" "); } for (int k = 0; k >= i; k--) {
		 * System.out.println(k); } System.out.println(); }
		 */

		for (int i = 1; i <= 5; i++) {

			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*" + "");
			}
			System.out.println();
		}

	}

}
