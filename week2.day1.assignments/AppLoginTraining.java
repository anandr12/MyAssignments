package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppLoginTraining {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		//Open Chrome and open http://leaftaps.com/opentaps
		driver.get("http://leaftaps.com/opentaps");
		
		//Find username field
		WebElement usernameField = driver.findElement(By.id("username"));
		
		//To send keys
		usernameField.sendKeys("Demosalesmanager"); 
		
		//Find password field
		WebElement passwordField = driver.findElement(By.id("password"));
		
		//To send keys
		passwordField.sendKeys("crmsfa");
		
		//Find Login button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		
		//Click Button
		loginButton.click();
	}
}