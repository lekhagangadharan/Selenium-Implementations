package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadAssignment {

	public static void main(String[] args) {
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("guest");		
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		
		//Enter a username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter a FirstName.
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lekha");
		
		//Enter a LastName.
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gangadharan");
		
		//Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ScotiaBank");
		
		//Enter a Title .
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SDET");
		
		//Click the "Create Lead" button.
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verify that the Title is displayed correctly.
		String title = driver.getTitle();
		System.out.println(title);
		
		//Close the browser window.
		driver.close();

	}

}
