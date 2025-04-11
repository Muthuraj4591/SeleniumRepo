package Week2.Day2.Assignment;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {	
	public static void main(String[] args) {	
		ElementFind objMethod = new ElementFind();
		
		//initialize Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Launch Facebook webpage 		
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the window using manage.window 
		driver.manage().window().maximize();
		
		//Wait for page to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click the Create new Account Button		
		WebElement createNewAccount = objMethod.identifyElement(driver,"xpath","//a[text()='Create new account']");
		createNewAccount.click();		
		
		//Wait for page to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter the value to Firstname Field
		WebElement firstName = objMethod.identifyElement(driver,"name", "firstname");
		firstName.sendKeys("Raj");
		
		//Enter the value to Surname Field
		WebElement SurName = objMethod.identifyElement(driver,"name", "lastname");
		SurName.sendKeys("Kumar");
		
		//Update the Data of Birth 
		Select birthDay = objMethod.selectIdentifyElement(driver,"id", "day");
		birthDay.selectByValue("20");
		Select birthMonth = objMethod.selectIdentifyElement(driver,"id", "month");
		birthMonth.selectByIndex(5);
		Select birthYear = objMethod.selectIdentifyElement(driver,"id", "year");
		birthYear.selectByVisibleText("2000");
		
		//Select Gender
		WebElement gender = objMethod.identifyElement(driver,"xpath","//label[text()='Male']//input[@type='radio']");
		gender.click();
		
		//Enter Mobile Number and Password
		WebElement mobNumber = objMethod.identifyElement(driver,"name","reg_email__");
		mobNumber.sendKeys("9876543210");
		WebElement password = objMethod.identifyElement(driver,"id","password_step_input");
		password.sendKeys("Testuser@1234us");
		
		//Click Signup
		WebElement signUp = objMethod.identifyElement(driver,"name","websubmit");
		signUp.click();	
		
		//Close the browser 
		driver.quit();
	}
}
