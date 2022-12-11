package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccount {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.partialLinkText("Create New Account")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anand");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raghavan");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9999999999");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("newPassword");

		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select dayValues = new Select(dayDropDown);
		dayValues.selectByVisibleText("31");
		
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthValues = new Select(monthDropDown);
		monthValues.selectByVisibleText("Feb");
		
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearValues = new Select(yearDropDown);
		yearValues.selectByVisibleText("2001");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}
}