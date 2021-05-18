package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelRun {

	WebDriver driver;
	@Test
	public void OpenBrowser1() throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\All driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://orthosearch.molecularconnections.com/Orthosearch-beta/Home");
		WebElement search = driver.findElement(By.xpath("//div[@class='input-group']/input"));
		driver.manage().window().maximize();
		search.sendKeys("Sports medicine");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[contains(text(),'Advanced Search')]/i"));
		
		Thread.sleep(3000);
	WebElement sports =driver.findElement(By.xpath("//input[@type='checkbox'and @value='Sports medicine']"));
	sports.click();
	String title1=sports.getText().replaceAll("[^0-9]", "");
    System.out.println(title1);
		
	}
	
	
}
