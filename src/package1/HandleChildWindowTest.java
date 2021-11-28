package package1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleChildWindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		dr.get("https://rahulshettyacademy.com/loginpagePractise/#");
		dr.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> handle = dr.getWindowHandles();
		Iterator<String> it= handle.iterator();
		String parentWin=it.next();
		String childWin=it.next();
		dr.switchTo().window(childWin);
		String email=dr.findElement(By.cssSelector("p.im-para.red")).getText();
		System.out.println(email);
		email=email.split("at")[1].trim().split(" ")[0];
		System.out.println(email);
		dr.switchTo().window(parentWin);
		dr.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		dr.findElement(By.id("password")).sendKeys("pass");
		dr.findElement(By.xpath("(//*[@class='checkmark'])[1]")).click();
		Select s=new Select(dr.findElement(By.cssSelector("select.form-control")));
		s.selectByIndex(1);
		dr.findElement(By.cssSelector("#terms")).click();
		dr.findElement(By.id("signInBtn")).click();
		

	}

}
