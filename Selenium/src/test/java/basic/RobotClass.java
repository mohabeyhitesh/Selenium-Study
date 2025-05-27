package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement drop=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		drop.click();
		Robot r = new Robot();
		for( int i=0;i<=2;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
	}

}
