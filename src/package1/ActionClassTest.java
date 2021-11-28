package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver dr=new ChromeDriver();
//		dr.get("https://www.amazon.com/");
//		dr.manage().window().maximize();
//		//#nav-link-accountList
//		WebElement el=dr.findElement(By.cssSelector("#twotabsearchtextbox"));
//		Actions ac=new Actions(dr);
//		ac.moveToElement(el).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
//		ac.moveToElement(dr.findElement(By.cssSelector("#nav-link-accountList"))).contextClick().build().perform();
		
		
		String str="this is an email address od ajit Das. The email is adas0304@gmail.com.";
		str= str.substring(str.lastIndexOf(str.charAt(' ')), str.lastIndexOf(str.charAt('m')));
		System.out.println(str);
//		ac.moveToElement(dr.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
//		dr.findElement(By.xpath("//*[text()='Account']")).click();

	}

}
