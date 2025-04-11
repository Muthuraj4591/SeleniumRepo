package Week2.Day2.Assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
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
		
			
		//Create Lead
		driver.findElement(By.xpath("//a[contains(text(), 'Leads')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'Create Lead')]")).click();
		
		//Find FirstName, LastName, CompanyName and Title to create a Lead
		
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Testing org");
		
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("TestUserFirst");

		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Last");
		
		WebElement title = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		title.sendKeys("Mr");
		
		driver.findElement(By.name("submitButton")).click();
				
		//Verify Title is displayed Correctly
		WebElement updatedTitle = driver.findElement(By.id("viewLead_generalProfTitle_sp"));
		String ted = updatedTitle.getText().trim();
		System.out.println(ted);
		if(ted.equalsIgnoreCase("Mr")) {
			System.out.println("Title updated as per our input");
		}
		else {
			System.out.println("Title is not updated as per our input");
		}		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}

}
