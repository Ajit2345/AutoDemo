package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.cleartrip.com/");
		dr.findElement(By.cssSelector(".flex.flex-middle.p-relative.homeCalender")).click();
		Thread.sleep(2000L);

		dr.findElement(By.cssSelector("[aria-selected='true']")).click();
		WebElement el = dr
				.findElement(By.xpath("//*[@class='row pt-3 pb-4 p-relative px-4']//div[@class='mb-4']/select"));
		Select s1 = new Select(el);
		s1.selectByVisibleText("2");
		el = dr.findElement(By.xpath("//*[text()='Children']/following-sibling::select"));
		Select s2 = new Select(el);
		s2.selectByVisibleText("1");
		el = dr.findElement(By.xpath("//*[text()='Infants']/following-sibling::select"));
		Select s3 = new Select(el);
		s3.selectByVisibleText("1");
		dr.findElement(By.cssSelector("Strong.pr-1")).click();
		dr.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys("Apple");
		dr.findElement(By.xpath("//button[text()='Search flights']")).click();
		String str1 = dr.findElement(By.xpath("//*[contains(@class,'bg-error-600')]/span")).getText();
		System.out.println(str1);
		Assert.assertEquals(str1, "Select Departure and Arrival airports/cities.");

	}

}
