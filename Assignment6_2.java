package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6_2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		driver.navigate().back();
		WebElement pos = driver.findElement(By.xpath("//button[@id='position']"));
		Point position = pos.getLocation();
		System.out.println(position);
		WebElement colour = driver.findElement(By.xpath("//button[@id='color']"));
		String color = colour.getCssValue("background-color");
		System.out.println(color);
		WebElement height = driver.findElement(By.xpath("//button[@id='size']"));
		Dimension size = height.getSize();
		System.out.println(size);
		
		
		
		
	}

}
