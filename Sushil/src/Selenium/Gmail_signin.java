package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Gmail_signin {
		static WebDriver driver;

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\All driver files\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	
                // Entering Username and Password to Login

		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("sonawanesushil57@gmail.com");      //Entering Username
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();    // clicking on next button
		
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Sushil@9495");     //Entering Password
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();   //clicking on next button
		
		// Home page appeared.
		
		driver.findElement(By.xpath("//*[@id=\":kr\"]/div/div")).click();  // clicking on Compose 
		

		// To Compose Email.
		
		driver.findElement(By.xpath("//*[@id=\":qi\"]")).sendKeys("recipient email");   // Entering Recipients mail id
		
		driver.findElement(By.xpath("//*[@id=\":q0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\":q0\"]")).sendKeys("Test Mail");    // Entering Subject
		
		driver.findElement(By.xpath("//*[@id=\":sc\"]")).click();    // Entering Email Body
		driver.findElement(By.xpath("//*[@id=\":sc\"]")).sendKeys("Hi, \n This is automated mail.");
		
		driver.findElement(By.xpath("//*[@id=\":op\"]")).click();   // Clicking on send button
		
		
		// To checking mail in sent box
		
		driver.findElement(By.xpath("//*[@id=\":lc\"]/div")).click();
		
		
		// To Logout
		
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
		
		
		driver.close();
			
		
	}

}
