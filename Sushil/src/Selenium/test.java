package Selenium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	public static String countString (String writeString){
		if(writeString != null){
			
			char [] countStr = writeString.toCharArray();
			char [] resultDigit = new char [countStr.length];
			int indexNo =0;
			for(int i =0 ; i < countStr.length ; i++){
				if(Character.isDigit(countStr[i])){
					resultDigit[indexNo++] = countStr[i];
				}
				
			}
			String result = new String(resultDigit);
			return result;
		}
		else
			return null;
	}
	
	
	
	public static String CountMed(String med){
		if(med != null){
			char [] resultDigit = new char [med.trim().length()];
			int indexNo=0 ;
			for(int i=0 ; i < med.length(); i++){
				if(Character.isDigit(med.charAt(i))){
					resultDigit[indexNo++] = med.charAt(i);
				}
			}
			String result = new String(resultDigit);
			return result;
		}
		else{
			return null;
		}
		
	}
	
	public static String CountMed2(String med){
		if(med != null){
			int length = med.trim().length();
			char [] resultDigit = new char [length];
			int indexNo=0 ;
			for(int i=0 ; i < length; i++){
				char medChar = med.charAt(i);
				if(Character.isDigit(medChar)){
					resultDigit[indexNo] = medChar;
					indexNo++;
				}
			}
			String result = new String(resultDigit);
			return result.trim();
		}
		else{
			return null;
		}
		
	}
	
	//*******Pattern REGEX***********//
public static void extractDigit(String xpath){
	Pattern p1 = Pattern.compile("[0-9]+");
	Matcher m1 = p1.matcher(xpath);
	if(m1.find()){
		System.out.println("DIgits are : " + m1.group());
	}
}
	
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "c:\\Users\\All driver files\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://orthosearch.molecularconnections.com/Orthosearch-beta/Home");
//		WebElement search = driver.findElement(By.xpath("//div[@class='input-group']/input"));
//		driver.manage().window().maximize();
//		search.sendKeys("Sports medicine");
//		search.sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//button[contains(text(),'Advanced Search')]/i"));
//		
//		Thread.sleep(3000);
//	WebElement sports =driver.findElement(By.xpath("//input[@type='checkbox'and @value='Sports medicine']"));
//	sports.click();
//	Thread.sleep(3000);
//	String sportsCount = driver.findElement(By.xpath("//span[@for='Sports medicine']")).getText();
	
	
////countString(sportsCount);
//	System.out.println(CountMed2(sportsCount));
	extractDigit("abd123pqr456");
//	System.out.println("|"+sportsCount+"|");

	
	}
	
	

}
