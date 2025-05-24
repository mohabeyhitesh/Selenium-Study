package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws Exception
	{ 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
//		driver.findElement(By.id("email")).sendKeys("hitesh");
//		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("hitesh");
//		driver.findElement(By.name("email")).sendKeys("hitesh");
//		driver.findElement(By.cssSelector("#fname"));
//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.partialLinkText("Log")).click();
		
//		Xpath
		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hitesh");
		
//		Dynamic Xpath 
		
//		driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).click();
//		driver.findElement(By.xpath("//input[starts-with(@name,'em')]")).sendKeys("hitesh");
		
//		Xpath and / or
		
//		driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("hitesh");
//		driver.findElement(By.xpath("//input[@id='email' or @name='email']")).sendKeys("hitesh");
		
		
		
		
		
		
	}

}
