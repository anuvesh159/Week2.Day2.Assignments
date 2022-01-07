package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UipathAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(" //input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath(" //input[@id='password']")).sendKeys("leaf@12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log Out")).click();
		

	}

}
