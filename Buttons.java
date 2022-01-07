package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("Find position of button (x,y) :"+driver.findElement(By.xpath("//button[@id='position']")).getLocation());
		System.out.println("Find button color :"+driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println("Find the height and width :"+driver.findElement(By.id("size")).getSize());
			
		
	}

}
