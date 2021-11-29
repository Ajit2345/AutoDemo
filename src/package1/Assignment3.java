package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment3 {

	public static void main(String[] args) {
		System.out.println("Hello Demo2 in Assignment3");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		WebDriverWait w = new WebDriverWait(dr,10);
		dr.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		dr.findElement(By.cssSelector("a[href*='loadAjax']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		String str=dr.findElement(By.cssSelector("#results")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "Process completed! This response has been loaded via the Ajax request directly from the web server, without reoading this page.");

	}

}
