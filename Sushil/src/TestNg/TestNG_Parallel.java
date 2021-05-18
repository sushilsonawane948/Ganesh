package TestNg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestNG_Parallel {
	WebDriver driver;
	@Test 
	public void chromebrowser(){
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\All driver files\\chromedriver.exe");
		System.out.println("The thread ID for chrome is" +Thread.currentThread().getId());
		 driver = new ChromeDriver();
			System.out.println("Chrome Browser open succesfully");
			driver.get("https://www.demoqa.com");
String s="s";
String s1="s";
System.out.println(s.equals(s1));



	}
	@Test 
	public void firefoxbrowser() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\All driver files\\Gecko Driver\\geckodriver.exe");
		System.out.println("The thread ID for firefox is" +Thread.currentThread().getId());
		driver = new FirefoxDriver();
		System.out.println("Firefox Browser open succesfully");
		driver.get("https://www.demoqa.com");
	}
/*
	@Test 
	public void openBrowser() {
		driver.get("https://www.demoqa.com");
		SoftAssert softassert = new SoftAssert();
		String originalTitle = driver.getTitle();
		String expectedTitle = "ToolsQA";

		softassert.assertEquals(originalTitle, expectedTitle, "GET EXACT TEXT");
		softassert.assertAll();
	
		System.out.println("Launching Google Chrome browser"); 
	}
*/
}
}