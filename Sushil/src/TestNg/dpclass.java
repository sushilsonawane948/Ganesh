package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dpclass {
	WebDriver driver;
	
	//*******Method-1*****
	@DataProvider
		public Object[][] DP(){
		return new Object[][]{
			{"sonawanesushil57@gmail.com","Sushil@123",
			"sonawanesushil44@gmail.com","Sushant@123"}
		};
		
	}
	//*******Method-2*****

     /* public Object[][]DP1(){
		Object[][] obj=new Object[3][2];
	
		obj[0][0]="sonawanesushil57@gmail.com"; obj[0][1]="Sushil@123";
		obj[1][0]="sonawanesushil44@gmail.com"; obj[1][1]="Sushant@123";
		obj[2][0]="sonawanesushil999@gmail.com"; obj[2][1]="Sushil@123";
		return obj;
		}*/
		

	@BeforeClass
	public void firefoxbrowser(){
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\All driver files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.mercurytravels.co.in");
		driver.manage().window().maximize();
		System.out.println("Firefox browser Open Successfully");
		
	}
	
	@Test(dataProvider="DP")

	public void logIn(String userName, String password) throws InterruptedException
	{
		WebElement customerlogin = driver.findElement(By.xpath("(//li[@class='dropdown loggedout'])[2]//span[1]"));

		Actions act = new Actions(driver);
		act.moveToElement(customerlogin).build().perform();

		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("(//a[text()='User Login'])[2]"));
		login.click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sign_user_email']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='sign_user_password']")).sendKeys(password);
		driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		
		System.out.println("Login successfully");

		
	}
	@Test
	public void logout() throws Exception{
		
		/*	Thread.sleep(4000);
		TakesScreenshot screen = ((TakesScreenshot) driver);
		File srcfile1 = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(srcfile1, new File("C:\\Users\\DUKKAR\\workspace\\Sushil\\src\\TestNg"));*/

		Thread.sleep(3000);
		WebElement welcomeUser=driver.findElement(By.xpath("(//span[@class='caret'])[6]"));
		                   
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(welcomeUser).build().perform();
		
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("(//a[text()=' Log Out'])[2]"));
	    logout.click();
		
		System.out.println("Logout successfully");
		
		Thread.sleep(4000);
	}
	

}

