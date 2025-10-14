package package001;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSeleniumproject {
	WebDriver driver;
	@Test
	public void Test001() throws InterruptedException, IOException {
		
		driver = new ChromeDriver();
		driver.get("https://demoblaze.com/#");
		WebDriverWait wait = new WebDriverWait(driver,(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='cat']")).isDisplayed();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("username");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@id='nameofuser']")).isDisplayed();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='contcont']//a[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='Nexus 6']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body")).isDisplayed();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Add to cart']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@id='cartur']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='orderModal']")));
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("sohail");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Telangana");
		driver.findElement(By.xpath("//input[@id='card']")).sendKeys("1234567891000");
		driver.findElement(By.xpath("//input[@id='month']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2025");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();
		driver.close();
	}
	
	
	
	
}
