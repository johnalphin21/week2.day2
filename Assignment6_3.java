package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		WebElement findlink = driver.findElement(By.xpath("//a[@href='Button.html']"));
		String link = findlink.getAttribute("href");
		System.out.println(link);
		driver.findElement(By.linkText("Verify am I broken?")).click();
		Thread.sleep(3000);
		String broken = driver.getTitle();
		if (broken.contains("404")) {
			System.out.println("brokenpage");
			
		}
		else {
			System.out.println("Not a broken page");
		}
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href='../home.html'])[2]")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("How many links are available in this page?")).click();
		Thread.sleep(3000);
		List<WebElement> NoOfLinks = driver.findElements(By.tagName("a"));
		int links = NoOfLinks.size();
		System.out.println(links);
		
		
		
		
		
		
			

	}

}
