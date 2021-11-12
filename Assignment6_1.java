package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("johnalphin21@gmail.com");
		WebElement app = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input[@type='text'])[2]"));
		app.clear();
		app.sendKeys("john");
		String username = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println(username);
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input[@type='text'])[4]")).clear();
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println(enabled);
	}

}
