package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement button = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		button.click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aniveshu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Karanam");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123456789");
		WebElement drop = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dd = new Select(drop);
		dd.selectByValue("12");
		
		WebElement drop1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dd1 = new Select(drop1);
		dd1.selectByValue("1");
		
		WebElement drop2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dd2 = new Select(drop2);
		dd2.selectByValue("1997");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();		
		
		
	

	}

}
