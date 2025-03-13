package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFBBrowser {
    public static void main(String[] args) {
        
        // Instantiate the ChromeDriver
        ChromeDriver fbDriver =new ChromeDriver();
        
        // Load the URL
        fbDriver.get("https://www.facebook.com/");
        
        // Maximize the browser window
        fbDriver.manage().window().maximize();
        
        // To get the title of the browser
        String webTitle = fbDriver.getTitle();
        System.out.println("The Website title is - " +webTitle);
        
        // Close the browser window
        fbDriver.quit();
    }

	
}


