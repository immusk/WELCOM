package sample;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Apsrtc {
	
		WebDriver driver = null;
		WebElement element = null;
		WebElement element1 = null;
		 
		@BeforeTest
		public void browerIntialize()
		{
		driver = new FirefoxDriver();
		driver.get("http://www.apsrtconline.in");
		system.out.println("");
		}
		
		
		@Test
		public void bookTicket() throws InterruptedException
		{
		driver.findElement(By.cssSelector("a.user")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#userName")).sendKeys("immuimran");
		driver.findElement(By.cssSelector("input#password")).sendKeys("CHINNU*143");
		driver.findElement(By.cssSelector("input.loginBtn")).click();
		element = driver.findElement(By.cssSelector("input#fromPlaceName"));
		element.sendKeys("KANDUKUR");
		Thread.sleep(1000);
		element.sendKeys(Keys.TAB);
		
		element1 = driver.findElement(By.cssSelector("input#toPlaceName"));
		element1.sendKeys("S.R.NAGAR");
		Thread.sleep(1000);
		element1.sendKeys(Keys.TAB);
		
		driver.findElement(By.cssSelector("input#txtJourneyDate")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[1]/td[5]/a")).click();
		driver.findElement(By.cssSelector("input#searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(By.xpath(".//table[@class='BoxBorder']/tbody/tr[5]/td[11]"));
		WebElement element = driver.findElement(By.xpath(".//table[@class='BoxBorder']/tbody/tr[5]/td[1]/a"));
		if(element.isDisplayed())
		{	
		System.out.println("number of seats available in service number  ========>>> "+element.getText()+ " is=====> "+ element1.getText());
		}
		
		WebElement element3 = driver.findElement(By.xpath(".//table[@class='BoxBorder']/tbody/tr[7]/td[11]"));
		WebElement element2 = driver.findElement(By.xpath(".//table[@class='BoxBorder']/tbody/tr[7]/td[1]/a"));
		if(element.isDisplayed())
		{	
		System.out.println("number of seats available in service number  ========>>> "+element2.getText()+ " is=====> "+ element3.getText());
		}
		driver.findElement(By.cssSelector("input#SrvcSelectBtnForward0")).click();
		driver.findElement(By.xpath("//td[@title='18(,S)']")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.className("logoutCss")).click();
		Thread.sleep(1000);
		
		}
		
		@AfterTest
		public void close()
		{
		driver.close();
		
		}
	
		
	}


