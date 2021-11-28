package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> list= dr.findElements(By.cssSelector("[type='checkbox'"));
		dr.findElement(By.id(""));
		list.get(0).click();
		Assert.assertTrue(list.get(0).isSelected());
		list.get(0).click();
		Assert.assertFalse(list.get(0).isSelected());
		Assert.assertEquals(list.size(), 3);
		

	}

}
