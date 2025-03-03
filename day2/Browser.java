package week1.day2;

//Browser.java
public class Browser {
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully: " + browserName);
		return browserName;
	}

	public void loadUrl() {
		System.out.println("Application URL loaded successfully");
	}

	public static void main(String[] args) {
     // Creating an object of Browser
		Browser browser = new Browser();
     
		String launchedBrowser = browser.launchBrowser("Google Chrome");
		System.out.println("Launched Browser: " + launchedBrowser);
		browser.loadUrl();
	}
}



