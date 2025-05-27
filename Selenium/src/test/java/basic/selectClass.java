package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 WebElement drop = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		 Select s = new Select(drop);
		 s.selectByIndex(1);
		 Thread.sleep(2000);
		 s.selectByVisibleText("Option3");
		 Thread.sleep(2000);
		 s.selectByValue("option2");
		 Thread.sleep(2000);
		 s.selectByContainsVisibleText("n3");
		 Thread.sleep(2000);
		 List<WebElement> a = s.getOptions();
		 
		 for(int i=0;i<=a.size();i++)
		 {
			System.out.println(a.get(i).getText()); 
		 }
		 
		 
		 
		 
		 
	}

}
