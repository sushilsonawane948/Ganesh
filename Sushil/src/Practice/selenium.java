package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\All driver files\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://orthosearch.molecularconnections.com/Orthosearch-beta/Home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		WebElement searchbox = driver
				.findElement(By.xpath("//input[@class='SearchBar_searchBar__1hWdk form-control']"));

		searchbox.click();
		searchbox.sendKeys("Sports medicine");
		searchbox.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//input[@id='Sports medicine194440']")).click();

		WebElement element1 = driver.findElement(
				By.xpath("//span[@class='Subject_filterCount__2uO4g form-check-label' and @for='Sports medicine']"));

		String text1 = element1.getText().trim();

		System.out.println(text1);

		int startnum1 = text1.indexOf("(");
		System.out.println(startnum1);

		int endnum1 = text1.indexOf(")");
		System.out.println(endnum1);

		String num1 = text1.substring(startnum1 + 1, endnum1);

		System.out.println(num1);
		WebElement element2 = driver.findElement(By.xpath("//label[@class='ActionBar_actionLabel__1wGlV form-label']"));

		String text2 = element2.getText().trim();
		System.out.println(text2);

		String num2 = text2.substring(15, 20);

		System.out.println(num2);

		if (num1.equals(num2)) {
			System.out.println("Matched");

		} else {
			System.out.println("Not Matched");
		}
		driver.close();
	}

}
