package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\All driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		
		//WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		//WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		WebElement login = driver.findElement(By.xpath("//input[@class='btn btn-success']"));

		/*password.clear();
		username.clear();
		username.sendKeys("admin");
		password.sendKeys("admin123");
		*/
		
		//****************************
		
		login.getText();
		//Thread.sleep(1000);

		//Actions act=new Actions(driver);
		//act.moveToElement(login).click().perform();
		
		
		

	}

}
