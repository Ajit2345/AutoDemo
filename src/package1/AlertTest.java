package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		dr.findElement(By.id("name")).sendKeys("Kumar");
		dr.findElement(By.xpath("//*[@id='confirmbtn']")).click();
		Alert al= dr.switchTo().alert();
		Thread.sleep(3000L);
		
		System.out.println(al.getText());
		al.dismiss();
		
		

	}

}
