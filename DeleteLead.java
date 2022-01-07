package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneAreaCode")).sendKeys("Null");
		driver.findElement(By.name("phoneNumber")).sendKeys("8610220898");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']")).getText();
		System.out.println(leadID);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
		String verifyMessage = driver.findElement(By.xpath("//div[@class='x-paging-info'][@id='ext-gen437']")).getText();
		
		if(verifyMessage==leadID)
		{
			System.out.println("ID is Not Deleted");
		}
		else {
			System.out.println("Successfully Deleted");
		}
	
		

	}

}
