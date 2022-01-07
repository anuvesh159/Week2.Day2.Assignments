package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[text()='VB']/input")).click();
        Thread.sleep(3000);
        
        WebElement Selenium  = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input"));
		boolean checked = Selenium.isSelected();
		System.out.println("Confirm Selenium is checked:"+checked);
        
        Thread.sleep(3000);
        WebElement checkBox = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[2]"));
        if(checkBox.isSelected()) {
 		
        	checkBox.click();
       	 }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='Option 1']/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Option 2']/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Option 3']/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Option 4']/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Option 5']/input")).click();
        
	}

}
