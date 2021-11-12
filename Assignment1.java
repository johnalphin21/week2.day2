package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[@class='_6ltg']//a[1]")).click();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Ramesh");
		driver.findElement(By.name("lastname")).sendKeys("Lakshmanan");
		driver.findElement(By.name("reg_email__")).sendKeys("rameshdpi36@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Pass1234");
		//driver.findElement(By.xpath("//div[text()='First name']/following-sibling::input")).sendKeys("John");
		//driver.findElement(By.xpath("(//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input)[2]")).sendKeys("Ramesh");
		//driver.findElement(By.xpath("(//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input)[3]")).sendKeys("6383011603");
		//driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("pass1234");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select select=new Select(day);
		select.selectByValue("24");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select select1=new Select(month);
		select1.selectByValue("11");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select select2=new Select(year);
		select2.selectByValue("1966");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
		
		

	}

}
