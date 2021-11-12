package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("John");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Alphin");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("johnalphin21@gmail.com");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("6383011603");
	Thread.sleep(2000); 
	WebElement userTitle = driver.findElement(By.name("UserTitle")); 
	Select select=new Select(userTitle);
	select.selectByVisibleText("Customer Service Manager");
	Thread.sleep(1000);
	WebElement EmpType = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
	Select select1=new Select(EmpType);
	select1.selectByValue("950");
	Thread.sleep(1000);
	WebElement Cntry = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
	Select select2=new Select(Cntry);
	select2.selectByVisibleText("United States");
	Thread.sleep(1000);
	WebElement state = driver.findElement(By.xpath("//select[@name='CompanyState']"));
	Select select3=new Select(state);
	select3.selectByVisibleText("Alabama");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();
	
	

	}

}
