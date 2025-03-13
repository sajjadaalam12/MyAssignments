package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

	public class RadioButtonTest {

		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver(); //To launch ChromeDriver
			
			driver.get("https://leafground.com/button.xhtml"); // launch URL
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following-sibling::button/span[text()='Click']")).click();
			System.out.println("Current webpage title: " + driver.getTitle()); // Display Current Web page title  
			driver.navigate().back(); // TO navigate back
			
			// TO check the button status
			System.out.println("Disable button status: " + driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following-sibling::button")).isEnabled());
			
			// To check the position of submit button
			System.out.print("Find the position of Submit button : ");
			System.out.println(driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']/following-sibling::button")).getLocation());
			
			// To Check the background color of save button
			System.out.print("Background color of Save button: ");
			System.out.println(driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following-sibling::button")).getCssValue("background-color"));
			
			// To check the Height and width of the button
			System.out.print("Find the height and width of this button's size: ");	
			System.out.println(driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following-sibling::button")).getSize());
			
			driver.close();
		}

	}
