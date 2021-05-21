package TestNg;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class parameterization_chrome {

	WebDriver driver;

	@BeforeSuite

	public void OpenBrowser() {

		System.out.println("OpenBrowser method in BeforeSuite");
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\All driver files\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Chrome Browser setup succesfully");
	}

	@BeforeTest
	public void enterURL() {
		System.out.println("Enter URL method in BeforeTest");

		driver.get("http://www.mercurytravels.co.in");

		System.out.println("URL entered succesfully");

	}

	@BeforeClass
	public void maximizewindow() {
		System.out.println("Enter maximizewindow method in Beforeclass");

		driver.manage().window().maximize();

		System.out.println("chrome browser maximized succesfully");

	}

	@BeforeMethod
	public void getcookies() {
		System.out.println("Enter getcookies method in Beforemethod");

		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName());
		}
	}

	@Test
	@Parameters({"username","password"})
	public void login(String user,String pass) throws InterruptedException {

		// Thread.sleep(5000);

		WebElement customerlogin = driver.findElement(By.xpath("(//li[@class='dropdown loggedout'])[2]"));

		Actions act = new Actions(driver);
		act.moveToElement(customerlogin).build().perform();

		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("(//a[text()='User Login'])[2]"));
		login.click();

		//***close window-popup program***
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Frame count " + size);
		Thread.sleep(8000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@aria-label='close']")).click();

		driver.switchTo().defaultContent();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='sign_user_email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='sign_user_password']")).sendKeys(pass);
		driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		//System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void screenshot() throws IOException, InterruptedException {    
			
		Thread.sleep(3000);
		TakesScreenshot screen = ((TakesScreenshot) driver);
		File srcfile = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(srcfile, new File("C:\\Users\\DUKKAR\\workspace\\Sushil\\src\\TestNg"));

		System.out.println("Screenshot done successfully");
	     
	}
	     
	@AfterClass
	public void deleteallcookies(){
		
		driver.manage().deleteAllCookies();
		System.out.println("All cookies deleted");
	}
	@AfterTest
	public void close_dbconnection(){
		
		System.out.println("db connection closed");
	}
	@AfterSuite
	public void closebrowser()throws InterruptedException, IOException{
	
			Thread.sleep(4000);
		TakesScreenshot screen = ((TakesScreenshot) driver);
		File srcfile1 = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(srcfile1, new File("C:\\Users\\DUKKAR\\workspace\\Sushil\\src\\TestNg"));

		Thread.sleep(3000);
		WebElement welcomeUser=driver.findElement(By.xpath("(//span[@class='caret'])[6]"));
		                    //or
		//(//li[@class='dropdown loggedin']//span)[3]
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(welcomeUser).build().perform();
		
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("(//a[text()=' Log Out'])[2]"));
        logout.click();
		
		System.out.println("Logout successfully");
	}

}
