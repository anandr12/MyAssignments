package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceLogin {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("hari.radhakrishnan@qeagle.com");
		
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("Testleaf$321");
		
		WebElement loginButton = driver.findElement(By.id("Login"));
		loginButton.click();
	}
}