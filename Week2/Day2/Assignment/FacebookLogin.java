package Week2.Day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		ElementFind objMethod = new ElementFind();
		
		//initialize Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Launch Facebook webpage 		
		driver.get("https://www.facebook.com/");
		
		//Maximize the window using manage.window 
		driver.manage().window().maximize();
		
		//Wait for page to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		objMethod.identifyElement(driver, "id", "email").sendKeys("testlead.2023@gmail.com");
		objMethod.identifyElement(driver, "id", "pass").sendKeys("Tuna@321");
		objMethod.identifyElement(driver, "name", "login").click();
		objMethod.identifyElement(driver, "xpath", "//a[text()='Not you?']").click();
		objMethod.identifyElement(driver, "xpath", "//a[text()='Find your account and log in.']").click();
		if(driver.getTitle().contains("Forgotten Password")){
			System.out.println("Title Verified Successfully");
		}
		else {
			System.out.println("Title Verification unsuccessful");
		}
		driver.quit();
	}

}
