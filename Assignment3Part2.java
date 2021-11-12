package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3Part2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("95");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(2000);
		 WebElement Id = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']"));
		 String LeadID=Id.getText();
		 System.out.println(LeadID);
		 
		
driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[@class='subM	enuButtonDangerous']")).click();
driver.findElement(By.linkText("Delete")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(LeadID);
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
String text = driver.findElement(By.xpath("//div[@id='ext-gen383']//following-sibling::div")).getText();
System.out.println(text);
driver.close();




	}

}
