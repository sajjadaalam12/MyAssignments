package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
		// Launch the ChromeDriver.
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		// To get title
		System.out.println("Title: " + driver.getTitle());
		
		// Passing login credentials
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		// Toggling to another tab
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		// TO create form by filling personal details
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sajjad");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Aalam");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Test Engineer");
		driver.findElement(By.className("smallSubmit")).click();
		
		// To display title
		System.out.println("Current webpage title is: " + driver.getTitle());
		
		// Closing the Browser
		//driver.quit();
	}

}
