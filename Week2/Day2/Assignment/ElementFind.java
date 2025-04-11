package Week2.Day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementFind {

	//public static ChromeDriver driver = new ChromeDriver();
	//This method used to identify the webElemnt based the attribute and Value passed
	public WebElement identifyElement(ChromeDriver driver, String attribute, String value)
	{
		WebElement element = null;		
		if(attribute.toLowerCase()=="id")
		{
			element = driver.findElement(By.id(value));
		}
		else if (attribute.toLowerCase()=="classname") {
			element = driver.findElement(By.className(value));
		}
		else if (attribute.toLowerCase()=="cssselector") {
			element = driver.findElement(By.cssSelector(value));
		}
		else if (attribute.toLowerCase()=="linktext") {
			element = driver.findElement(By.linkText(value));
		}
		else if (attribute.toLowerCase()=="name") {
			element = driver.findElement(By.name(value));
		}
		else if (attribute.toLowerCase()=="partiallinktext") {
			element = driver.findElement(By.partialLinkText(value));
		}
		else if (attribute.toLowerCase()=="tagname") {
			element = driver.findElement(By.tagName(value));
		}
		else{
			element = driver.findElement(By.xpath(value));
		}
		return element;
	}
	public Select selectIdentifyElement(ChromeDriver driver, String attribute, String value)
	{
		Select element = null;		
		if(attribute.toLowerCase()=="id")
		{
			element = new Select(driver.findElement(By.id(value)));
		}
		else if (attribute.toLowerCase()=="classname") {
			element = new Select(driver.findElement(By.className(value)));
		}
		else if (attribute.toLowerCase()=="cssselector") {
			element = new Select(driver.findElement(By.cssSelector(value)));
		}
		else if (attribute.toLowerCase()=="linktext") {
			element = new Select(driver.findElement(By.linkText(value)));
		}
		else if (attribute.toLowerCase()=="name") {
			element = new Select(driver.findElement(By.name(value)));
		}
		else if (attribute.toLowerCase()=="partiallinktext") {
			element = new Select(driver.findElement(By.partialLinkText(value)));
		}
		else if (attribute.toLowerCase()=="tagname") {
			element = new Select(driver.findElement(By.tagName(value)));
		}
		else{
			element = new Select(driver.findElement(By.xpath(value)));
		}
		return element;
	}

}
