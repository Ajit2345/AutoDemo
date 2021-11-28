package package1;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Demo1 {
	
	public static void main(String args[]) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();		
		dr.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(dr.getTitle());
		dr.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
//		if(dr.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).getAttribute("style").contains("0.5")) {
//			System.out.println("Disable");
//			Assert.assertTrue(true);
//		}
//		else {
//			Assert.assertTrue(false);
//		}
		dr.findElement(By.xpath("//input[contains(@id,'originStation1_CTXT')]")).click();
		Thread.sleep(3000L);
		dr.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000l);
		dr.findElements(By.xpath("//a[@value='MAA']")).get(1).click();
		dr.findElement(By.xpath("//a[contains(@class, 'ui-state-highlight')]")).click();
		dr.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000l);
		for(int i=1; i<5;i++)
		dr.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		Assert.assertEquals(dr.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "5 Adult");
		
//		Thread.sleep(2000l);
		Select sl= new Select(dr.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		sl.selectByValue("USD");
		dr.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).click();
		
		dr.findElement(By.xpath("//input[contains(@id,'btn_FindFlights')]")).click();
		
		
//		Thread.sleep(100);
//		dr.close();
	}

}

