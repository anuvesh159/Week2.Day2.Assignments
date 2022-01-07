package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//Am I Broke Image having Doubts
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();   	
	    }
	    
		
	}


