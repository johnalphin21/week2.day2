package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmnet6_7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following::input")).click();
		boolean answer = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
		System.out.println(answer);
		List<WebElement> choices = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));
		int CheckboxSize=choices.size();
		System.out.println("The no of checkboxes for this :" + CheckboxSize );
		for (int i=0;i<CheckboxSize;i++) {
		choices.get(i).click();
		
			
		}
		
	}

}

