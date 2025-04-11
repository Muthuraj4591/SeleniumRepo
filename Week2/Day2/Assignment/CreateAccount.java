package Week2.Day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialize Chrome Driver		
		ChromeDriver driver = new ChromeDriver();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();		
		//Find the username filed by element and pass the user name using sendkeys
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Find the Password filed by element and pass the Password using sendkeys
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the login button after provide user name and password
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//CRM/SFA link
		driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();	
		
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("MATest Account");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		Select industry=new Select(driver.findElement(By.name("industryEnumId")));
		industry.selectByValue("IND_SOFTWARE");
		
		Select ownership=new Select(driver.findElement(By.name("ownershipEnumId")));
		ownership.selectByVisibleText("S-Corporation");	
		
		Select source=new Select(driver.findElement(By.id("dataSourceId")));
		source.selectByValue("LEAD_EMPLOYEE");
		
		Select  marketingCampaign = new Select(driver.findElement(By.name("marketingCampaignId")));
		marketingCampaign.selectByIndex(5);
		
		Select stateProvince = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		stateProvince.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
				
		String accountName = driver.findElement(By.xpath("//span[contains(text(),'Test Account')]")).getText().trim();
		accountName = accountName.substring(0,accountName.length()-8);
		System.out.println(accountName);
		if(accountName.equalsIgnoreCase("MATest Account")) {
			System.out.println("Account Name updated as per our input");
		}
		else {
			System.out.println("Account Name not updated as per our input");
		}		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
		
		
	}

}
