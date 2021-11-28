package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SalesforceTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver dr= new FirefoxDriver();
		dr.get("https://login.salesforce.com/");
		String str=dr.findElement(By.cssSelector(".label.usernamelabel")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "Username");

	}

}
