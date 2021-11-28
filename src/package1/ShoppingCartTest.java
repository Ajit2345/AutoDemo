package package1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ShoppingCartTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr= new ChromeDriver();
//		dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebDriverWait w= new WebDriverWait(dr, 5);
		dr.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		w.until(ExpectedConditions.visibilityOfAllElements(dr.findElements(By.cssSelector("h4.product-name"))));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("h4.product-name")));
		String itemsNeeded[]= {"Brocolli","Cucumber", "Beetroot","Carrot"};
		addItems(dr,itemsNeeded, w);
		
	}
	public static void addItems(WebDriver dr, String[] itemsNeeded, WebDriverWait w) {
		List<String> itemsNeededList=Arrays.asList(itemsNeeded);
		List<WebElement> items=dr.findElements(By.cssSelector("h4.product-name"));
		int j=0;
		for(int i=0;i<items.size();i++) {
			WebElement element= items.get(i);
			String name=element.getText().split("-")[0].trim();
			System.out.println(name);
			if(itemsNeededList.contains(name)) {
				dr.findElements(By.xpath("//div[@class='product-action']/button")).get(items.indexOf(element)).click();
				j++;
				if(j==itemsNeeded.length)break;				
			}		
		}
		
//		dr.findElement(By.xpath("//*[contains(text(),'Cucumber')]/following-sibling::div[2]/button")).click();
		String str=dr.findElement(By.xpath("//*[@class='cart-info']//Strong")).getText();
		System.out.println(str);
		dr.findElement(By.cssSelector("a.cart-icon img")).click();
		dr.findElement(By.xpath("//div[@class='cart-preview active']/div/button")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		dr.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		dr.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		String str2=dr.findElement(By.cssSelector("span.promoInfo")).getText();
		System.out.println(str2);
		Assert.assertEquals(str2, "Code applied ..!");
	}

}
