package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3Part4 {

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
		 driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[1]")).click();
		 driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Babu");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 Thread.sleep(1000);
		 String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateLeadForm_companyName")).clear();
		 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("john");
		 driver.findElement(By.name("submitButton")).click();
		 String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 if (text2!=text) {
			 System.out.println("The changed name appears");
			
		}else {
			System.out.println("The name is not changed");
		}
		 
		 

	}

}
