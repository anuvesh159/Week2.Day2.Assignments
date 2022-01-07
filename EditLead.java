package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElement(By.linkText("Name and ID")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Aniveshu");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
		String firstResultinglead = driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']")).getText();
		System.out.println(firstResultinglead);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		WebElement companyName = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		companyName.clear();
		companyName.sendKeys("Deloitte");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String confirmChangedNameAppears = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(confirmChangedNameAppears);
		
		driver.close();
		
		
		
		/*http://leaftaps.com/opentaps/control/main
		
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)
*/
	}

}
