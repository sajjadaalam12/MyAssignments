package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnXPath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		//load the URL		
		driver.get("http://leaftaps.com/opentaps/control/login");		
		driver.manage().window().maximize();
		
		 String title = driver.getTitle(); // To get title
		 System.out.println(title); // To display the title
		 
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 WebElement pwrd = driver.findElement(By.id("password"));
		 pwrd.sendKeys("crmsfa");
		 
		 //click on login
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.partialLinkText("CRM")).click();
		 //Click on the "Accounts" tab
		 driver.findElement(By.linkText("Accounts")).click();
		 //click on Create Account
		 driver.findElement(By.linkText("Create Account")).click();
		 //Enter an account name
		 driver.findElement(By.id("accountName")).sendKeys("leaftaps");
		 //Enter a description
		 driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester");
		 //Enter a Number Of Employees 
		 driver.findElement(By.id("numberEmployees")).sendKeys("1");
		 //Enter a Site Name
		 driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		 
		 //click source drop down
		 WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 //instantiate my select class
		 Select sel=new Select(sourcedd);
		 sel.selectByIndex(4);
		 
		 //click Marketing Campaign 
		 WebElement mark = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select dd1=new Select(mark);
		 dd1.selectByVisibleText("Automobile");
		 
		 //click industry DD
		 WebElement industryDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select dd2=new Select(industryDD);
		 dd2.selectByValue("OWN_CCORP");
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println("Current webpageTitle: "+ driver.getTitle()); // To display title
			 
	}

}





