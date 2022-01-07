package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("anuvesh159@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
		String firstResultinglead = driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']")).getText();
		System.out.println(firstResultinglead);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButton'][1]")).click();
		
        String verifyTile = driver.findElement(By.xpath("//title[1]")).getText();
		System.out.println(verifyTile);
		
		if(verifyTile.equalsIgnoreCase(firstResultinglead))
		{
			System.out.println("Duplicate Lead is Same");
		}
		
		else
			
		{
			System.out.println("Duplicate Lead is not same");
		}
		
		

	}

}
