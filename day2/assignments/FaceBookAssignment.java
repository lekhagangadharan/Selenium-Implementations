package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FaceBookAssignment {

	public static void main(String[] args) {
		
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click on the Create new account button.
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("Agastya");
		
		//Enter the Surname.
		driver.findElement(By.name("lastname")).sendKeys("Anand");
		
		//Enter the Mobile number or email address.
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
		
		//Enter the New password.
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abcdefg");
		
		//Handle all three dropdowns in Date of birth
		
		//date DD
		WebElement dateDD = driver.findElement(By.name("birthday_day"));
		Select dD1=new Select(dateDD);
		dD1.selectByValue("30");
		
		//month DD
		WebElement monthDD = driver.findElement(By.name("birthday_month"));
		Select dD2 = new Select(monthDD);
		dD2.selectByVisibleText("Jul");
		
		//year DD
		WebElement yearDD = driver.findElement(By.name("birthday_year"));
		Select dD3=new Select(yearDD);
		dD3.selectByIndex(13);
		
		//Select the radio button in Gender.
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
		

	}

}
