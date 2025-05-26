package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(60, 80));
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(10, 40));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		String text=driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.close();
	}

}
