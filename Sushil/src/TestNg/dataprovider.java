package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	WebDriver driver;

	// *******Method-1*****
	/*@DataProvider
	public Object[][] data_provider() {
		return new Object[][] {
				{"sonawanesushil57@gmail.com","Sushil@123","sonawanesushil44@gmail.com","Sushant@123"}};
	}*/
	//*****Method-2*****

	  @DataProvider public Object[][]data_provider(){ 
		  Object[][] obj=new Object[3][2];
	  
	  
	  obj[0][0]="sonawanesushil57@gmail.com"; obj[0][1]="Sushil@123";
	  obj[1][0]="sonawanesushil44@gmail.com"; obj[1][1]="Sushant@123";
	  obj[2][0]="sonawanesushil999@gmail.com"; obj[2][1]="Sushil@123"; 
	  
	  return obj; 
	  }
	 
	
	@BeforeSuite
	public void chromedriver() {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\All driver files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.mercurytravels.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println("Chrome browser Open Successfully");

	}
	@BeforeMethod
	public void open_dbconnection() {

		System.out.println("db connection open");
	}

	@Test(dataProvider="data_provider")

	public void login(String userName, String password) throws InterruptedException
	{	
		System.out.println("in");
		Thread.sleep(10000);
		WebElement customerlogin = driver.findElement(By.xpath("(//a[text()=' Customer Login '])[2]"));
		String sushil=customerlogin.getText();
		System.out.println(sushil);
		
		Actions act = new Actions(driver);

		act.moveToElement(customerlogin).build().perform();

		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("(//a[text()='User Login'])[2]"));
		login.click();
		
		System.out.println("out");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sign_user_email']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='sign_user_password']")).sendKeys(password);
		driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		Thread.sleep(4000);
	}

	@Test
	public void logout() throws Exception {

		Thread.sleep(3000);
		WebElement welcomeUser = driver.findElement(By.xpath("(//a[text()= 'Welcome, Sushil '])[2]"));

		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(welcomeUser).build().perform();

		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("(//a[text()=' Log Out'])[2]"));
		logout.click();

		System.out.println("Logout successfully");

		Thread.sleep(4000);
	}

	@AfterMethod
	public void deleteallcookies(){

		driver.manage().deleteAllCookies();
		System.out.println("All cookies deleted");
	}

	@AfterTest
	public void close_dbconnection() {

		System.out.println("db connection closed");
	}

}
