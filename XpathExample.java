package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathExample {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("http://leaftaps.com/opentaps/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		
	    userName.sendKeys("DemoSalesManager");
	    
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	    
	    driver.findElement(By.xpath("//input[@value= 'Login']")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	    
	    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Wipro");
	    
	    driver.findElement(By.xpath("//input[@class='createLeadForm_firstName']")).sendKeys("Aniveshu");
	    
	    driver.findElement(By.xpath("//input[contains(@class,'input')and @name= 'lastname']")).sendKeys("Karanam");
	    
	    
	    WebElement drop = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    
	    Select createLeadForm_dataSourceId = new Select (drop);
	    
	    createLeadForm_dataSourceId.selectByVisibleText("Conference");//1at method
	    
	    createLeadForm_dataSourceId.selectByValue("LEAD_EMPLOYEE");
	    
	    
	    driver.findElement(By.name("submitButton")).click();
	    

	}

}
