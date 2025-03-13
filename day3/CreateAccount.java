package week2.day3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		
		// Launch the ChromeDriver.
		ChromeDriver driver = new ChromeDriver();
		
		// load the url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
        
		// To get and print the title
		String title = driver.getTitle(); 
		System.out.println(title);
		 
		// Login credentials
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 WebElement pwrd = driver.findElement(By.id("password"));
		 pwrd.sendKeys("crmsfa");
		 
		  //click on login
		  driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.partialLinkText("CRM")).click(); //Click on the "Accounts" tab 
		 driver.findElement(By.linkText("Accounts")).click(); //click on Create Account 
		 driver.findElement(By.linkText("Create Account")).click();
		 //Enter an account name
		 driver.findElement(By.id("accountName")).sendKeys("leaftaps"); //Enter a description 
		 driver.findElement(By.name("description")).
		 sendKeys("Selenium Automation Tester"); //Enter a Number Of Employees
		 driver.findElement(By.id("numberEmployees")).sendKeys("1"); //Enter a Site Name 
		 driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		 
		 //Click the "Create Account" button
		 driver.findElement(By.className("smallSubmit")).click(); 
		 
		 // To close the browser
		 driver.close();
		  
	}

}