package week2.day2;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		WebElement where = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String attribute = where.getAttribute("href");
		System.out.println(attribute);
		
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String broken = driver.getTitle();
		System.out.println(broken);
		if(broken.contains("HTTP Status 404 – Not Found"))
			System.out.println("Verify Link is Broken");
		else
			System.out.println("Verify Link is Broken");
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		WebElement links = driver.findElement(By.tagName("link"));
		System.out.println("How many links are available in this page?:"+links);
		
		

	}

}
