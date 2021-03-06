package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3Part1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Create Contact")).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("johnalphin");
		 driver.findElement(By.id("lastNameField")).sendKeys("ramesh");
		 driver.findElement(By.name("firstNameLocal")).sendKeys("johnn");
		 driver.findElement(By.name("lastNameLocal")).sendKeys("alphinn");
		 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		 driver.findElement(By.id("createContactForm_description")).sendKeys("Learn Selenium");
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("johnalphin21@gmail.com");
		 WebElement dropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select select=new Select(dropdown);
		 select.selectByVisibleText("New York");
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a")).click();
		 driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		 driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Important");
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	String title = driver.getTitle();
	System.out.println(title);
	
	}

}
