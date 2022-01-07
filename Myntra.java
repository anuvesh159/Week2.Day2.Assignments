package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("desktop-main")).click();
		driver.findElement(By.className("desktop-categoryLink")).click();
		driver.findElement(By.className("desktop-navContent")).click();
		driver.findElement(By.xpath("//label[@class='vertical-filters-label common-customCheckbox']")).click();
		

	}

}
