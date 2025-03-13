package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateDropdown {

	public static void main(String[] args){
		
		ChromeDriver driver = new ChromeDriver(); // Launch the ChromeDriver.
		
		driver.get("http://leaftaps.com/opentaps/control/main"); // To open the concerned web site
		driver.manage().window().maximize();
		
		System.out.println("Title: " + driver.getTitle()); // To get title
		
		// Login Credentials
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();	
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click(); // To create Lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sajjad");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Aalam");
		
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select selSourceDD = new Select(sourceDD);
		selSourceDD.selectByIndex(5);
		
		WebElement marketingDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select selMarketingDD = new Select(marketingDD);
		selMarketingDD.selectByVisibleText("Affiliate Sites");
		
		WebElement ownerShipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select selOwnerShipDD = new Select(ownerShipDD);
		selOwnerShipDD.selectByValue("OWN_PARTNERSHIP");
		
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Current webpageTitle: "+ driver.getTitle()); // To display title
	}

}