package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6_5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement DropDown1 = driver.findElement(By.id("dropdown1"));
		Select select1=new Select(DropDown1);
		select1.selectByIndex(2);
		WebElement DropDown2 = driver.findElement(By.name("dropdown2"));
		Select select2=new Select(DropDown2);
		select2.selectByVisibleText("UFT/QTP");
		WebElement DropDown3 = driver.findElement(By.id("dropdown3"));
		Select select3=new Select(DropDown3);
		select3.selectByValue("2");
		WebElement DropDown4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select select4=new Select(DropDown4);
		List<WebElement> numbers = select4.getOptions();
		int size = numbers.size();
		System.out.println(size-1);
		WebElement DropDown5 = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/select[1]"));
		Select select5=new Select(DropDown5);
		select5.selectByIndex(2);
		WebElement DropDown6 = driver.findElement(By.xpath("(//option[@value='2']/parent::select)[6]"));
		Select select6=new Select(DropDown6);
		select6.selectByIndex(2);
	}

}
