package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountAssignment {

	public static void main(String[] args) {
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("guest");		
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		
		//Enter a username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click the "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the "Accounts" tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("John");
		
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Select "ComputerSoftware" as the industry.
		WebElement industryDDown = driver.findElement(By.name("industryEnumId"));
		
		Select dropDownOne = new Select(industryDDown);
		dropDownOne.selectByVisibleText("Computer Software");
		
		//Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement ownershipDDown = driver.findElement(By.name("ownershipEnumId"));
		Select dropDownTwo = new Select(ownershipDDown);
		dropDownTwo.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as the source using SelectByValue.
		WebElement sourceDDown = driver.findElement(By.id("dataSourceId"));
		Select dropDownThree = new Select(sourceDDown);
		dropDownThree.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement marketingDDown = driver.findElement(By.id("marketingCampaignId"));
		Select dropDownFour = new Select(marketingDDown);
		dropDownFour.selectByIndex(6);
		
		//Select "Texas" as the state/province using SelectByValue.
		WebElement stateDDown = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropDownFive = new Select(stateDDown);
		dropDownFive.selectByValue("TX");
		
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verify that the account name is displayed correctly.
		String title = driver.getTitle();
		System.out.println("Title of the create account page- " + title);
		
		
		
		//Close the browser window.
		driver.close();

		
		
		
		
	}

}
