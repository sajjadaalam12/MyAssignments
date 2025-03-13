package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {
	
	public static void main(String[] args){

    
	ChromeDriver driver = new ChromeDriver(); // Launch the ChromeDriver.

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize(); // Launch/Open Face Book
	
	// Login Credentials
	driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Tuna@321");
	driver.findElement(By.name("login")).click();		
	
	driver.findElement(By.linkText("Find your account and log in.")).click();
	
	//To get title
	System.out.println("Current webpage title is: " + driver.getTitle());	
}
}