package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6_6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']//input[@id='yes']")).click();
		WebElement defaultValue = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]//input[@value='1']"));
		String text = defaultValue.getText();
		System.out.println("Default selected button: " + text);
		
		
	}

}
