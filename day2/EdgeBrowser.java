package week1.day2;

public class EdgeBrowser {
	 public static void main(String[] args) {
	     // Creating an object of Browser
	     Browser browser = new Browser();
	     
	     // Calling methods from Browser class
	     String launchedBrowser = browser.launchBrowser("Microsoft Edge");
	     System.out.println("Launched Browser: " + launchedBrowser);
	     browser.loadUrl();
	 }

}
